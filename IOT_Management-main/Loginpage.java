package com.iotprojectmanagmentforuniversity;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.BorderLayout;
//import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;

public class Loginpage extends javax.swing.JFrame {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
   * Creates new form Intro
   */
  public Loginpage() {
  	
  	setSize(1366,768);
  	//setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//setLocation(1376,768);
		setLocation(150,150);
		/*setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Hp\\Pictures\\NEWIOTBACKIMG.jpg")));
		setLayout(new FlowLayout());
		JLabel L1 = new JLabel();
		add(L1);
		*/
      initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  
  // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
  private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      user = new javax.swing.JLabel();
      Passwrd = new javax.swing.JLabel();
      User = new javax.swing.JTextField();
      //Pass = new javax.swing.JTextField();
      Pass = new javax.swing.JPasswordField();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setContentPane(new JLabel(new ImageIcon("C:\\Users\\Hp\\Pictures\\NEWIOTBACKIMG.jpg")));

      jButton1.setText("Login");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jButton1ActionPerformed(evt);
          }
      });

      jButton2.setText("Cancel");
      jButton2.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              jButton2ActionPerformed(evt);
          }
      });

      user.setFont(new java.awt.Font("Footlight MT Light", 3, 18)); // NOI18N
      user.setText("Username :-");

      Passwrd.setFont(new java.awt.Font("Gadugi", 3, 18)); // NOI18N
      Passwrd.setText("Password :-");

      User.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              UserActionPerformed(evt);
          }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
      		
      		
          jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
              .addContainerGap(164, Short.MAX_VALUE)
              .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(80, 80, 80)
              .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(196, 196, 196))
          .addGroup(jPanel1Layout.createSequentialGroup()
              .addGap(69, 69, 69)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(Passwrd, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                  .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(User, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(Pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
          jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
              .addGap(55, 55, 55)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(Passwrd, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                  .addComponent(Pass))
              .addGap(102, 102, 102)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(95, 95, 95))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
              .addContainerGap(375, Short.MAX_VALUE)
              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(304, 304, 304))
      );
      layout.setVerticalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
              .addContainerGap(220, Short.MAX_VALUE)
              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(124, 124, 124))
      );

      pack();
  }// </editor-fold>                        

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      // TODO add your handling code here:
      try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage","","");
          Statement stmt=con.createStatement();
          String sql="Select*from iotprojectdata where UserName='"+user.getText()+"' and Password='"+Pass.getText().toString()+"'";
          ResultSet rs=stmt.executeQuery(sql);
          if(rs.next()){
              JOptionPane.showMessageDialog(null, "Login succesfully");
          }else{
               JOptionPane.showMessageDialog(null, "Incorrect Username or password");
               con.close();
          }

      }catch(Exception e){
          System.out.println(e);    
      }
          
        if(User.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(this, "Please Enter Username");
          User.setText("");
          User.grabFocus();
      }
      else if(Pass.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(this, "Please Enter Password");
          Pass.setText("");
          Pass.grabFocus();
      }else{
          new Project().setVisible(true);
      }
  }                                        

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      System.exit(0);
  }                                        

  private void UserActionPerformed(java.awt.event.ActionEvent evt) {                                     
      // TODO add your handling code here:
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
          java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
          java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
          java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
          java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
          @Override
          public void run() {
              new Loginpage().setVisible(true);
          }
      });
  }

  // Variables declaration - do not modify                     
  private javax.swing.JTextField Pass;
  private javax.swing.JLabel Passwrd;
  private javax.swing.JTextField User;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel user;
  // End of variables declaration                   
}
