/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisible_by_5_and_6_not_both;

/**
 *
 * @author sazzad
 */
public class Divisible_by_5_and_6_not_both {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0;
        for(int i=100;i<200;i++){
            if(i%5==0^i%6==0){
                System.out.print(i+" ");
                count++;
            }
            if(count==10){
                System.out.println("\n");
                count=0;
            }
        }
    }
    
}
