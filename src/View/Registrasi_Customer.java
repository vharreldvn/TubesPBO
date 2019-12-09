/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author Maulidito
 */
public class Registrasi_Customer extends javax.swing.JFrame {

    /**
     * Creates new form Registrasi_Customer
     */
    public Registrasi_Customer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFtgl_lahir = new javax.swing.JFormattedTextField();
        jRLaki = new javax.swing.JRadioButton();
        jRPerempuan = new javax.swing.JRadioButton();
        jBDone = new javax.swing.JButton();
        jTNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAlamat = new javax.swing.JTextPane();
        jLIdcustomer = new javax.swing.JLabel();
        jBCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        jLabel2.setText("Alamat");

        try {
            jFtgl_lahir.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFtgl_lahir.setToolTipText("00-00-0000");

        buttonGroup1.add(jRLaki);
        jRLaki.setSelected(true);
        jRLaki.setText("LAKI");

        buttonGroup1.add(jRPerempuan);
        jRPerempuan.setText("PEREMPUAN");

        jBDone.setText("Done");

        jTNama.setToolTipText("sebagai Username");

        jLabel3.setText("Tanggal Lahir");

        jScrollPane1.setViewportView(jTAlamat);

        jBCancel.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTNama, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(59, 59, 59)
                                .addComponent(jFtgl_lahir, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRLaki)
                                .addGap(36, 36, 36)
                                .addComponent(jRPerempuan))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jBDone)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLIdcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLIdcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFtgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRLaki)
                    .addComponent(jRPerempuan))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDone)
                    .addComponent(jBCancel))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Registrasi_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrasi_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrasi_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrasi_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrasi_Customer().setVisible(true);
            }
        });
    }

    public String getjFtgl_lahir() {
        return jFtgl_lahir.getText();
    }

    public void setjFtgl_lahir(String jFtgl_lahir) {
        this.jFtgl_lahir.setText(jFtgl_lahir);
    }

    public JRadioButton getjRLaki() {
        return jRLaki;
    }

    public void setjRLaki(JRadioButton jRLaki) {
        this.jRLaki = jRLaki;
    }

    public JRadioButton getjRPerempuan() {
        return jRPerempuan;
    }

    public void setjRPerempuan(JRadioButton jRPerempuan) {
        this.jRPerempuan = jRPerempuan;
    }

    public String getjTAlamat() {
        return jTAlamat.getText();
    }

    public void setjTAlamat(String jTAlamat) {
        this.jTAlamat.setText(jTAlamat);
    }

    public String getjTNama() {
        return jTNama.getText();
    }

    public void setjTNama(String jTNama) {
        this.jTNama.setText(jTNama);
    }

    public JButton getjBDone() {
        return jBDone;
    }

    public String getjLIdcustomer() {
        return jLIdcustomer.getText();
    }

    public void setjLIdcustomer(String jLIdcustomer) {
        this.jLIdcustomer.setText(jLIdcustomer);
    }

    public String getButtonGroup1() {
        if (jRLaki.isSelected()){
            return jRLaki.getText();
        }else{
            return jRPerempuan.getText();
        }
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JButton getjBCancel() {
        return jBCancel;
    }
    
    
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBCancel;
    private javax.swing.JButton jBDone;
    private javax.swing.JFormattedTextField jFtgl_lahir;
    private javax.swing.JLabel jLIdcustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRLaki;
    private javax.swing.JRadioButton jRPerempuan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTAlamat;
    private javax.swing.JTextField jTNama;
    // End of variables declaration//GEN-END:variables
   
    public void addActionListener(ActionListener e){
        jBDone.addActionListener(e);
        jBCancel.addActionListener(e);
    
    }

}