/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding_the_factors_of_an_integer;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Finding_the_factors_of_an_integer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter intrger number: ");
        int n=input.nextInt();
        for(int i=2;i<=n;){
            if(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
            else{
                i++;
            }
        }
        
    }
    
}
