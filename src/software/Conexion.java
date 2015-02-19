package software;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author sena
 */
public class Conexion {

    private String Driver;
    private String Bd;
    private String Server;
    private String Url;
    private String User;
    private String Pass;
    //VARIABLE PARA LA CONEXION DE TIPO CONNECTION
    private Connection conex;

    public Conexion(String motor, String driver, String servidor, String bd, String user, String pass) {
        this.Driver = driver;
        this.Bd = bd;
        this.Server = servidor;
        this.User = user;
        this.Pass = pass;

        //DISTINGUIMOS ENTRE LAS DIFERENTES DB
        try {
            Class.forName(this.Driver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener el driver \n" + ex);
        }

        try {
            //INDICAMOS EL DRIVER A UTILIZAR, EN ESTE CASO ESTARA CONTENIDO EN UNA VARIABLE DE TIPO (String).
            switch (motor) {
                case "sqlserver":
                    this.Url = "jdbc:sqlserver://" + this.Server + ";dataBaseName = " + this.Bd + "; user= " + this.User + "; password= " + this.Pass + ";";
                    System.out.println(Url);
                    conex = DriverManager.getConnection(this.Url);
                    if (conex != null) {
                        System.out.println("Conexion establecida :)");
                    } else {
                        System.out.println("Conexion fallida :(");
                    }
                    break;
                case "mysql":
                    this.Url = "jdbc:mysql://" + this.Server + "/" + this.Bd;
                    System.out.println(Url);
                    conex = DriverManager.getConnection(Url, this.User, this.Pass);

                    if (conex != null) {
                        System.out.println("Conexion establecida :)");
                    } else {
                        System.out.println("Conexion fallida :(");
                    }
                    break;
                case "oracle":
                    this.Url = "jdbc:oracle:thin:@" + this.Server + ":1521:XE";
                    conex = DriverManager.getConnection(Url, this.Bd, this.Pass);

                    if (conex != null) {
                        System.out.println("Conexion establecida :)");
                    } else {
                        System.out.println("Conexion fallida :(");
                    }
                    break;

                default:
                    System.out.println("Motor de base de datos no reconocido");
            }

        } catch (Exception ex) {
            System.out.println("Error al establecer la conexion \n" + ex);
        }
    } //FIN DE CONSTRUCTOR

    public Connection conectar() {
        return this.conex;
    }


    public boolean update(String tabla, String campos, String condicion, Object[] valores) {
        //INSTANCIAMOS NUESTRA CLASE PREPARED STATEMENT
        PreparedStatement pstm;
        //VARIABLE BOOLEANA QUE SERA TRUE SI SE EJECUTA CORRECTAMENTE EL CODIGO, DE LO CONTRARIO SERA FALSE
        boolean resultado = false;

        //PREPARANDO CONSULTA
        String sentencia = "UPDATE " + tabla + " SET ";
        String[] camp = campos.split(",");

        //PREPARANDO CONSULTA 
        for (int i = 0; i < campos.split(",").length; i++) {
            sentencia += camp[i] + " =?";
            if (i + 1 < campos.split(",").length) {
                sentencia += ", ";
            }
        }
        //PREPARANDO CONSULTA
        sentencia += " WHERE " + condicion;

        //bloque try donde se ejecutara la sentencia
        try {
            pstm = conex.prepareStatement(sentencia);
            //SICLO FOR DONDE SE AGREGAN LOS VALORES QUE ESPERA LA CONSULTA (PARAMETROS)
            for (int i = 0; i < campos.split(",").length; i++) {
                System.out.println(i + 1 + ", " + valores[i]);
                pstm.setObject(i + 1, valores[i]);
                
            } //FIN FOR
            pstm.execute();
            resultado = true;
        } catch (Exception ex) {
            System.out.println("Error al ejecutar sentencia update \n" + ex);
        }

        System.out.println(sentencia);

        return resultado;
    } //FIN DE METODO UPD
    
    
     public Object[][] consulta(String tabla, String campos, String condicion) {
        int registros = 0;
        String colname[] = campos.split(",");

        //CONSULTAS SQL
        String q = "SELECT " + campos + " FROM " + tabla;
        String q2 = "SELECT COUNT(*) as total FROM " + tabla;
        if (condicion != null) {
            q += "WHERE " + condicion;
            q2 += " WHERE " + condicion;
        }
        //EJECUTAMOS LA SEGUNDA CONSULTA (q2) PARA OBTENER INFORMACION DE LA CONSULTA
        try {
            PreparedStatement pstm = conex.prepareStatement(q2);
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la consulta de informacion (q2)\n" + ex);
        }

        //CREAMOS UNA MATRIZ CON LAS FILAS Y COLUMNAS REQUERIDAS
        //DONDE REGISTROS SERAN LAS FILAS DE LA MATRIZ Y CAMPOS SERAN LAS COLUMNAS
        Object[][] data = new String[registros][campos.split(",").length];
        //EJECUTAMOS LA CONSULTA (q) Y LLENAMOS LA MATRIZ "OBJECT" CON LOS DATOS DE LA CONSULTA
        try {
            PreparedStatement pstm = conex.prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            

            //PROCEDEMOS A LLENAR LA MATRIZ LUEGO DE HABER REALIZADO LA CONSULTA
            int i = 0;
            while (res.next()) {
                for (int j = 0; j <= campos.split(",").length - 1; j++) {
                    data[i][j] = res.getString(colname[j].trim());
                }
                i++;
            }
            res.close();
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la consulta (q) \n" + ex);
        }
        return data;
    }
    //____________________________________________________________________________________________________FIN DE METODO CONSULTA

    
    
    //METODO DESCONECTAR
    public void desconectar() {
        conex = null;
        if (conex == null) {
            System.out.println("¡ Desconectado !");
        }
    }

} //FIN DE LA CLASE
