
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JAVIER CASTILLO
 */
public class contra extends javax.swing.JFrame {

    /**
     * Creates new form contra
     */
    public contra() {
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

        jLabel2 = new javax.swing.JLabel();
        usu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        con = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Meiryo", 1, 18)); // NOI18N
        jLabel2.setText("Usuario :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 89, -1));

        usu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 0), null, null));
        usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuActionPerformed(evt);
            }
        });
        getContentPane().add(usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 145, -1));

        jLabel1.setFont(new java.awt.Font("Meiryo", 1, 18)); // NOI18N
        jLabel1.setText("Contraseña :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 121, -1));

        con.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 153, 0), null, null));
        con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conActionPerformed(evt);
            }
        });
        getContentPane().add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 145, -1));

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jButton1.setText("Salir");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 51), null, null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 96, 32));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sXM-VH.gif"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 140));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuActionPerformed
usu.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_usuActionPerformed

    private void conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conActionPerformed
       String usuario= "agente", co= "1";
       String us="admin", pass="1000";
       
       if (String.valueOf(usu.getText()).compareTo(us)==0&& String.valueOf(con.getText()).compareTo(pass)==0){
           JOptionPane.showMessageDialog(null, "Ha ingresado con Exito!");
           admin a = new admin();
           a.setVisible(true);
           dispose();
      }else if (String.valueOf(usu.getText()).compareTo(usuario)==0&& String.valueOf(con.getText()).compareTo(co)==0){
           JOptionPane.showMessageDialog(null, "Ha ingresado con Exito!");
           pocoa d = new pocoa();
           d.setVisible(true);
           dispose();
       }
       else{ JOptionPane.showMessageDialog(null, "Usuario y/o contraseña invalida");}
    //    con.transferFocus();   

    }//GEN-LAST:event_conActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose ();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField con;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField usu;
    // End of variables declaration//GEN-END:variables
}