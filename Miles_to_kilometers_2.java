/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miles_to_kilometers_2;

/**
 *
 * @author sazzad
 */
public class Miles_to_kilometers_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Miles           Kilometers      Kilometers      Miles  ");
       for(int i=1,j=20;i<10;i++,j=j+5){
           System.out.printf( "\n"+i+"\t\t"+"%.3f",(i*1.609));
           System.out.printf("\t\t"+j+"\t\t%.3f",j/1.609);
       }
    }
    
}
