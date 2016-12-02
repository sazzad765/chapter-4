/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilograms_to_pounds_2;

/**
 *
 * @author sazzad
 */
public class Kilograms_to_pounds_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Kilograms      pounds          pounds           Kilograms  \n");
       for(int i=1,j=20;i<200;i=i+2,j=j+5){
           System.out.printf( "\n"+i+"\t\t"+"%.1f",(i*2.2));
           System.out.printf("\t\t"+j+"\t\t%.2f",j/2.2);
       }
    }
    
}
