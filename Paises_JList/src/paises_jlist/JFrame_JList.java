package paises_jlist;
import javax.swing.ImageIcon;
/**
 *
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class JFrame_JList extends javax.swing.JFrame {
    public JFrame_JList() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPaises = new javax.swing.JList<>();
        btnAceptar = new javax.swing.JButton();
        lblInformacion = new javax.swing.JLabel();
        lblFrances = new javax.swing.JLabel();
        lblMexico = new javax.swing.JLabel();
        lblChina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(105, 117, 126));

        lstPaises.setBackground(new java.awt.Color(40, 64, 72));
        lstPaises.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        lstPaises.setForeground(new java.awt.Color(255, 255, 255));
        lstPaises.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "México", "Francais", "China" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstPaises);

        btnAceptar.setBackground(new java.awt.Color(204, 255, 204));
        btnAceptar.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblInformacion.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        lblInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformacion.setOpaque(true);

        lblFrances.setOpaque(true);

        lblMexico.setOpaque(true);

        lblChina.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFrances)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMexico)
                        .addGap(8, 8, 8)
                        .addComponent(lblChina)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFrances, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMexico, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
            //Declarar iconos (imagenes)...
        ImageIcon mexFlag = new ImageIcon("src/icons/mexFlag.jpg");
        ImageIcon franFlag = new ImageIcon("src/icons/franFlag.jpg");
        ImageIcon chinaFlag = new ImageIcon("src/icons/chinaFlag.png");
        /*String mensaje;
        mensaje = "El país seleccionado es: "+lstPaises.getSelectValue();
        lblInformacion.setText(mensaje);
        */
            //Mejorar logica...
        String mensaje;
        if(lstPaises.getSelectedIndex()==-1){
           mensaje = "No hay país seleccionado.";}
        else{
           mensaje = "El país seleccionado es: "+lstPaises.getSelectedValue();}
        lblInformacion.setText(mensaje);
            //Cambiar imagenes de los label's...
        if(lstPaises.getSelectedIndex()==0){
            lblMexico.setIcon(mexFlag);
            lblFrances.setIcon(null);
            lblChina.setIcon(null);
        }
        if(lstPaises.getSelectedIndex()==1){
            lblFrances.setIcon(franFlag);
            lblMexico.setIcon(null);
            lblChina.setIcon(null);
        }
        if(lstPaises.getSelectedIndex()==2){
            lblChina.setIcon(chinaFlag);
            lblFrances.setIcon(null);
            lblMexico.setIcon(null);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
            // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarMouseClicked

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
            java.util.logging.Logger.getLogger(JFrame_JList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_JList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_JList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_JList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_JList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChina;
    private javax.swing.JLabel lblFrances;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblMexico;
    private javax.swing.JList<String> lstPaises;
    // End of variables declaration//GEN-END:variables
}
