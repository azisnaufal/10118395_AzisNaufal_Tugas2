/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_3;

import javax.swing.JOptionPane;

/**
 *
 * @author oazisn
 */
public class Praktikum3_3 extends javax.swing.JFrame {

    private String nim = "";
    private String nama = "";
    private String kelas = "";
    /**
     * Creates new form Praktikum3_3
     */
    public Praktikum3_3() {
        initComponents();
        txtNim.setEnabled(false);
        txtNama.setEnabled(false);
        txtKelas.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtKelas = new javax.swing.JTextField();
        tblTambah = new javax.swing.JButton();
        tblEdit = new javax.swing.JButton();
        tblExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Mahasiswa"));
        jPanel1.setToolTipText("");

        jLabel1.setText("NIM :");

        jLabel2.setText("Nama :");

        jLabel3.setText("Kelas :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        tblTambah.setText("Tambah");
        tblTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblTambahActionPerformed(evt);
            }
        });

        tblEdit.setText("Edit");
        tblEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblEditActionPerformed(evt);
            }
        });

        tblExit.setText("Exit");
        tblExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tblTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tblEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tblTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tblEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblTambahActionPerformed
        // TODO add your handling code here:
        if (tblTambah.getText().equals("Tambah")){
            tblTambah.setText("Simpan");
            tblTambah.setMnemonic('S');
            tblEdit.setText("Batal");
            tblEdit.setMnemonic('B');
            tblExit.setEnabled(false);
            txtNim.setEnabled(true);
            txtNama.setEnabled(true);
            txtKelas.setEnabled(true);
            txtNim.setText("");
            txtNama.setText("");
            txtKelas.setText("");
            
            txtNim.requestFocus();
        }
        else {
            //simpan Data
            nim = txtNim.getText();
            nama = txtNama.getText();
            kelas = txtKelas.getText();
            JOptionPane.showMessageDialog(null, "Menyimpan data NIM '" + nim + "' Nama '" + nama + " " + kelas + "'");
            
            tblTambah.setText("Tambah");
            tblTambah.setMnemonic('T');
            tblEdit.setText("Edit");
            tblEdit.setMnemonic('E');
            tblExit.setEnabled(true);
            txtNim.setEnabled(false);
            txtNama.setEnabled(false);
            txtKelas.setEnabled(false);
            tblTambah.requestFocus();
        }
    }//GEN-LAST:event_tblTambahActionPerformed

    private void tblExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tblExitActionPerformed

    private void tblEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblEditActionPerformed
        // TODO add your handling code here:
        
        if (tblEdit.getText().equals("Edit")){
            if (!txtNim.getText().isEmpty()){
                tblTambah.setText("Simpan");
                tblTambah.setMnemonic('S');
                tblEdit.setText("Batal");
                tblEdit.setMnemonic('B');
                tblExit.setEnabled(false);
                txtNim.setEnabled(true);
                txtNama.setEnabled(true);
                txtKelas.setEnabled(true);

                txtNim.requestFocus();
            }
            else {
                JOptionPane.showMessageDialog(null, "Anda belum menyimpan data!", "Galat", JOptionPane.WARNING_MESSAGE, null);
            }
        }
        else {
            
            if (nama.isEmpty()){
                txtNim.setText("");
                txtNama.setText("");
                txtKelas.setText("");
            }
            else {
                txtNim.setText(nim);
                txtNama.setText(nama);
                txtKelas.setText(kelas);
            }

            tblTambah.setText("Tambah");
            tblTambah.setMnemonic('T');
            tblEdit.setText("Edit");
            tblEdit.setMnemonic('E');
            tblExit.setEnabled(true);
            txtNim.setEnabled(false);
            txtNama.setEnabled(false);
            txtKelas.setEnabled(false);
            tblTambah.requestFocus();
        }
    }//GEN-LAST:event_tblEditActionPerformed

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
            java.util.logging.Logger.getLogger(Praktikum3_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Praktikum3_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Praktikum3_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Praktikum3_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Praktikum3_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tblEdit;
    private javax.swing.JButton tblExit;
    private javax.swing.JButton tblTambah;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    // End of variables declaration//GEN-END:variables
}
