/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

import database.Funciones;
import database.IO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arturo
 */
public class VentanaAñadir extends javax.swing.JFrame{

    /**
     * Creates new form vAñadir
     */
    public VentanaAñadir(){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Añadir nuevos datos");
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    public void limpiar(){
        fCod.setText("");
        fNom.setText("");
        fMar.setText("");
        fMod.setText("");
        fPre.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lcod = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lMarca = new javax.swing.JLabel();
        lModelo = new javax.swing.JLabel();
        lPrecio = new javax.swing.JLabel();
        fCod = new javax.swing.JTextField();
        fNom = new javax.swing.JTextField();
        fMar = new javax.swing.JTextField();
        fMod = new javax.swing.JTextField();
        fPre = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));

        lcod.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lcod.setText("Código");

        lNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lNombre.setText("Nombre");

        lMarca.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lMarca.setText("Marca");

        lModelo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lModelo.setText("Modelo");

        lPrecio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lPrecio.setText("Precio");

        fCod.setPreferredSize(new java.awt.Dimension(250, 30));

        fNom.setPreferredSize(new java.awt.Dimension(250, 30));

        fMar.setPreferredSize(new java.awt.Dimension(250, 30));

        fMod.setPreferredSize(new java.awt.Dimension(250, 30));

        fPre.setPreferredSize(new java.awt.Dimension(250, 30));

        bAdd.setBackground(new java.awt.Color(0, 0, 255));
        bAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bAdd.setForeground(new java.awt.Color(255, 255, 255));
        bAdd.setText("Añadir");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bClear.setBackground(new java.awt.Color(255, 0, 255));
        bClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bClear.setForeground(new java.awt.Color(255, 255, 255));
        bClear.setText("Limpiar");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        bCancel.setBackground(new java.awt.Color(255, 0, 0));
        bCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bCancel.setForeground(new java.awt.Color(255, 255, 255));
        bCancel.setText("Cancelar");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lcod)
                            .addComponent(lNombre)
                            .addComponent(lMarca)
                            .addComponent(lModelo)
                            .addComponent(lPrecio))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fMar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(bAdd)
                        .addGap(18, 18, 18)
                        .addComponent(bClear)
                        .addGap(18, 18, 18)
                        .addComponent(bCancel)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fMar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lcod)
                        .addGap(18, 18, 18)
                        .addComponent(lNombre)
                        .addGap(18, 18, 18)
                        .addComponent(lMarca)
                        .addGap(18, 18, 18)
                        .addComponent(lModelo)
                        .addGap(18, 18, 18)
                        .addComponent(lPrecio)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd)
                    .addComponent(bClear)
                    .addComponent(bCancel))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        this.limpiar();
    }//GEN-LAST:event_bClearActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bCancelActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        try{
            if(String.valueOf(fCod.getText()).equalsIgnoreCase("")){
                Exception NumberFormatException=null;
                throw (NumberFormatException);
            }else{
                int cod=Integer.parseInt(fCod.getText());
                String nom=fNom.getText();
                String mar=fMar.getText();
                String mod=fMod.getText();
                String pre=fPre.getText();
                Funciones.insert(cod, nom, mar, mod, pre);
            }
        }catch(Exception ex){
            IO.Mensaje("No se admiten codigos nulos");
            Logger.getLogger(VentanaAñadir.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.limpiar();
    }//GEN-LAST:event_bAddActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(VentanaAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(VentanaAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(VentanaAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(VentanaAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new VentanaAñadir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bClear;
    private javax.swing.JTextField fCod;
    private javax.swing.JTextField fMar;
    private javax.swing.JTextField fMod;
    private javax.swing.JTextField fNom;
    private javax.swing.JTextField fPre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lMarca;
    private javax.swing.JLabel lModelo;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lPrecio;
    private javax.swing.JLabel lcod;
    // End of variables declaration//GEN-END:variables
}
