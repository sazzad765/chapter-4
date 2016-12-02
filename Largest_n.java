/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest_n;

/**
 *
 * @author sazzad
 */
public class Largest_n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=1;
        while(Math.pow(n, 3)<=12000){
            n++;
        }
        n--;
        System.out.println("The n is "+n);
        System.out.println("The n^2 is "+Math.pow(n, 3));
    }
    
}
