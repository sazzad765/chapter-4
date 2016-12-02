/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentinelvalueusingconfirmationdialog;

import javax.swing.JOptionPane;

/**
 *
 * @author sazzad
 */
public class SentinelValueUsingConfirmationDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0;
        
        int op=JOptionPane.YES_OPTION;
        while(op==JOptionPane.YES_OPTION){
            String dataString=JOptionPane.showInputDialog("Enter an int value");
            
            int data=Integer.parseInt(dataString);
            sum+=data;
            op=JOptionPane.showConfirmDialog(null, "continue");
            
        }
        
        JOptionPane.showMessageDialog(null, "The sum is "+sum);
    }
    
}
