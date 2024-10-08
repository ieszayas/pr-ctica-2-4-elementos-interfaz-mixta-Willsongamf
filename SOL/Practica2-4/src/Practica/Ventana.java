package Practica;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();

        buttonGroup1.add(Radio_op1);
        buttonGroup1.add(Radio_op2);
        buttonGroup1.add(Radio_op3);

        buttonGroup2.add(Radio_op1_I);
        buttonGroup2.add(Radio_op2_I);
        buttonGroup2.add(Radio_op3_I);
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
        Campo_texto_inverso = new javax.swing.JTextField();
        Campo_texto_correo = new javax.swing.JTextField();
        Radio_op1 = new javax.swing.JRadioButton();
        Radio_op2 = new javax.swing.JRadioButton();
        Radio_op3 = new javax.swing.JRadioButton();
        Check_op4 = new javax.swing.JCheckBox();
        Check_op5 = new javax.swing.JCheckBox();
        Check_op6 = new javax.swing.JCheckBox();
        Texto_correo = new javax.swing.JLabel();
        Combobox = new javax.swing.JComboBox<>();
        Slider = new javax.swing.JSlider();
        Boton_toggle = new javax.swing.JToggleButton();
        Spinner = new javax.swing.JSpinner();
        Texto_correo1_I = new javax.swing.JLabel();
        Combobox1_I = new javax.swing.JComboBox<>();
        Slider1_I = new javax.swing.JSlider();
        Boton_toggle1_I = new javax.swing.JToggleButton();
        Spinner1_I = new javax.swing.JSpinner();
        Campo_texto_inverso1_I = new javax.swing.JTextField();
        Campo_texto_correo1_I = new javax.swing.JTextField();
        Radio_op1_I = new javax.swing.JRadioButton();
        Radio_op2_I = new javax.swing.JRadioButton();
        Radio_op3_I = new javax.swing.JRadioButton();
        Check_op4_I = new javax.swing.JCheckBox();
        Check_op5_I = new javax.swing.JCheckBox();
        Check_op6_I = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Campo_texto_inverso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Campo_texto_inversoKeyTyped(evt);
            }
        });

        Campo_texto_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_texto_correoActionPerformed(evt);
            }
        });
        Campo_texto_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Campo_texto_correoKeyTyped(evt);
            }
        });

        Radio_op1.setText("Opcion 1");
        Radio_op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_op1ActionPerformed(evt);
            }
        });

        Radio_op2.setText("Opcion 2");
        Radio_op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_op2ActionPerformed(evt);
            }
        });

        Radio_op3.setText("Opcion 3");
        Radio_op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_op3ActionPerformed(evt);
            }
        });

        Check_op4.setText("Opcion 4");
        Check_op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_op4ActionPerformed(evt);
            }
        });

        Check_op5.setText("Opcion 5");
        Check_op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_op5ActionPerformed(evt);
            }
        });

        Check_op6.setText("Opcion 6");
        Check_op6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_op6ActionPerformed(evt);
            }
        });

        Texto_correo.setText("Correo");

        Combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Boton_toggle.setIcon(new javax.swing.ImageIcon("C:\\Users\\DAM2_09\\Documents\\GitHub\\pr-ctica-2-4-elementos-interfaz-mixta-Willsongamf\\SOL\\Practica2-4\\src\\Practica\\b_off.png")); // NOI18N
        Boton_toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_toggleActionPerformed(evt);
            }
        });

        Texto_correo1_I.setText("Correo");
        Texto_correo1_I.setEnabled(false);

        Combobox1_I.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Combobox1_I.setEnabled(false);

        Slider1_I.setEnabled(false);

        Boton_toggle1_I.setIcon(new javax.swing.ImageIcon("C:\\Users\\DAM2_09\\Documents\\GitHub\\pr-ctica-2-4-elementos-interfaz-mixta-Willsongamf\\SOL\\Practica2-4\\src\\Practica\\b_off.png")); // NOI18N
        Boton_toggle1_I.setEnabled(false);

        Spinner1_I.setEnabled(false);

        Campo_texto_inverso1_I.setEnabled(false);

        Campo_texto_correo1_I.setEnabled(false);

        Radio_op1_I.setText("Opcion 1");
        Radio_op1_I.setEnabled(false);

        Radio_op2_I.setText("Opcion 2");
        Radio_op2_I.setEnabled(false);

        Radio_op3_I.setText("Opcion 3");
        Radio_op3_I.setEnabled(false);

        Check_op4_I.setText("Opcion 4 ");
        Check_op4_I.setEnabled(false);

        Check_op5_I.setText("Opcion 5");
        Check_op5_I.setEnabled(false);

        Check_op6_I.setText("Opcion 6");
        Check_op6_I.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Radio_op2)
                            .addComponent(Radio_op1)
                            .addComponent(Radio_op3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Check_op4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Campo_texto_inverso, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Check_op5)
                                    .addComponent(Check_op6))
                                .addGap(81, 81, 81)
                                .addComponent(Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(Texto_correo)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Boton_toggle)
                                .addGap(56, 56, 56))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Campo_texto_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Radio_op2_I)
                            .addComponent(Radio_op1_I)
                            .addComponent(Radio_op3_I))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Check_op4_I)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Campo_texto_inverso1_I, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Slider1_I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Check_op5_I)
                                    .addComponent(Check_op6_I))
                                .addGap(81, 81, 81)
                                .addComponent(Spinner1_I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(Texto_correo1_I)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Combobox1_I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Boton_toggle1_I)
                                .addGap(56, 56, 56))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Campo_texto_correo1_I, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Radio_op1)
                            .addComponent(Check_op4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_texto_inverso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Radio_op2)
                                    .addComponent(Check_op5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Radio_op3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Check_op6)
                                    .addComponent(Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Campo_texto_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto_correo)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Boton_toggle)))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Radio_op1_I)
                            .addComponent(Check_op4_I)))
                    .addComponent(Slider1_I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_texto_inverso1_I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Boton_toggle1_I))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Radio_op2_I)
                                    .addComponent(Check_op5_I)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Spinner1_I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Radio_op3_I)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Check_op6_I)
                                    .addComponent(Combobox1_I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Campo_texto_correo1_I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto_correo1_I))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Radio_op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_op1ActionPerformed
        Radio_op1_I.setSelected(Radio_op1.isSelected());
    }//GEN-LAST:event_Radio_op1ActionPerformed

    private void Radio_op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_op2ActionPerformed
        Radio_op2_I.setSelected(Radio_op2.isSelected());
    }//GEN-LAST:event_Radio_op2ActionPerformed

    private void Radio_op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_op3ActionPerformed
        Radio_op3_I.setSelected(Radio_op3.isSelected());
    }//GEN-LAST:event_Radio_op3ActionPerformed

    private void Check_op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_op4ActionPerformed
        Check_op4_I.setSelected(Check_op4.isSelected());
    }//GEN-LAST:event_Check_op4ActionPerformed

    private void Check_op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_op5ActionPerformed
        Check_op5_I.setSelected(Check_op5.isSelected());
    }//GEN-LAST:event_Check_op5ActionPerformed

    private void Check_op6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_op6ActionPerformed
        Check_op6_I.setSelected(Check_op6.isSelected());
    }//GEN-LAST:event_Check_op6ActionPerformed

    private void Campo_texto_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_texto_correoActionPerformed

    }//GEN-LAST:event_Campo_texto_correoActionPerformed

    private void Campo_texto_correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Campo_texto_correoKeyTyped

        Campo_texto_correo1_I.setText(Campo_texto_correo.getText());
    }//GEN-LAST:event_Campo_texto_correoKeyTyped

    private void Boton_toggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_toggleActionPerformed
        Boton_toggle1_I.setSelected(Boton_toggle.isSelected());
        ImageIcon imagen_activada = new ImageIcon("./b_on.png");
        ImageIcon imagen_desactivada = new ImageIcon("C:\\Users\\DAM2_09\\Documents\\GitHub\\pr-ctica-2-4-elementos-interfaz-mixta-Willsongamf\\SOL\\Practica2-4\\src\\Practica\\b_off.png");
        if (Boton_toggle.isSelected()) {
            Boton_toggle.setIcon(imagen_activada);
            Boton_toggle1_I.setIcon(imagen_activada);
        } else {
            Boton_toggle.setIcon(imagen_desactivada);
            Boton_toggle1_I.setIcon(imagen_desactivada);
        }


    }//GEN-LAST:event_Boton_toggleActionPerformed

    private void Campo_texto_inversoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Campo_texto_inversoKeyTyped
        String inverso = "";
        inverso = Campo_texto_correo.getText() + inverso;
        Campo_texto_correo1_I.setText(inverso);
    }//GEN-LAST:event_Campo_texto_inversoKeyTyped

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Boton_toggle;
    private javax.swing.JToggleButton Boton_toggle1_I;
    private javax.swing.JTextField Campo_texto_correo;
    private javax.swing.JTextField Campo_texto_correo1_I;
    private javax.swing.JTextField Campo_texto_inverso;
    private javax.swing.JTextField Campo_texto_inverso1_I;
    private javax.swing.JCheckBox Check_op4;
    private javax.swing.JCheckBox Check_op4_I;
    private javax.swing.JCheckBox Check_op5;
    private javax.swing.JCheckBox Check_op5_I;
    private javax.swing.JCheckBox Check_op6;
    private javax.swing.JCheckBox Check_op6_I;
    private javax.swing.JComboBox<String> Combobox;
    private javax.swing.JComboBox<String> Combobox1_I;
    private javax.swing.JRadioButton Radio_op1;
    private javax.swing.JRadioButton Radio_op1_I;
    private javax.swing.JRadioButton Radio_op2;
    private javax.swing.JRadioButton Radio_op2_I;
    private javax.swing.JRadioButton Radio_op3;
    private javax.swing.JRadioButton Radio_op3_I;
    private javax.swing.JSlider Slider;
    private javax.swing.JSlider Slider1_I;
    private javax.swing.JSpinner Spinner;
    private javax.swing.JSpinner Spinner1_I;
    private javax.swing.JLabel Texto_correo;
    private javax.swing.JLabel Texto_correo1_I;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
