/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Osoba;
import model.Radnik;
import model.Student;

/**
 *
 * @author elezs
 */
public class UpdateForm extends javax.swing.JFrame {

    /**
     * Creates new form UpdateForm
     */
    private Glavna g;
    private LinkedList<Radnik> radnici;
    private LinkedList<Student> studenti;
    private LinkedList<Osoba> osobe;
    
    public UpdateForm() {
        initComponents();
        g = new Glavna();
        try{
            popuniOsobe();
            popuniStudente();
            popuniRadnike();
            postaviOsluskivace();
        }catch(SQLException e) {
            System.out.println("Problem sa popunjavanjem ComboBox!");
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

        osobaCB = new javax.swing.JComboBox<>();
        studentCB = new javax.swing.JComboBox<>();
        radnikCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        mlbTF = new javax.swing.JTextField();
        imeTF = new javax.swing.JTextField();
        bpiTF = new javax.swing.JTextField();
        brIndTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updateButton = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        brkTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        npTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        polTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MLB:");

        mlbTF.setEditable(false);
        mlbTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlbTFActionPerformed(evt);
            }
        });

        bpiTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpiTFActionPerformed(evt);
            }
        });

        jLabel2.setText("Ime i prezime:");

        jLabel3.setText("Broj indeksa:");

        jLabel4.setText("Broj polozenih ispita:");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Osoba:");

        jLabel6.setText("Student:");

        jLabel7.setText("Radnik");

        jLabel8.setText("Broj radne knjizice:");

        jLabel9.setText("Naziv poslodavca:");

        jLabel10.setText("Pol:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(osobaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brIndTF, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(bpiTF, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radnikCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2)
                                    .addComponent(mlbTF, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(polTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(imeTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brkTF)
                    .addComponent(jLabel9)
                    .addComponent(npTF))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(osobaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mlbTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(brIndTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brkTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bpiTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(npTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radnikCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(polTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mlbTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlbTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mlbTFActionPerformed

    private void bpiTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpiTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpiTFActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            // TODO add your handling code here:
            
            Osoba o = new Osoba(Integer.parseInt(mlbTF.getText()), imeTF.getText(), polTF.getText());
            g.getControler().updateOsoba(o);
            g.getControler().potvrdiTransakciju();
        } catch (SQLException ex) {
            System.out.println("Greska u upitu");
            try {
                g.getControler().ponistiTransakciju();
            } catch (SQLException ex1) {
                Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bpiTF;
    private javax.swing.JTextField brIndTF;
    private javax.swing.JTextField brkTF;
    private javax.swing.JTextField imeTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mlbTF;
    private javax.swing.JTextField npTF;
    private javax.swing.JComboBox<String> osobaCB;
    private javax.swing.JTextField polTF;
    private javax.swing.JComboBox<String> radnikCB;
    private javax.swing.JComboBox<String> studentCB;
    private javax.swing.JToggleButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void popuniOsobe() throws SQLException {
        //Controller c = g.getControler();
        osobe = g.getControler().vratiOsobe();
        for(int i = 0; i < osobe.size(); i++) {
            osobaCB.addItem(osobe.get(i).getImePrezime());
            System.out.println("Dodata osoba: "+osobe.get(i).getImePrezime());
        }
    }

    private void popuniStudente() throws SQLException {
       //Controller c = g.getControler();
       studenti = g.getControler().vratiStudente();
       for(int i = 0; i < studenti.size(); i++) {
            studentCB.addItem(studenti.get(i).getImePrezime());
            System.out.println("Dodat student: "+studenti.get(i).getImePrezime());
        }
    }

    private void popuniRadnike() throws SQLException {
        //Controller c = g.getControler();
        radnici = g.getControler().vratiRadnike();    
        for(int i = 0; i < radnici.size(); i++) {
            radnikCB.addItem(radnici.get(i).getImePrezime());
            System.out.println("Dodat radnik: "+radnici.get(i).getImePrezime());
        }
    }

    private void postaviOsluskivace() {
        osobaCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imeTF.setText("");
                polTF.setText("");
                brIndTF.setText("");
                bpiTF.setText("");
                brkTF.setText("");
                npTF.setText("");
                for(int i = 0; i < osobe.size(); i++){
                    if(osobe.get(i).getImePrezime().equals(osobaCB.getSelectedItem())){
                        mlbTF.setText(String.valueOf(osobe.get(i).getMLB()));
                        imeTF.setText(osobe.get(i).getImePrezime());
                        polTF.setText(osobe.get(i).getPol());
                    }
                }
            }
        });
        
        studentCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imeTF.setText("");
                polTF.setText("");
                brIndTF.setText("");
                bpiTF.setText("");
                brkTF.setText("");
                npTF.setText("");
                for(int i = 0; i < studenti.size(); i++){
                    if(studenti.get(i).getImePrezime().equals(studentCB.getSelectedItem())){
                        mlbTF.setText(String.valueOf(studenti.get(i).getMLB()));
                        imeTF.setText(studenti.get(i).getImePrezime());
                        polTF.setText(studenti.get(i).getPol());
                        brIndTF.setText(String.valueOf(studenti.get(i).getBrIndexa()));
                        bpiTF.setText(String.valueOf(studenti.get(i).getBrPolozenihIspita()));
                    }
                }
            }
        });
        
        radnikCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imeTF.setText("");
                polTF.setText("");
                brkTF.setText("");
                npTF.setText("");
                brIndTF.setText("");
                bpiTF.setText("");
                for(int i = 0; i < radnici.size(); i++){
                    if(radnici.get(i).getImePrezime().equals(radnikCB.getSelectedItem())){
                        mlbTF.setText(String.valueOf(radnici.get(i).getMLB()));
                        imeTF.setText(radnici.get(i).getImePrezime());
                        polTF.setText(radnici.get(i).getPol());
                        brkTF.setText(String.valueOf(radnici.get(i).getBrRadneKnjizice()));
                        npTF.setText(radnici.get(i).getNazivPoslodavca());
                    }
                }
            }
        });
    }
}
