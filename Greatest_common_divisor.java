/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatest_common_divisor;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Greatest_common_divisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two integer number : "); 
        int num1=input.nextInt();
        
        int num2=input.nextInt();
        
        int g=1;
        int k=2;
        while (k<=num1&&k<=num2){
            if(num1%k==0&&num2%k==0)
                g=k;
            k++;
        }
        System.out.println("the greatest common divisor for " + g);
    }
    
}
