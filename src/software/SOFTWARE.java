/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

/**
 *
 * @author sena
 */
public class SOFTWARE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here LOL
        aprendiz ap = new aprendiz(true);
        //EJEMPLO NEW CONEXION ("MOTOR DE BD", "NOMBRE DRIVER", "SERVIDOR", "NOMBRE BD", "USUARIO", "PASSWORD")
        // Conexion obj = new Conexion("mysql", "com.mysql.jdbc.Driver","localhost", "Adsi35", "root", "toor");
        try {
            ap.data();
        } catch (Exception ex) {
            System.out.println("Error data \n" + ex.getMessage());
        }
        
        datos.main(args);

//        int id = 1081;
//        int telefono = 12345;
//        int cell = 54321;
//        
//        ap = new aprendiz(id,"CC","1995-12-04","PEDRO","JIMENEZ OCHOA","CARRERA 5E",telefono,cell,"PJJIMENEZ12","WWW.PETER.COM","ACTIVO");
//        
//        ap.insertar();
//        
    }

}
