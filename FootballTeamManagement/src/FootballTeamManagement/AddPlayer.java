/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FootballTeamManagement;

import java.awt.HeadlessException;  
import java.sql.ResultSet;
import java.sql.SQLException; 
import javax.swing.JOptionPane;

/**
 *
 * @author jayakrishnan
 */
public class AddPlayer extends javax.swing.JFrame {
 
    /**
     * Creates new form AddTeam
     */
    public AddPlayer() {
        initComponents();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Playername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Playerrating = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Playerteam = new javax.swing.JTextField();
        Repeatall = new javax.swing.JCheckBox();
        Age = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Player");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Playername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Playername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Playername.setToolTipText("");
        Playername.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Player Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), java.awt.Color.black)); // NOI18N
        Playername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Playername.setSelectionColor(new java.awt.Color(255, 51, 51));
        Playername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayernameActionPerformed(evt);
            }
        });
        Playername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PlayernameKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add New Player");

        Playerrating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Playerrating.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Playerrating.setToolTipText("");
        Playerrating.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Player Rating(?/10)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), java.awt.Color.black)); // NOI18N
        Playerrating.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Playerrating.setSelectionColor(new java.awt.Color(255, 51, 51));
        Playerrating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerratingActionPerformed(evt);
            }
        });
        Playerrating.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PlayerratingKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Submit");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(204, 204, 204)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Playerteam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Playerteam.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Playerteam.setToolTipText("");
        Playerteam.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Player Team", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), java.awt.Color.black)); // NOI18N
        Playerteam.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Playerteam.setSelectionColor(new java.awt.Color(255, 51, 51));
        Playerteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerteamActionPerformed(evt);
            }
        });
        Playerteam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PlayerteamKeyPressed(evt);
            }
        });

        Repeatall.setBackground(new java.awt.Color(255, 255, 255));
        Repeatall.setText(" Repeat");
        Repeatall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepeatallActionPerformed(evt);
            }
        });

        Age.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Age.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Age.setToolTipText("");
        Age.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Age", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), java.awt.Color.black)); // NOI18N
        Age.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Age.setSelectionColor(new java.awt.Color(255, 51, 51));
        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });
        Age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeKeyPressed(evt);
            }
        });

        jLabel2.setText("Clear");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(Repeatall)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Playername, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(Playerrating)
                            .addComponent(Playerteam)
                            .addComponent(Age))
                        .addContainerGap(125, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Playername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Playerteam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Playerrating, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Repeatall)
                    .addComponent(jLabel2))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 437));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PlayernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlayernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            Submit();
        }
    }//GEN-LAST:event_PlayernameKeyPressed

    private void PlayernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayernameActionPerformed

    private void PlayerratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerratingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayerratingActionPerformed

    private void PlayerratingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlayerratingKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            Submit();
        }
    }//GEN-LAST:event_PlayerratingKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            Submit();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PlayerteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerteamActionPerformed
       
     // TODO add your handling code here:
    }//GEN-LAST:event_PlayerteamActionPerformed

    private void PlayerteamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlayerteamKeyPressed
        // TODO add your handling code here:
       if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
        Submit();
       }
    }//GEN-LAST:event_PlayerteamKeyPressed

    private void RepeatallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepeatallActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_RepeatallActionPerformed

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void AgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            Submit();
        }
    }//GEN-LAST:event_AgeKeyPressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new AddPlayer().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(AddPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPlayer().setVisible(true);
            }
        });
    }
    public void Submit(){
        float Rating=0.0f;
        String N=Playername.getText();
        String B = Playerrating.getText();
        String R=Playerteam.getText();
        String Ag=Age.getText();
        try{
                Rating=Float.parseFloat(B);
        }
        catch(Exception e){
            System.out.println("Player Rating Not a Float");
        }
        
        if(N.length()==0){
            JOptionPane.showMessageDialog(this, "Specify Player Name");
            Playername.requestFocus();
        }
        else if(!N.matches("^[a-zA-Z0-9_\\s]*$")){
            JOptionPane.showMessageDialog(this, "Player Name Should contain Alphabets ,numbers and white spaces only ");
            Playername.requestFocus();
       }
        else if(R.length()==0){
            JOptionPane.showMessageDialog(this, "Specify Team Name");
            Playerteam.requestFocus();
        }
        else if(!R.matches("^[a-zA-Z0-9_\\s]*$")){
            JOptionPane.showMessageDialog(this, "Team Name Should contain Alphabets ,numbers and white spaces only ");
            Playerteam.requestFocus();
       }
        else if(B.length()==0){
            JOptionPane.showMessageDialog(this,"Specify Player rating ");
            Playerrating.requestFocus();
        }
        else if(   !checkIfNumber(B)){
            JOptionPane.showMessageDialog(this,"Rating Must be a number   ");
            Playerrating.requestFocus(); 
            System.out.println("B"+B);
            System.out.println("Rating"+Rating);
        }
        else if(  (Rating<1.0f) ||(Rating>10.0f) ){
            JOptionPane.showMessageDialog(this,"Rating Must be between 1 and 10 ");
            Playerrating.requestFocus(); 
        }
        else if(Ag.length()==0){
            JOptionPane.showMessageDialog(this,"Specify Player Age ");
            Age.requestFocus();
        }
        else if( (!checkIfNumber(Ag)) || (Integer.parseInt(Ag)<14) ||(Integer.parseInt(Ag)>36) ){
            JOptionPane.showMessageDialog(this,"Rating Must be    between 14 and 36 ");
            Age.requestFocus();
        }
        else { 
            int count=1;
            int Teamnamecount=0;
            int countPlayer=0;
            dbhandler db=new dbhandler();
            try{
                ResultSet r = db.st.executeQuery("SELECT COUNT(*) FROM player");
                r.next();
                count= r.getInt(1)+1;
                r.close(); 
            }
            catch(Exception e){
                System.out.println(e);
            JOptionPane.showMessageDialog(this,"Error Occured \n\t["+e+"]");
            }
            try{
                ResultSet r = db.st.executeQuery("SELECT COUNT(*) FROM player where playername='"+N+"'");
                r.next();
                countPlayer= r.getInt(1);
                r.close(); 
            }
            catch(Exception e){
                System.out.println(e);
            JOptionPane.showMessageDialog(this,"Error Occured \n\t["+e+"]");
            }
            
            try{
                  ResultSet r2 = db.st.executeQuery("SELECT COUNT(*) FROM team where teamname='"+R+"'");
                r2.next();
                Teamnamecount= r2.getInt(1);
                r2.close(); 
                
            }
            catch(Exception e){
                System.out.println(e);
            JOptionPane.showMessageDialog(this,"Error Occured \n\t["+e+"]");
            }
 
            System.out.println("Teamnamecount="+Teamnamecount);
            System.out.println("name="+R);
            
            
            if(countPlayer!=0 ){
                JOptionPane.showMessageDialog(this," Name Already exist");
                Playername.requestFocus();
             }
            else if(Teamnamecount==0 ){
                JOptionPane.showMessageDialog(this," Team Donot exist");
                Playername.requestFocus();
           System.out.println("::"+Teamnamecount);
            }
            else{        
                System.out.println(count);
                System.out.println(N);
                System.out.println(R);
                System.out.println(B);
                System.out.println(Rating);

try{ 
    String sql=" INSERT INTO player(PLAYERID,PLAYERNAME,PLAYERTEAM,PLAYERRATING,AGE)"
            + "   VALUES ('"+count+"','"+N+"', '"+R+"',"+Rating+","+Ag+")";
           
    db.st.executeUpdate(sql);
    int TP=0;
      try{
                  ResultSet r3 = db.st.executeQuery("SELECT TOTALPLAYERS FROM team where teamname='"+R+"'");
                r3.next();
                Teamnamecount= r3.getInt(1);
                r3.close(); 
                
            }
            catch(Exception e){
                System.out.println(e);
            JOptionPane.showMessageDialog(this,"Error Occured cant select toatlplayers \n\t["+e+"]");
            }
      TP=Teamnamecount+1;
    String sql2=" UPDATE team set TOTALPLAYERS="+TP+" where TEAMNAME='"+R+"' ";       
    db.st.executeUpdate(sql2);
    
            System.out.println("player Added ");
            JOptionPane.showMessageDialog(this,"player Added ");
          if(Repeatall.isSelected()) { 
              AddPlayer A=new AddPlayer(); 
              A.setVisible(true);
              A.Repeatall.setSelected(true);
              
          } 
          this.dispose();
            }
            catch(SQLException | HeadlessException e){
                System.out.println(e);
            JOptionPane.showMessageDialog(this,"Error Occured \n\t["+e+"]");
            }
        }
        }
        
        
    }
    
    
     public boolean checkIfNumber(String in) {
        
        try {
 
            Float.parseFloat(in);
        
        } catch (NumberFormatException ex) {
            return false;
        }
        
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JTextField Playername;
    private javax.swing.JTextField Playerrating;
    private javax.swing.JTextField Playerteam;
    private javax.swing.JCheckBox Repeatall;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}
