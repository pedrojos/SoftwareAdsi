package software;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class datos extends javax.swing.JFrame {

    aprendiz ap = new aprendiz(null, null, null, null, null, null, null, null, null, null, null);
    static String est = null;

    /**
     * Creates new form datos
     */
    public datos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Estado = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        tipodoc = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        fecha = new javax.swing.JLabel();
        txtnacimiento = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        nom = new javax.swing.JLabel();
        ape = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        celular = new javax.swing.JLabel();
        txtcel = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        direccion = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        txtweb = new javax.swing.JTextField();
        pagina = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        cmbtipo = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        rbtactivo = new javax.swing.JRadioButton();
        rbtinactivo = new javax.swing.JRadioButton();
        btnmodificar = new javax.swing.JButton();
        btnexportar = new javax.swing.JButton();
        btnagenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adsi 35");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel1.setText("DATOS APRENDICES");

        Numero.setText("Numero De Documento");

        tipodoc.setText("Tipo De Documento");

        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        txtNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumFocusLost(evt);
            }
        });
        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumKeyReleased(evt);
            }
        });

        fecha.setText("Fecha De Nacimiento");

        nom.setText("Nombres");

        ape.setText("Apellidos");

        telefono.setText("Telefono");

        celular.setText("Celular");

        direccion.setText("Direccion");

        email.setText("Correo Electronico");

        pagina.setText("Pagina Web Personal");

        estado.setText("Estado");

        btnguardar.setForeground(new java.awt.Color(0, 153, 0));
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnconsultar.setForeground(new java.awt.Color(0, 153, 0));
        btnconsultar.setText("CONSULTAR");

        btneliminar.setForeground(new java.awt.Color(0, 153, 0));
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        cmbtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----------", "CEDULA", "TARJETA IDENTIDAD" }));
        cmbtipo.setToolTipText("");

        Estado.add(rbtactivo);
        rbtactivo.setText("Activo");

        Estado.add(rbtinactivo);
        rbtinactivo.setText("Inactivo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rbtactivo)
                .addGap(18, 18, 18)
                .addComponent(rbtinactivo)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtactivo)
                    .addComponent(rbtinactivo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnmodificar.setForeground(new java.awt.Color(0, 153, 0));
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnexportar.setForeground(new java.awt.Color(0, 153, 0));
        btnexportar.setText("Exportar");
        btnexportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportarActionPerformed(evt);
            }
        });

        btnagenda.setForeground(new java.awt.Color(0, 153, 0));
        btnagenda.setText("Agenda");
        btnagenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Numero)
                            .addComponent(tipodoc)
                            .addComponent(fecha)
                            .addComponent(email)
                            .addComponent(nom)
                            .addComponent(ape)
                            .addComponent(telefono)
                            .addComponent(celular)
                            .addComponent(direccion))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtdir, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtcel, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txttel, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtnacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtNum, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(cmbtipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnguardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnconsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmodificar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btneliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pagina)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtweb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnagenda, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnexportar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Numero)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipodoc)
                    .addComponent(cmbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha)
                    .addComponent(txtnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ape)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono)
                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celular)
                    .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion)
                    .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pagina)
                    .addComponent(txtweb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(estado))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btneliminar)
                    .addComponent(btnconsultar)
                    .addComponent(btnmodificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexportar)
                    .addComponent(btnagenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void txtNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumFocusLost
        // TODO add your handling code here:
        //LOST FOCUS


    }//GEN-LAST:event_txtNumFocusLost

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:

        if (rbtactivo.isSelected() == true) {
            est = "Activo";
        } else if (rbtinactivo.isSelected() == true) {
            est = "Inactivo";
        }
        colocar();

        int n = JOptionPane.showConfirmDialog(null, "Realmente Desea Modificar Este Aprendiz?", "Verificacion", JOptionPane.YES_NO_OPTION);

        if (n == JOptionPane.YES_OPTION) {
            if (ap.upd() == 1) {
                JOptionPane.showMessageDialog(null, "Datos Modificados");
                ap.refreh();
            } else {
                JOptionPane.showMessageDialog(null, "No se modificaron los datos, por favor verifique el numero de identidad");
            }
        }

    }//GEN-LAST:event_btnmodificarActionPerformed

    private void txtNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {

                if (txtNum.getText() != null) {
                    //CONSULTAMOS
                    ap.buscar(Integer.parseInt(txtNum.getText()));
                    if (ap.getName() != null) {
                        if (ap.getTdoc().trim().equals("Cedula") || ap.getTdoc().trim().equals("CEDULA")) {
                            cmbtipo.setSelectedIndex(1);
                        } else {
                            cmbtipo.setSelectedIndex(2);
                        }

                        txtnacimiento.setText(ap.getFnac());
                        txtnombre.setText(ap.getName());
                        txtapellido.setText(ap.getLastname());
                        txttel.setText(ap.getTelephone());
                        txtcel.setText(ap.getCellphone());
                        txtdir.setText(ap.getAddress());
                        txtcorreo.setText(ap.getEmail());
                        txtweb.setText(ap.getPagperson());
                        if (ap.getEstado().trim().equals("Activo")) {
                            rbtactivo.setSelected(true);
                        } else if(ap.getEstado().trim().equals("Inactivo"))  {
                            rbtinactivo.setSelected(true);
                        }
                    }else{
                        limpiar2();
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Por favor ingrese el numero de identificación");
                }

            } catch (Exception ex) {
                System.out.println("Error en frm datos \n" + ex.getMessage());
            }

        }
    }//GEN-LAST:event_txtNumKeyReleased

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        String estad = rbtinactivo.isSelected() ? "Inactivo" : "Activo";
        aprendiz ap = new aprendiz(cmbtipo.getSelectedItem().toString(), txtNum.getText(), txtnombre.getText(), txtapellido.getText(), txtnacimiento.getText(), txtdir.getText(), txttel.getText(), txtcel.getText(), txtcorreo.getText(), estad, txtweb.getText());
//          
        if (ap.guardar("insert into datos values('" + ap.getTdoc() + "','" + ap.getNdoc() + "','" + ap.getName() + "','" + ap.getLastname() + "','" + ap.getFnac() + "','" + ap.getAddress() + "'," + "'" + ap.getTelephone() + "','" + ap.getCellphone() + "','" + ap.getEmail() + "','" + ap.getEstado() + "','" + ap.getPagperson() + "')")) {
            JOptionPane.showMessageDialog(null, "Datos guardados");
            limpiar();
            ap.refreh();
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar datos");
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnexportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportarActionPerformed
        // TODO add your handling code here:
        exportar excel = new exportar();
        if (excel.verificarExistencia(ap.getAprendices())) {
            excel.especificarRuta(this);
            excel.crearHoja("adsi35", ap.getAprendices());
        } else {
            JOptionPane.showMessageDialog(null, "No hay registros a exportar");
        }
    }//GEN-LAST:event_btnexportarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        try {

            if (txtNum.getText() != null) {
                ap.buscar(Integer.parseInt(txtNum.getText()));
                if (ap.getName() != null) {
                    if (ap.getTdoc().trim().equals("Cedula") || ap.getTdoc().trim().equals("CEDULA")) {
                        cmbtipo.setSelectedIndex(1);
                    } else {
                        cmbtipo.setSelectedIndex(2);
                    }

                    txtnacimiento.setText(ap.getFnac());
                    txtnombre.setText(ap.getName());
                    txtapellido.setText(ap.getLastname());
                    txttel.setText(ap.getTelephone());
                    txtcel.setText(ap.getCellphone());
                    txtdir.setText(ap.getAddress());
                    txtcorreo.setText(ap.getEmail());
                    txtweb.setText(ap.getPagperson());
                    if (ap.getEstado().equals("Activo")) {
                        rbtactivo.setSelected(true);
                    } else {
                        rbtinactivo.setSelected(true);
                    }

                        //Determinamos si eliminamos o no el registro
                    int n = JOptionPane.showConfirmDialog(null, "Realmente Desea Eliminar Este Aprendiz?", "Verificacion", JOptionPane.YES_NO_OPTION);
                    if (n == JOptionPane.YES_OPTION) {
                        String consu = ("update datos set ESTADO='Inactivo' where N_DOCUMENTO=" + txtNum.getText() + "");
                        
                        if (ap.Eliminar(consu) == 1) {
                            JOptionPane.showMessageDialog(null, "Aprendiz Inhabilitado Con Exito", "Aviso", JOptionPane.PLAIN_MESSAGE);
                            limpiar();
                            ap.refreh();
                        } else {
                            JOptionPane.showMessageDialog(null, "No Se Pudo Inhabilitar El Aprendiz, Por Favor Intente Nuevamente", "Error", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Por favor ingrese el numero de identificación");
            }

        } catch (Exception ex) {
            System.out.println("Error en frm datos \n" + ex.getMessage());
        }

    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnagendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagendaActionPerformed
        // TODO add your handling code here:
        VistaAgenda abrirAgenda = new VistaAgenda();
        abrirAgenda.setVisible(true);
    }//GEN-LAST:event_btnagendaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datos().setVisible(true);
            }
        });
    }

    public void colocar() {
        ap.setTdoc(cmbtipo.getSelectedItem().toString());
        ap.setNdoc(txtNum.getText().trim());
        ap.setName(txtnombre.getText());
        ap.setLastname(txtapellido.getText());
        ap.setFnac(txtnacimiento.getText());
        ap.setAddress(txtdir.getText());
        ap.setTelephone(txttel.getText());
        ap.setCellphone(txtcel.getText());
        ap.setEmail(txtcorreo.getText());
        ap.setEstado(est);
        ap.setPagperson(txtweb.getText());
    }

    public void limpiar() {
        //txtNum.setFocusable(true);
        txtNum.requestFocus();
        txtNum.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtnacimiento.setText("");
        txtdir.setText("");
        txttel.setText("");
        txtcel.setText("");
        txtcorreo.setText("");
        txtweb.setText("");
        cmbtipo.setSelectedIndex(0);
        Estado.clearSelection();
    }
    public void limpiar2(){
        txtNum.requestFocus();
        txtnombre.setText("");
        txtapellido.setText("");
        txtnacimiento.setText("");
        txtdir.setText("");
        txttel.setText("");
        txtcel.setText("");
        txtcorreo.setText("");
        txtweb.setText("");
        cmbtipo.setSelectedIndex(0);
        Estado.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup Estado;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel ape;
    private javax.swing.JButton btnagenda;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnexportar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel celular;
    private javax.swing.JComboBox cmbtipo;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel email;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel pagina;
    private javax.swing.JRadioButton rbtactivo;
    private javax.swing.JRadioButton rbtinactivo;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel tipodoc;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcel;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtnacimiento;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttel;
    private javax.swing.JTextField txtweb;
    // End of variables declaration//GEN-END:variables
}
