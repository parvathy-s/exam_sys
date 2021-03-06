/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import ques_res.Math;
import ques_res.Java;
import ques_res.Html;

import javax.swing.JOptionPane;


public class Subject extends javax.swing.JFrame {
    String username;
    /**
     * Creates new form Subject
     */
    public Subject(String usr) {
        initComponents();
        username=usr;
         setSize(420,350);
        setResizable(false);
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
        sub1 = new javax.swing.JRadioButton();
        sub2 = new javax.swing.JRadioButton();
        sub3 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose Subject");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 35, 170, -1));

        buttonGroup1.add(sub1);
        sub1.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N
        sub1.setText("Math");
        getContentPane().add(sub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 83, -1, -1));

        buttonGroup1.add(sub2);
        sub2.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N
        sub2.setText("Java");
        getContentPane().add(sub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 124, -1, -1));

        buttonGroup1.add(sub3);
        sub3.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N
        sub3.setText("HTML");
        getContentPane().add(sub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 165, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Broadway", 0, 11)); // NOI18N
        jLabel3.setText("Maximimum number of attempts = 1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        start.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N
        start.setText("Start Exam !");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jPanel1.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jButton1.setFont(new java.awt.Font("Broadway", 0, 11)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
       String sub=null;
       if (sub1.isSelected())
       {
           sub="Math";
            try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root","");
            Statement st=con.createStatement();
            String query="select * from mark_info where uname='"+username+"' and subject='"+sub+"'";
            ResultSet rs=st.executeQuery(query);
            if (rs.next())
            {
               JOptionPane.showMessageDialog(null,"You have EXCEEDED your maximum number of attempts");
             }
            else 
            {
               Math m=new Math(username);
               m.setVisible(true);
               this.setVisible(false);
                       
            }
        }catch(Exception e)
        {
            System.out.print(e);
        }
         
       }
       else if (sub2.isSelected())
       {
           sub="Java";
           try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root","");
            Statement st=con.createStatement();
            String query="select * from mark_info where uname='"+username+"' and subject='"+sub+"'";
            ResultSet rs=st.executeQuery(query);
            if (rs.next())
            {
               JOptionPane.showMessageDialog(null,"You have EXCEEDED your maximum number of attempts");
             }
            else 
            {
               Java j=new Java(username);
          j.setVisible(true);
          this.setVisible(false);
                       
            }
        }catch(Exception e)
        {
            System.out.print(e);
        }

         
       }
       else if (sub3.isSelected())
       {
           sub="HTML";
            try{

            Class.forName("com.mysql.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root","");
            Statement st=con.createStatement();
            String query="select * from mark_info where uname='"+username+"' and subject='"+sub+"'";
            ResultSet rs=st.executeQuery(query);
            if (rs.next())
            {
               JOptionPane.showMessageDialog(null,"You have EXCEEDED your maximum number of attempts");
             }
            else 
            {
               Html h=new Html(username);
               h.setVisible(true);
               this.setVisible(false);
                       
            }
        }catch(Exception e)
        {
            System.out.print(e);
        }
         
       }
    }//GEN-LAST:event_startActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       StartQuiz s=new StartQuiz(username);
       s.setVisible(true);
       this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String usr=null;
                new Subject(usr).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton start;
    private javax.swing.JRadioButton sub1;
    private javax.swing.JRadioButton sub2;
    private javax.swing.JRadioButton sub3;
    // End of variables declaration//GEN-END:variables
}
