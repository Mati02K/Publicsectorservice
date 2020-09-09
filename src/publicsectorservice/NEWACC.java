/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicsectorservice;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class NEWACC extends javax.swing.JFrame {

    /**
     * Creates new form NEWACC
     */
    public NEWACC() {
        initComponents();
    }
   public boolean passwordtest (String k)
 {
    
     Pattern spcchar=Pattern.compile("[@!&%$#_*]");
     Pattern ucase=Pattern.compile("[A-Z]");
     Pattern lcase=Pattern.compile("[a-z]");
     Pattern num=Pattern.compile("[0-9]");
     boolean x=false;
     if(k.length()<=8)
     {
      JOptionPane.showMessageDialog(null,"Your password must have atleast 8 characters!!!"); 
      x=true;
     }
     
     if(!spcchar.matcher(k).find())
     {
      JOptionPane.showMessageDialog(null,"Your password must have atleast one special character!!!"); 
      x=true;
     }
     
     if(!ucase.matcher(k).find())
     {
      JOptionPane.showMessageDialog(null,"Your password must have atleast one Uppercase character!!!"); 
      x=true;
     }
     
     if(!lcase.matcher(k).find())
     {
      JOptionPane.showMessageDialog(null,"Your password must have atleast one lowercase character!!!"); 
      x=true;
     }
     
     if(!num.matcher(k).find())
     {
      JOptionPane.showMessageDialog(null,"Your password must have atleast one digit character!!!"); 
      x=true;
      
     }
     
     
        boolean op=x;
        return op;
     
     
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("MARJ HELPLINE CENTRE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 380, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CREATE NEW ACCOUNT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 220, -1));

        jLabel3.setText("USERNAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 80, -1));

        jLabel4.setText("GENDER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 80, -1));

        jLabel5.setText("EB NO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 80, -1));

        jLabel6.setText("DISTRICT");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 150, -1));

        jLabel7.setText("CREATE NEW PASSWORD");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 170, -1));

        jLabel8.setText("VALIDATE PASSWORD");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 170, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 110, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 40, 30));

        jLabel9.setText("/");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 10, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 40, 30));

        jLabel10.setText("/");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 10, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 40, 30));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("MALE");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 70, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("FEMALE");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 90, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 110, 30));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 111, 30));
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 111, 30));

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 459, 140, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\NETBEANS PROJECT\\publicsectorservice\\039fee8fdd06a3ac415798d0757e2b51.jpg")); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 760, 400));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("NOTE:-\nTHE PASSWORD SHOULD SATISFY FOLLOWING CONDITIONS:-\ni) It should have atleast 8 characters.\nii)It should have atleast one special character.\niii)It should have atleast one upper case character.\niv)It should have atleast one lower case character.\nv)It should have atleast one number.");
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 480, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String name = jTextField1.getText();
        String gender=null;
        
        if(jRadioButton1.isSelected())
        {
            gender="male";
            
        }
        else if(jRadioButton2.isSelected())
        {
           gender="female";
          
        }
        
        int a=Integer.parseInt(jTextField2.getText());
        int b=Integer.parseInt(jTextField3.getText());
        int c=Integer.parseInt(jTextField4.getText());
        String eb1=String.valueOf(a);
        String eb2=String.valueOf(b);
        String eb3=String.valueOf(c);
        String eb= eb1+"/"+eb2+"/"+eb3;
        String d=jTextField5.getText();
        String p1=jPasswordField1.getText();
        String p=jPasswordField2.getText();
        
        if(p.equals(p1))
        {
         JOptionPane.showMessageDialog(null,"Password is matching");  
        
         boolean check = passwordtest(p);
             
           if (check==false)
           {
               try{
            Class.forName("java.sql.DriverManager");
            Connection Con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/pss","root","1234");
            Statement st=(Statement)Con.createStatement();
            String q="Insert into eb values('"+name+"','"+gender+"','"+eb+"','"+d+"','"+p+"');";
            st.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"Account created");
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
         
         
       
       
       
           JOptionPane.showMessageDialog(null,"You are being redirected to payment page");
        this.dispose();
        new PAYMENT().setVisible(true);
               
           }
           else 
           {
               JOptionPane.showMessageDialog(null,"Pls Validate password properly ");
           }
        
        
        
        }
        
        
        
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
            java.util.logging.Logger.getLogger(NEWACC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NEWACC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NEWACC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NEWACC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NEWACC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

   

}