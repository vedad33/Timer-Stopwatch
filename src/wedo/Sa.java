/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wedo;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author wedad
 */
public class Sa extends javax.swing.JFrame {

static int milisecond = 0;
static int second = 0;

static int minute = 0;
static int houre = 0;
   static boolean  state= true;
   
   
    public Sa() {
        initComponents();
    }
public static final String song = "C:\\Users\\wedad\\Documents\\NetBeansProjects\\Wedo\\src\\wedo\\al.mp3";
    MP3Player mp = new MP3Player(new File(song));

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        novi = new javax.swing.JFrame();
        s = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        ms = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        alarm = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        p = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        novi.setBounds(new java.awt.Rectangle(500, 300, 650, 400));
        novi.getContentPane().setLayout(null);

        s.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        s.setForeground(new java.awt.Color(255, 0, 0));
        s.setText("00 :");
        novi.getContentPane().add(s);
        s.setBounds(307, 120, 102, 64);

        h.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        h.setForeground(new java.awt.Color(255, 0, 0));
        h.setText("00 :");
        novi.getContentPane().add(h);
        h.setBounds(89, 120, 102, 64);

        ms.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ms.setForeground(new java.awt.Color(255, 0, 0));
        ms.setText("00 :");
        ms.setToolTipText("");
        novi.getContentPane().add(ms);
        ms.setBounds(435, 120, 102, 64);

        m.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        m.setForeground(new java.awt.Color(255, 0, 0));
        m.setText("00 :");
        novi.getContentPane().add(m);
        m.setBounds(198, 120, 102, 64);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        novi.getContentPane().add(jButton2);
        jButton2.setBounds(113, 225, 90, 31);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 204));
        jButton3.setText("Stop");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        novi.getContentPane().add(jButton3);
        jButton3.setBounds(252, 225, 90, 31);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        novi.getContentPane().add(jButton4);
        jButton4.setBounds(377, 225, 100, 31);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Timer Stopwatch");
        novi.getContentPane().add(jLabel5);
        jLabel5.setBounds(188, 25, 228, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Houre");
        novi.getContentPane().add(jLabel7);
        jLabel7.setBounds(89, 91, 56, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Seconds");
        novi.getContentPane().add(jLabel8);
        jLabel8.setBounds(289, 91, 75, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Minute");
        novi.getContentPane().add(jLabel9);
        jLabel9.setBounds(188, 91, 63, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Miliseconds");
        novi.getContentPane().add(jLabel10);
        jLabel10.setBounds(409, 91, 104, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("ALARM :");
        novi.getContentPane().add(jLabel12);
        jLabel12.setBounds(60, 310, 90, 22);

        alarm.setBackground(new java.awt.Color(204, 204, 255));
        alarm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        alarm.setForeground(new java.awt.Color(255, 0, 0));
        novi.getContentPane().add(alarm);
        alarm.setBounds(150, 310, 90, 28);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("min");
        novi.getContentPane().add(jLabel13);
        jLabel13.setBounds(250, 310, 50, 20);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wedo/scry.png"))); // NOI18N
        novi.getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 620, 350);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jToolBar1.setRollover(true);

        jLabel6.setText("jLabel6");

        jLabel11.setText("jLabel11");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 300, 0, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Security Check !");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 240, 28);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 80, 70, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 120, 110, 22);

        n.setBackground(new java.awt.Color(153, 153, 255));
        n.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(n);
        n.setBounds(180, 80, 170, 28);

        p.setBackground(new java.awt.Color(153, 153, 255));
        p.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(p);
        p.setBounds(180, 120, 170, 28);

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Enter");
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 180, 106, 31);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wedo/a.gif"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 870, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String x = n.getText();
        String z = p.getText();

        if (x.equals("Vedad") && z.equals("dracic1984")) {

            novi.show();

        } else {
           
           
            JOptionPane.showMessageDialog(null, "Accses DENIDE Wrong name or password!");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
      
        
        state = true;  
Thread  t = new Thread(){

public void run(){



for(;;){


if(state == true){

    try{
    
    sleep(1);
    
    
    
         

   
    if(milisecond > 700){
    
   
  milisecond = 0;
    second ++;
    
    
    }
    if(second > 60){
    
    milisecond = 0;
    second =0;
    minute++;
    
    }
    if(minute > 60){
    
    milisecond = 0;
    second = 0;
    minute = 0;
    houre++;
    
    }
   

    ms.setText(" : " + milisecond);
     milisecond++;
   s.setText(" : " + second);
    m.setText(" : " + minute);
    h.setText("" + houre);
 String zx = alarm.getText();
       int zx1 = Integer.parseInt(zx);
   if(minute ==zx1 ){
 
    state = false;
       mp.play();
    }
    }
    
    catch(Exception e){
    
    
    
    }

}
else{


break;

}


}




}



};
t.start();



    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        state = false;
        mp.stop();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        state =false;
        houre = 0;
        minute = 0;
        second = 0;
        milisecond = 0;
        h.setText("00 : ");
         m.setText("00 : ");
          s.setText("00 : ");
           ms.setText("00");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
     
    }//GEN-LAST:event_jButton1FocusGained

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
            java.util.logging.Logger.getLogger(Sa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alarm;
    private javax.swing.JLabel h;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel m;
    private javax.swing.JLabel ms;
    private javax.swing.JTextField n;
    private javax.swing.JFrame novi;
    private javax.swing.JPasswordField p;
    private javax.swing.JLabel s;
    // End of variables declaration//GEN-END:variables
}
