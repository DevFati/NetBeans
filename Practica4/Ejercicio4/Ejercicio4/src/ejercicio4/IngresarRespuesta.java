/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author fatmo
 */
public class IngresarRespuesta extends javax.swing.JFrame {

    /**
     * Creates new form IngresarRespuesta
     */
    
    private Double resultado;
    public IngresarRespuesta() {
        initComponents();
      
    }

    public IngresarRespuesta(Double resultado) {
        this.resultado = resultado;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jLabelvalor1 = new javax.swing.JLabel();
        jRadioButtonmarte = new javax.swing.JRadioButton();
        jRadioButtonJupiter = new javax.swing.JRadioButton();
        jRadioButtonTierra = new javax.swing.JRadioButton();
        jRadioButtonSaturno = new javax.swing.JRadioButton();
        jLabelvalor2 = new javax.swing.JLabel();
        jRadioButtonola = new javax.swing.JRadioButton();
        jRadioButtondesicion = new javax.swing.JRadioButton();
        jRadioButtonhay = new javax.swing.JRadioButton();
        jRadioButtonahi = new javax.swing.JRadioButton();
        jLabelvalor3 = new javax.swing.JLabel();
        jCheckBoxsagaz = new javax.swing.JCheckBox();
        jCheckBoxlisto = new javax.swing.JCheckBox();
        jCheckBoxlerdo = new javax.swing.JCheckBox();
        jCheckBoxastuto = new javax.swing.JCheckBox();
        jLabelvalor4 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        btnNota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese la respuesta correcta");

        jLabel2.setText("4*6+3+2*2=");

        jLabel3.setText("Nombre del quinto planeta");

        jLabel4.setText("Palabra con error ortográfico");

        jLabel5.setText("Sinónimos de inteligente");

        buttonGroup1.add(jRadioButton58);
        jRadioButton58.setText("58");
        jRadioButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton58ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton34);
        jRadioButton34.setText("34");

        buttonGroup1.add(jRadioButton31);
        jRadioButton31.setText("31");

        buttonGroup1.add(jRadioButton40);
        jRadioButton40.setText("40");

        jLabelvalor1.setText("valor");

        buttonGroup2.add(jRadioButtonmarte);
        jRadioButtonmarte.setText("Marte");
        jRadioButtonmarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonmarteActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButtonJupiter);
        jRadioButtonJupiter.setText("Jupiter");

        buttonGroup2.add(jRadioButtonTierra);
        jRadioButtonTierra.setText("Tierra");

        buttonGroup2.add(jRadioButtonSaturno);
        jRadioButtonSaturno.setText("Saturno");

        jLabelvalor2.setText("valor");

        buttonGroup3.add(jRadioButtonola);
        jRadioButtonola.setText("ola");
        jRadioButtonola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonolaActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButtondesicion);
        jRadioButtondesicion.setText("desición");

        buttonGroup3.add(jRadioButtonhay);
        jRadioButtonhay.setText("hay");

        buttonGroup3.add(jRadioButtonahi);
        jRadioButtonahi.setText("ahí");

        jLabelvalor3.setText("valor");

        jCheckBoxsagaz.setText("sagaz");
        jCheckBoxsagaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxsagazActionPerformed(evt);
            }
        });

        jCheckBoxlisto.setText("listo");

        jCheckBoxlerdo.setText("lerdo");

        jCheckBoxastuto.setText("astuto");

        jLabelvalor4.setText("valor");

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnNota.setText("Ver nota");
        btnNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton58)
                            .addComponent(jRadioButtonola)
                            .addComponent(jRadioButtonmarte))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtondesicion)
                                    .addComponent(jCheckBoxlisto))
                                .addGap(28, 28, 28)
                                .addComponent(jRadioButtonhay))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnNota)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jRadioButtonJupiter)
                                                .addComponent(jRadioButton34))
                                            .addGap(36, 36, 36)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jRadioButtonTierra)
                                                .addComponent(jRadioButton31))
                                            .addGap(13, 13, 13))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jCheckBoxlerdo)
                                            .addGap(18, 18, 18)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButtonahi)
                                        .addComponent(jRadioButtonSaturno)
                                        .addComponent(jCheckBoxastuto)
                                        .addComponent(jRadioButton40))))))
                    .addComponent(jCheckBoxsagaz))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelvalor3)
                    .addComponent(jLabelvalor4))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(btnMostrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton58)
                    .addComponent(jRadioButton34)
                    .addComponent(jRadioButton31)
                    .addComponent(jRadioButton40)
                    .addComponent(jLabelvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButtonmarte)
                    .addComponent(jRadioButtonJupiter)
                    .addComponent(jRadioButtonTierra)
                    .addComponent(jRadioButtonSaturno)
                    .addComponent(jLabelvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButtonola)
                    .addComponent(jRadioButtondesicion)
                    .addComponent(jRadioButtonhay)
                    .addComponent(jRadioButtonahi)
                    .addComponent(jLabelvalor3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBoxsagaz)
                    .addComponent(jCheckBoxlisto)
                    .addComponent(jCheckBoxlerdo)
                    .addComponent(jCheckBoxastuto)
                    .addComponent(jLabelvalor4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar)
                    .addComponent(btnNota)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton58ActionPerformed

    private void jRadioButtonmarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonmarteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonmarteActionPerformed

    private void jRadioButtonolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonolaActionPerformed

    private void jCheckBoxsagazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxsagazActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxsagazActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
       int n=0;
       int num=0;
       boolean valorN=false;
        if(jRadioButton31.isSelected()){
            jLabelvalor1.setText("Correcto");
            num++;
        }else{
            jLabelvalor1.setText("Incorrecto");
        }
        
        if(jRadioButtonJupiter.isSelected()){
            jLabelvalor2.setText("Correcto");
            num++;
        }else{
            jLabelvalor2.setText("Incorrecto");
        }
        
        if(jRadioButtondesicion.isSelected()){
            jLabelvalor3.setText("Correcto");
            num++;
        }else{
            jLabelvalor3.setText("Incorrecto");
        }
              
        if(jCheckBoxlerdo.isSelected()){
            
            valorN=true;
           
        }else if(jCheckBoxsagaz.isSelected() || jCheckBoxlisto.isSelected() || jCheckBoxastuto.isSelected() ){
           
            if(jCheckBoxsagaz.isSelected()){
                n++;
            }
           if(jCheckBoxlisto.isSelected()){
                n++;
            }
           
           if(jCheckBoxastuto.isSelected()){
                n++;
            }
        }
        
        if(valorN || n==0 ){
            jLabelvalor4.setText("Incorrecto");
        }else {
            jLabelvalor4.setText("Acertaste "+n+" de 3.");
        }
        
        
          Double res=(num+(n/3))*2.5;
          this.setResultado(res);
       
      
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotaActionPerformed
       
        calcularNota();
        
        setVisible(false);
        Nota n=new Nota(this, true);
        n.setVisible(true);
        
    }//GEN-LAST:event_btnNotaActionPerformed

    private void calcularNota(){
        int n=0;
       int num=0;

        if(jRadioButton31.isSelected()){
          
            num++;
        }
        
        if(jRadioButtonJupiter.isSelected()){
            
            num++;
        }
        
        if(jRadioButtondesicion.isSelected()){
         
            num++;
        }
              
         if(jCheckBoxsagaz.isSelected() || jCheckBoxlisto.isSelected() || jCheckBoxastuto.isSelected() ){
           
            if(jCheckBoxsagaz.isSelected()){
                n++;
            }
           if(jCheckBoxlisto.isSelected()){
                n++;
            }
           
           if(jCheckBoxastuto.isSelected()){
                n++;
            }
        }
       
        
        
          Double res=(num+(n/3))*2.5;
          this.setResultado(res);
    }
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
            java.util.logging.Logger.getLogger(IngresarRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarRespuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNota;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox jCheckBoxastuto;
    private javax.swing.JCheckBox jCheckBoxlerdo;
    private javax.swing.JCheckBox jCheckBoxlisto;
    private javax.swing.JCheckBox jCheckBoxsagaz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelvalor1;
    private javax.swing.JLabel jLabelvalor2;
    private javax.swing.JLabel jLabelvalor3;
    private javax.swing.JLabel jLabelvalor4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButtonJupiter;
    private javax.swing.JRadioButton jRadioButtonSaturno;
    private javax.swing.JRadioButton jRadioButtonTierra;
    private javax.swing.JRadioButton jRadioButtonahi;
    private javax.swing.JRadioButton jRadioButtondesicion;
    private javax.swing.JRadioButton jRadioButtonhay;
    private javax.swing.JRadioButton jRadioButtonmarte;
    private javax.swing.JRadioButton jRadioButtonola;
    // End of variables declaration//GEN-END:variables
}
