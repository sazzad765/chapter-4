/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

/**
 *
 * @author sazzad
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=2;
        System.out.println("The first 50 prime numbers are \n");
        
        while(num<1000){
            boolean is_p=true;
            
            for(int d=2;d<=num/2;d++){
                if(num%d==0){
                    is_p=false;
                    break;
            }
                }
            if(is_p){
                System.out.println(num);
           
        }
         num++;
        }
    }
    
}
