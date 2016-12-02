/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallest_n;

/**
 *
 * @author sazzad
 */
public class Smallest_n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=1;
        while(Math.pow(n, 2)<=12000){
            n++;
        }
        System.out.println("The n is "+n);
        System.out.println("The n^2 is "+Math.pow(n, 2));
    }
    
}
