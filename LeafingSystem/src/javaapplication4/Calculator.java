/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication4;

import java.io.IOException;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */


public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    // for the answers
    double num, ans;
    int calculation;
    public Calculator() {
        initComponents();
        jRadioButton1.setEnabled(false);
    }
    
    public void arithmetic_operators() 
    {
        switch(calculation)  // switch operationsss
            
        {
            case 1: // add minus multiply and etcc
                ans= num + Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
            case 2:
                ans= num - Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
           case 3:
                ans= num / Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
           case 4:
                ans= num * Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                
                
        }
        
        
    }
    
    public void disable() {
        
        jTextField1.setEnabled(false);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(false);
        
        number0.setEnabled(false);
        number1.setEnabled(false);
        number2.setEnabled(false);
        number3.setEnabled(false);
        number4.setEnabled(false);
        number5.setEnabled(false);
        number6.setEnabled(false);
        number7.setEnabled(false);
        number8.setEnabled(false);
        number9.setEnabled(false);
        numberpoint.setEnabled(false);
        numbermultiply.setEnabled(false);
        numberplus.setEnabled(false);
        numberminus.setEnabled(false);
        numberdivide.setEnabled(false);
        numberequals.setEnabled(false);
        numberback.setEnabled(false);
        numberclear.setEnabled(false);
        


    }
    public void enabled() {
        
        jTextField1.setEnabled(true);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(true);
        
        number0.setEnabled(true);
        number1.setEnabled(true);
        number2.setEnabled(true);
        number3.setEnabled(true);
        number4.setEnabled(true);
        number5.setEnabled(true);
        number6.setEnabled(true);
        number7.setEnabled(true);
        number8.setEnabled(true);
        number9.setEnabled(true);
        numberpoint.setEnabled(true);
        numbermultiply.setEnabled(true);
        numberplus.setEnabled(true);
        numberminus.setEnabled(true);
        numberdivide.setEnabled(true);
        numberequals.setEnabled(true);
        numberclear.setEnabled(true);
        numberback.setEnabled(true);
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        number0 = new javax.swing.JButton();
        number1 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        number7 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        numberplus = new javax.swing.JButton();
        numberminus = new javax.swing.JButton();
        numberpoint = new javax.swing.JButton();
        numbermultiply = new javax.swing.JButton();
        numberdivide = new javax.swing.JButton();
        numberequals = new javax.swing.JButton();
        numberclear = new javax.swing.JButton();
        numberback = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Calculator");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 90, 20));

        number0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number0.setText("0");
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ActionPerformed(evt);
            }
        });
        jPanel1.add(number0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 80, 70));

        number1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel1.add(number1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 70));

        number2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number2.setText("2");
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        jPanel1.add(number2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 80, 70));

        number3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number3.setText("3");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });
        jPanel1.add(number3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 80, 70));

        number4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number4.setText("4");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });
        jPanel1.add(number4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 80, 70));

        number5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number5.setText("5");
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ActionPerformed(evt);
            }
        });
        jPanel1.add(number5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 80, 70));

        number6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number6.setText("6");
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ActionPerformed(evt);
            }
        });
        jPanel1.add(number6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 80, 70));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("On");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        number7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number7.setText("7");
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ActionPerformed(evt);
            }
        });
        jPanel1.add(number7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, 70));

        number8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number8.setText("8");
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ActionPerformed(evt);
            }
        });
        jPanel1.add(number8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 80, 70));

        number9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number9.setText("9");
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ActionPerformed(evt);
            }
        });
        jPanel1.add(number9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 80, 70));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("Off");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 390, 60));

        numberplus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numberplus.setText("+");
        numberplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberplusActionPerformed(evt);
            }
        });
        jPanel1.add(numberplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 80, 70));

        numberminus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numberminus.setText("-");
        numberminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberminusActionPerformed(evt);
            }
        });
        jPanel1.add(numberminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 80, 70));

        numberpoint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numberpoint.setText(".");
        numberpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberpointActionPerformed(evt);
            }
        });
        jPanel1.add(numberpoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 80, 70));

        numbermultiply.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numbermultiply.setText("*");
        numbermultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbermultiplyActionPerformed(evt);
            }
        });
        jPanel1.add(numbermultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 80, 70));

        numberdivide.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numberdivide.setText("/");
        numberdivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberdivideActionPerformed(evt);
            }
        });
        jPanel1.add(numberdivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 80, 70));

        numberequals.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numberequals.setText("=");
        numberequals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberequalsActionPerformed(evt);
            }
        });
        jPanel1.add(numberequals, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 80, 70));

        numberclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numberclear.setText("Clear");
        numberclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberclearActionPerformed(evt);
            }
        });
        jPanel1.add(numberclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 80, 70));

        numberback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numberback.setText("<=");
        numberback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberbackActionPerformed(evt);
            }
        });
        jPanel1.add(numberback, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 80, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\ICONSS\\Icon\\arrow_40px.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 120, 40));

        jMenu1.setText("Menu");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/back_to_30px.png"))); // NOI18N
        jMenuItem1.setText("Go back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/close_sign_30px.png"))); // NOI18N
        jMenuItem2.setText("Log Out");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About us");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/add_user_group_man_man_40px.png"))); // NOI18N
        jMenuItem3.setText("About Us");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_number6ActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
        // TODO add your handling code here
        jTextField1.setText(jTextField1.getText() + "1");
        
    }//GEN-LAST:event_number1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + "2");
        
    }//GEN-LAST:event_number2ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_number3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        disable();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        enabled();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_number4ActionPerformed

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_number5ActionPerformed

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + "7");
    }//GEN-LAST:event_number7ActionPerformed

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_number8ActionPerformed

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_number9ActionPerformed

    private void numberdivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberdivideActionPerformed
        // TODO add your handling code here:
        num = Double.parseDouble(jTextField1.getText());
        calculation =3;
        jTextField1.setText("");
        jLabel2.setText(num + "/");
    }//GEN-LAST:event_numberdivideActionPerformed

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + "0");
    }//GEN-LAST:event_number0ActionPerformed

    private void numberpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberpointActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_numberpointActionPerformed

    private void numberplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberplusActionPerformed
        // TODO add your handling code here:
        num = Double.parseDouble(jTextField1.getText());
        calculation =1;
        jTextField1.setText("");
        jLabel2.setText(num + "+");
        
    }//GEN-LAST:event_numberplusActionPerformed

    private void numberminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberminusActionPerformed
        // TODO add your handling code here:
        num = Double.parseDouble(jTextField1.getText());
        calculation =2;
        jTextField1.setText("");
        jLabel2.setText(num + "-");
    }//GEN-LAST:event_numberminusActionPerformed

    private void numberequalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberequalsActionPerformed
        // TODO add your handling code here:
        arithmetic_operators();
        jLabel2.setText("");
        
    }//GEN-LAST:event_numberequalsActionPerformed

    private void numberclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberclearActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_numberclearActionPerformed

    private void numberbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberbackActionPerformed
        // TODO add your handling code here:
        int length = jTextField1.getText().length();
        int number = jTextField1.getText().length() -1;
        String store;
        
        if(length > 0)
        {
            StringBuilder back = new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store=back.toString();
            jTextField1.setText(store);
            
        }
    }//GEN-LAST:event_numberbackActionPerformed

    private void numbermultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numbermultiplyActionPerformed
        // TODO add your handling code here:
        num = Double.parseDouble(jTextField1.getText());
        calculation =4;
        jTextField1.setText("");
        jLabel2.setText(num + "*");
    }//GEN-LAST:event_numbermultiplyActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Do you want to go back?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(response ==JOptionPane.YES_OPTION) {
                 LoggedIn jf5 = new LoggedIn();
        jf5.show();

        dispose();
        } else if(response ==JOptionPane.NO_OPTION) {
            
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        try {
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Users\\eduar\\Documents\\NetBeansProjects\\html files\\first.html" );

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Check file details");
        }
        {
            
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JButton numberback;
    private javax.swing.JButton numberclear;
    private javax.swing.JButton numberdivide;
    private javax.swing.JButton numberequals;
    private javax.swing.JButton numberminus;
    private javax.swing.JButton numbermultiply;
    private javax.swing.JButton numberplus;
    private javax.swing.JButton numberpoint;
    // End of variables declaration//GEN-END:variables
}
