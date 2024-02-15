
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Andrea Quin
 */

public class MainSwing extends javax.swing.JFrame {
    
    private Muelle funcion;
    
    
    
    public MainSwing(Muelle muelleFuncion) {
        funcion = muelleFuncion != null ? muelleFuncion : new Muelle();
        
        initComponents();
        
        setLocationRelativeTo(null);
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VaciarBarcoBTN = new javax.swing.JButton();
        SalirBTN = new javax.swing.JButton();
        BarcoDesdeBTN = new javax.swing.JButton();
        AgregarElementoBTN = new javax.swing.JButton();
        AgregarBarcoBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VaciarBarcoBTN.setContentAreaFilled(false);
        VaciarBarcoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaciarBarcoBTNActionPerformed(evt);
            }
        });
        getContentPane().add(VaciarBarcoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 280, 70));

        SalirBTN.setContentAreaFilled(false);
        SalirBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBTNActionPerformed(evt);
            }
        });
        getContentPane().add(SalirBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 290, 60));

        BarcoDesdeBTN.setContentAreaFilled(false);
        BarcoDesdeBTN.setLabel("");
        BarcoDesdeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarcoDesdeBTNActionPerformed(evt);
            }
        });
        getContentPane().add(BarcoDesdeBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 290, 50));

        AgregarElementoBTN.setContentAreaFilled(false);
        AgregarElementoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarElementoBTNActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarElementoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 280, 60));

        AgregarBarcoBTN.setContentAreaFilled(false);
        AgregarBarcoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBarcoBTNActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarBarcoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 280, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarBarcoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBarcoBTNActionPerformed
        String tipo = JOptionPane.showInputDialog(null, "Inserte el tipo de barco que desea. (PESQUERO / PASAJERO)");

        funcion.agregarBarco(tipo);

    }//GEN-LAST:event_AgregarBarcoBTNActionPerformed

    private void AgregarElementoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarElementoBTNActionPerformed
    String nombreBarco = JOptionPane.showInputDialog(null, "Inserte el nombre del barco al cual desea agregarle un elemento.");
        
    funcion.agregarElemento(nombreBarco);
    
    }//GEN-LAST:event_AgregarElementoBTNActionPerformed

    private void VaciarBarcoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaciarBarcoBTNActionPerformed
    String nombreBarco = JOptionPane.showInputDialog(null, "Inserte el nombre del barco al cual desea vaciar.");
        
    double total = funcion.vaciarBarco(nombreBarco);
        
    JOptionPane.showMessageDialog(null, "El total generado por el barco es de: "+total);
        
    }//GEN-LAST:event_VaciarBarcoBTNActionPerformed

    private void BarcoDesdeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarcoDesdeBTNActionPerformed
        try {
            String año = JOptionPane.showInputDialog(null, "Inserte el año que desea visualizar.");

            int añoINT = Integer.parseInt(año);

            funcion.barcosDesde(añoINT);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Por favor, insertar un año valido.");
        }


    }//GEN-LAST:event_BarcoDesdeBTNActionPerformed

    private void SalirBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirBTNActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSwing(new Muelle()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBarcoBTN;
    private javax.swing.JButton AgregarElementoBTN;
    private javax.swing.JButton BarcoDesdeBTN;
    private javax.swing.JButton SalirBTN;
    private javax.swing.JButton VaciarBarcoBTN;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
