/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exam_q1_2021;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author user
 */
public class Instruments extends javax.swing.JFrame {

    Instrument[][] instruments;
    
    public Instruments() {
        initComponents();
        
        /*Big note: The instruments represents the rows
        note: the level represents the columns
        each item in the combo box has an index the first item has an index of 0
        so make sure you create a two dimensional array that will correspond to the indexes of the rows (instrument) and columns (level);
        example below the guitar has an index of zero both in the 2d array and on the combo box then the beginner has an index of 0 both in the 2d array and on the combo box
        */
        
        Instrument[][] instruments = {
            {new Instrument("Guitar", "Beginner", 150), new Instrument("Guitar", "Intermediate", 215), new Instrument("Guitar", "Advanced", 130)},
            {new Instrument("Piano", "Beginner", 250), new Instrument("Piano", "Intermediate", 232), new Instrument("Piano", "Advanced", 185)},
            {new Instrument("Violin", "Beginner", 280), new Instrument("Violin", "Intermediate", 280), new Instrument("Violin", "Advanced", 310)},
        };
        
        this.instruments = new Instrument[instruments.length][instruments[0].length];
        
        for(int i = 0; i < instruments.length; i++){
            for(int j = 0; j < instruments[i].length; j++){
               this.instruments[i][j] = new Instrument(instruments[i][j]);
            }
        }
        
        String[] instrumentNames = new String[3];
        
        //Getting the names
        for(int i = 0; i < instruments.length; i++){
            for(int j = 0; j < instruments[i].length; j++){
                instrumentNames[i] = instruments[i][0].getInstrumentName();
            }
        }
        
          jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(instrumentNames));
        
     String[] instrumentLevel = new String[3];
     
   
     
     instrumentLevel[0] = instruments[0][0].getLevel();
     instrumentLevel[1] = instruments[0][1].getLevel();
     instrumentLevel[2] = instruments[0][2].getLevel();
       
  
       
       jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(instrumentLevel));
      
    }
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Music Lessons Price");

        jLabel1.setText("INSTRUMENT:");

        jLabel2.setText("LEVEL: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("REPORT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");

        jMenuItem2.setText("Submit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Report");
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
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(36, 36, 36)
                        .addComponent(jButton2))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        int selectedOne = jComboBox1.getSelectedIndex();
        
        int selectedTwo = jComboBox2.getSelectedIndex();
        
        String names = this.instruments[selectedOne][selectedTwo].getInstrumentName();
        
        String level = this.instruments[selectedOne][selectedTwo].getLevel();
        
        int price = this.instruments[selectedOne][selectedTwo].getPrice();
        
        
        String finalPrice = String.valueOf(price);
        
          JOptionPane.showMessageDialog(null, "INSTRUMENT: " + names + "\n" +  "LEVEL: " + level + "\n" + "LESSON PRICE: " + price + "\n" + selectedOne + "\n" + selectedTwo);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      
          int selectedOne = jComboBox1.getSelectedIndex();
        
        int selectedTwo = jComboBox2.getSelectedIndex();
        
        String names = this.instruments[selectedOne][selectedTwo].getInstrumentName();
        
        String level = this.instruments[selectedOne][selectedTwo].getLevel();
        
        int price = this.instruments[selectedOne][selectedTwo].getPrice();
        
        
        String finalPrice = String.valueOf(price);
        
          JOptionPane.showMessageDialog(null, "INSTRUMENT: " + names + "\n" +  "LEVEL: " + level + "\n" + "LESSON PRICE: " + price);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        int averageBeginner = 0;
        int averageIntermediate = 0;
        int averageAdvanced = 0;
        
        //Getting the total values
        for(int i = 0; i < this.instruments.length; i++){
            averageBeginner += this.instruments[i][0].getPrice();
            averageIntermediate += this.instruments[i][1].getPrice();
            averageAdvanced += this.instruments[i][2].getPrice();
        }
        
        //Finding the average after getting the total values
        int beginnerAverage = averageBeginner/this.instruments.length;
        int intermediateAverage = averageIntermediate/this.instruments.length;
        int advancedAverage = averageAdvanced/this.instruments.length;
        
          JOptionPane.showMessageDialog(null, "Average lesson price for Beginner: " + "R " +beginnerAverage+ "\n" + "Average lesson price for intermediate: " + "R " + intermediateAverage + "\n" + "Average lesson price for Advanced: " + "R " + advancedAverage);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      
         int averageBeginner = 0;
        int averageIntermediate = 0;
        int averageAdvanced = 0;
        
        for(int i = 0; i < this.instruments.length; i++){
            averageBeginner += this.instruments[i][0].getPrice();
            averageIntermediate += this.instruments[i][1].getPrice();
            averageAdvanced += this.instruments[i][2].getPrice();
        }
        
        int beginnerAverage = averageBeginner/this.instruments.length;
        int intermediateAverage = averageIntermediate/this.instruments.length;
        int advancedAverage = averageAdvanced/this.instruments.length;
        
          JOptionPane.showMessageDialog(null, "Average lesson price for Beginner: " + "R " +beginnerAverage+ "\n" + "Average lesson price for intermediate: " + "R " + intermediateAverage + "\n" + "Average lesson price for Advanced: " + "R " + advancedAverage);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Instruments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instruments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instruments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instruments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instruments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
