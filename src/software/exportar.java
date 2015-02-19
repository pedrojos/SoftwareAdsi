/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author sena
 */
public class exportar {

    private String ruta;

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public boolean verificarExistencia(ArrayList<aprendiz> aprendices) {
//        Conexion con = new Conexion("mysql", "com.mysql.jdbc.Driver", "localhost", "adsi35", "root", "");
//        String sql1 = "SELECT * FROM datos";

        return aprendices.size() > 0;
    }

    public void especificarRuta(JFrame form) {
        //Crear un objeto FileChooser
        JFileChooser fc = new JFileChooser();
        //Mostrar la ventana para abrir archivo y recoger la respuesta
        //En el parámetro del showOpenDialog se indica la ventana
        //  al que estará asociado. Con el valor this se asocia a la
        //  ventana que la abre.

        int respuesta = fc.showSaveDialog(form);
        //Comprobar si se ha pulsado Aceptar
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            //Crear un objeto File con el archivo elegido
            File archivoElegido = fc.getSelectedFile();
            //Mostrar el nombre del archvivo en un campo de texto

            this.setRuta(archivoElegido.getPath() + ".xls");

        }
        System.out.println("Ruta:" + this.getRuta());
    }

    public void crearHoja(String nombreHoja, ArrayList<aprendiz> datos) {

        File file = new File(this.getRuta());
        int row = 1, row2 = 0;
        //formato fuente para el contenido contenido
        WritableFont wf = new WritableFont(WritableFont.ARIAL, 12, WritableFont.NO_BOLD);
        WritableCellFormat cf = new WritableCellFormat(wf);

        //Interfaz para una hoja de cálculo
        WritableSheet excelSheet = null;
        WritableWorkbook workbook = null;

        //Establece la configuración regional para generar la hoja de cálculo
        WorkbookSettings wbSettings = new WorkbookSettings();
        wbSettings.setLocale(new Locale("en", "EN"));

        try {
            workbook = Workbook.createWorkbook(file, wbSettings);
        } catch (IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        workbook.createSheet(nombreHoja, 0);
        excelSheet = workbook.getSheet(0);

                // PreparedStatement pstm = conex.prepareStatement(sql);
        //ResultSet res = pstm.executeQuery();
        // System.out.println("obteniendo registros.....Listo");
        for (aprendiz res : datos) {

            Label tipo = new Label(0, row2, ("TIPO DOCUMENTO"), cf);
            Label num = new Label(1, row2, ("N° DOCUMENTO"), cf);
            Label nombr = new Label(2, row2, ("NOMBRE"), cf);
            Label apell = new Label(3, row2, ("APELLIDO"), cf);
            Label fecha = new Label(4, row2, ("FECHA NACIMIENTO"), cf);
            Label dir = new Label(5, row2, ("DIRECCION"), cf);
            Label tel = new Label(6, row2, ("TELEFONO"), cf);
            Label cel = new Label(7, row2, ("CELULAR"), cf);
            Label cor = new Label(8, row2, ("CORREO"), cf);
            Label est = new Label(9, row2, ("ESTADO"), cf);
            Label pag = new Label(10, row2, ("PAGINA PERSONAL"), cf);

            Label tip = new Label(0, row, res.getTdoc(), cf);
            Label numero = new Label(1, row, (res.getNdoc()), cf);
            Label nombre = new Label(2, row, res.getName(), cf);
            Label ap = new Label(3, row, res.getLastname(), cf);
            Label fe = new Label(4, row, res.getFnac(), cf);
            Label direccion = new Label(5, row, res.getAddress(), cf);
            Label tele = new Label(6, row, res.getTelephone(), cf);
            Label celu = new Label(7, row, res.getCellphone(), cf);
            Label correo = new Label(8, row, res.getEmail(), cf);
            Label es = new Label(9, row, res.getEstado(), cf);
            Label pagina = new Label(10, row, res.getPagperson(), cf);
            row += 1;

            try {
                excelSheet.addCell(tipo);
                excelSheet.addCell(num);
                excelSheet.addCell(nombr);
                excelSheet.addCell(apell);
                excelSheet.addCell(fecha);
                excelSheet.addCell(dir);
                excelSheet.addCell(tel);
                excelSheet.addCell(cel);
                excelSheet.addCell(cor);
                excelSheet.addCell(est);
                excelSheet.addCell(pag);

                excelSheet.addCell(tip);
                excelSheet.addCell(numero);
                excelSheet.addCell(nombre);
                excelSheet.addCell(ap);
                excelSheet.addCell(fe);
                excelSheet.addCell(direccion);
                excelSheet.addCell(tele);
                excelSheet.addCell(celu);
                excelSheet.addCell(correo);
                excelSheet.addCell(es);
                excelSheet.addCell(pagina);

            } catch (WriteException ex) {
                System.err.println(ex.getMessage());
            }
        }

        //Escribe el archivo excel en disco
        try {
            workbook.write();
            workbook.close();
            //  System.out.println("Escribiendo en disco....Listo");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (WriteException ex) {
            System.err.println(ex.getMessage());
        }

        JOptionPane.showMessageDialog(null, "DATOS EXPORTADOS EXITOSAMENTE");

    }        // TODO add your handling code here:

}

