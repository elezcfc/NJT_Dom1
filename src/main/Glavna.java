/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Controller;
import db.DatabaseBroker;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stefan Elez
 */
public class Glavna extends javax.swing.JFrame {

    /**
     * Creates new form Glavna
     */
    
    private Controller controler;
    public Glavna() {
        initComponents();
        try {
            controler = Controller.instanceController();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        polBG = new javax.swing.ButtonGroup();
        osobaLable = new javax.swing.JLabel();
        imeTf = new javax.swing.JTextField();
        mlbTf = new javax.swing.JTextField();
        imeLabel = new javax.swing.JLabel();
        polLabel = new javax.swing.JLabel();
        mlbLabel = new javax.swing.JLabel();
        MRb = new javax.swing.JRadioButton();
        ZRb = new javax.swing.JRadioButton();
        oCB = new javax.swing.JComboBox<>();
        dodajBtn = new javax.swing.JButton();
        osobaLable1 = new javax.swing.JLabel();
        osobaLable2 = new javax.swing.JLabel();
        brIndTf = new javax.swing.JTextField();
        brIspTf = new javax.swing.JTextField();
        brkTf = new javax.swing.JTextField();
        npTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        izmeniBtn = new javax.swing.JButton();
        obrisiBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        osobaLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        osobaLable.setText("Osoba: ");

        imeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imeTfActionPerformed(evt);
            }
        });

        imeLabel.setText("Ime i prezime");

        polLabel.setText("pol:");

        mlbLabel.setText("MLB");

        polBG.add(MRb);
        MRb.setText("M");
        MRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRbActionPerformed(evt);
            }
        });

        polBG.add(ZRb);
        ZRb.setText("Z");

        oCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Radnik" }));

        dodajBtn.setText("Dodaj");
        dodajBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajBtnActionPerformed(evt);
            }
        });

        osobaLable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        osobaLable1.setText("Radnik: ");

        osobaLable2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        osobaLable2.setText("Student: ");

        jLabel1.setText("Broj indeksa:");

        jLabel2.setText("Broj ispita:");

        jLabel3.setText("Broj radne knjizice:");

        jLabel4.setText("Naziv poslodavca:");

        izmeniBtn.setText("Izmeni");
        izmeniBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izmeniBtnActionPerformed(evt);
            }
        });

        obrisiBtn.setText("Obrisi");
        obrisiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisiBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MRb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ZRb)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(osobaLable)
                                .addGap(18, 18, 18)
                                .addComponent(oCB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(imeTf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mlbTf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(imeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(mlbLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(osobaLable2)
                                .addGap(58, 58, 58)
                                .addComponent(osobaLable1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(brIndTf, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(brIspTf, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(npTf, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(brkTf, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(dodajBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(izmeniBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(obrisiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(polLabel))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(osobaLable)
                    .addComponent(oCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(osobaLable2)
                    .addComponent(osobaLable1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mlbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mlbTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brIndTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brkTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(imeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brIspTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(npTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(polLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MRb)
                    .addComponent(ZRb))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dodajBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(izmeniBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obrisiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imeTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imeTfActionPerformed

    private void MRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MRbActionPerformed

    private void dodajBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajBtnActionPerformed
        try {
            // TODO add your handling code here:
            if(oCB.getSelectedItem().equals("Student") && !brIndTf.getText().equals("") && !brIspTf.getText().equals("")){
                controler.dodajOsobu(Integer.parseInt(mlbTf.getText()), imeTf.getText(), vratiPol(), Integer.parseInt(brIndTf.getText()), Integer.parseInt(brIspTf.getText()));
                controler.potvrdiTransakciju();
            }else
            if(oCB.getSelectedItem().equals("Radnik") && !brkTf.getText().equals("") && !npTf.getText().equals("")){
                controler.dodajOsobu(Integer.parseInt(mlbTf.getText()), imeTf.getText(), vratiPol(), Integer.parseInt(brkTf.getText()), npTf.getText());
                controler.potvrdiTransakciju();
            }else{
                controler.dodajOsobu(Integer.parseInt(mlbTf.getText()), imeTf.getText(), vratiPol());
                controler.potvrdiTransakciju();
            }
        } catch (Exception ex) {
            try {
                Logger.getLogger(Glavna.class.getName()).log(Level.SEVERE, null, ex);
                controler.ponistiTransakciju();
                ex.printStackTrace();
            } catch (SQLException ex1) {
                Logger.getLogger(Glavna.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_dodajBtnActionPerformed

    private void izmeniBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izmeniBtnActionPerformed
        // TODO add your handling code here:
        UpdateForm uf = new UpdateForm();
        uf.setVisible(true);
    }//GEN-LAST:event_izmeniBtnActionPerformed

    private void obrisiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisiBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_obrisiBtnActionPerformed

    private String vratiPol() {
        if(MRb.isSelected()){
            return "M";
        }else {
            return "Z";
        }
    }

    public Controller getControler() {
        return controler;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
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
                java.util.logging.Logger.getLogger(Glavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Glavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Glavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Glavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Glavna().setVisible(true);
                }
            });
            
            DatabaseBroker db = new DatabaseBroker();
            db.konektujSeNaBazu();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Glavna.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Glavna.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Glavna.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton MRb;
    private javax.swing.JRadioButton ZRb;
    private javax.swing.JTextField brIndTf;
    private javax.swing.JTextField brIspTf;
    private javax.swing.JTextField brkTf;
    private javax.swing.JButton dodajBtn;
    private javax.swing.JLabel imeLabel;
    private javax.swing.JTextField imeTf;
    private javax.swing.JButton izmeniBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel mlbLabel;
    private javax.swing.JTextField mlbTf;
    private javax.swing.JTextField npTf;
    private javax.swing.JComboBox<String> oCB;
    private javax.swing.JButton obrisiBtn;
    private javax.swing.JLabel osobaLable;
    private javax.swing.JLabel osobaLable1;
    private javax.swing.JLabel osobaLable2;
    private javax.swing.ButtonGroup polBG;
    private javax.swing.JLabel polLabel;
    // End of variables declaration//GEN-END:variables
}
