package software;

import java.util.ArrayList;

/**
 *
 * @author sena
 */
class aprendiz {

    static ArrayList<aprendiz> vec = new ArrayList<>();

//           
    private String ndoc;
    private String tdoc;
    private String fnac;
    private String name;
    private String lastname;
    private String address;
    private String telephone;
    private String cellphone;
    private String email;
    private String pagperson;
    private String estado;

    public aprendiz(String tid, String id, String nom, String ape, String fechan, String dir, String tel, String cel, String cor, String est, String pagina) {
        this.ndoc = id;
        this.tdoc = tid;
        this.fnac = fechan;
        this.name = nom;
        this.lastname = ape;
        this.cellphone = cel;
        this.telephone = tel;
        this.email = cor;
        this.address = dir;
        this.estado = est;
        this.pagperson = pagina;
    }

    public aprendiz(boolean ob) {
        if (ob == true) {

            Conexion obj = new Conexion("mysql", "com.mysql.jdbc.Driver", "localhost", "Adsi35", "root", "1234");

            Object[][] datos;
            String campos = "TIPO_DOCUMENTO,N_DOCUMENTO, NOMBRE, APELLIDO,FECHA_NACIMIENTO,DIRECCION,TELEFONO,CELULAR,CORREO,ESTADO,PAGINA_PERSONAL";
            datos = obj.consulta("datos", campos, null);
            if (datos.length > 0) {
                System.out.println("Datos obtenidos");
                for (int i = 0; i < datos.length; i++) {
                    this.tdoc = datos[i][0].toString();
                    this.ndoc = datos[i][1].toString();
                    this.name = datos[i][2].toString();
                    this.lastname = datos[i][3].toString();
                    this.fnac = datos[i][4].toString();
                    this.address = datos[i][5].toString();
                    this.telephone = datos[i][6].toString();
                    this.cellphone = datos[i][7].toString();
                    this.email = datos[i][8].toString();
                    this.estado = datos[i][9].toString();
                    this.pagperson = datos[i][10].toString();

                    vec.add(new aprendiz(this.tdoc, this.ndoc, this.name, this.lastname, this.fnac, this.address, this.telephone, this.cellphone, this.email, this.estado, this.pagperson));
                }

            }
            obj.desconectar();
        }

    }

    public int upd() {
        Conexion obj = new Conexion("mysql", "com.mysql.jdbc.Driver", "localhost", "Adsi35", "root", "1234");
        Object[] vect1 = {this.tdoc, this.name, this.lastname, this.fnac, this.address, this.telephone, this.cellphone, this.email, this.estado, this.pagperson, this.ndoc}; //GUARDA LOS VALORES QUE SE LE ASIGNARAN A LOS CAMPOS
        if (obj.update("datos", "TIPO_DOCUMENTO, NOMBRE, APELLIDO,FECHA_NACIMIENTO,DIRECCION,TELEFONO,CELULAR,CORREO,ESTADO,PAGINA_PERSONAL", "N_DOCUMENTO = '" + this.ndoc + "'", vect1)) {
            obj.desconectar();
            return 1;
        } else {
            obj.desconectar();
            return 2;
        }

    }

    public void data() {

    }

    public void buscar(int num) {
        try {
            for (int i = 0; i < vec.size(); i++) {
                if (Integer.parseInt(vec.get(i).ndoc) == num) {
                    this.tdoc = vec.get(i).tdoc;
                    this.ndoc = vec.get(i).ndoc;
                    this.name = vec.get(i).name;
                    this.lastname = vec.get(i).lastname;
                    this.fnac = vec.get(i).fnac;
                    this.address = vec.get(i).address;
                    this.telephone = vec.get(i).telephone;
                    this.cellphone = vec.get(i).cellphone;
                    this.email = vec.get(i).email;
                    this.estado = vec.get(i).estado;
                    this.pagperson = vec.get(i).pagperson;

                }
            }

        } catch (Exception ex) {
            System.out.println("Error en operación modificar \n" + ex.getMessage());
        }

    }
    
    public void vaciar(){
        this.tdoc = null;
        this.ndoc = null;
        this.fnac = null;
        this.name = null;
        this.lastname = null;
        this.address = null;
        this.telephone = null;
        this.cellphone = null;
        this.email = null;
        this.estado = null;
        this.pagperson = null;
    }

    public String getNdoc() {
        return ndoc;
    }

    public String getTdoc() {
        return tdoc;
    }

    public String getFnac() {
        return fnac;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getEmail() {
        return email;
    }

    public String getPagperson() {
        return pagperson;
    }

    public String getEstado() {
        return estado;
    }
}
