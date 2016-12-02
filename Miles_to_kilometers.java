/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miles_to_kilometers;

/**
 *
 * @author sazzad
 */
public class Miles_to_kilometers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Miles       kilometers "); 
         for(double i=1;i<11;i++){
         System.out.printf( "\n"+i+"        "+"%.1f",(i*1.609));
         }
    }
    
}
