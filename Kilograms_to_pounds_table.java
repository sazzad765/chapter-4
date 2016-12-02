/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilograms_to_pounds_table;

/**
 *
 * @author sazzad
 */
public class Kilograms_to_pounds_table {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Kilograms       pounds\n");
       for(double i=1;i<200;i=i+2){
           System.out.printf( "\n"+i+"        "+"%.1f",(i*2.2));
       }
    }
    
}
