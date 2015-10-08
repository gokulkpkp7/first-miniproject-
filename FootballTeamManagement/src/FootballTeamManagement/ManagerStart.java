/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FootballTeamManagement;
 

/**
 *
 * @author jayakrishnan
 */
public class ManagerStart {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  System.out.println("Run()");
                try{
                         System.out.println("Run()->try");
                    Thread.sleep(3000);
                    for(int i=0;i<=5;i++){
                         System.out.println(i);
            }
                }
                catch(Exception e)
                { 
                    System.out.println(e);
                }
        new Login().setVisible(true);

    }
    
}
