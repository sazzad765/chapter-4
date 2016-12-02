/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentinelvalue;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class SentinelValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("enter an int number(enter 0 for output): ");
        int num=input.nextInt();
        int sum=0;
        while(num!=0){
            sum+=num;
         
            num=input.nextInt();   
        
        }
        System.out.println("The sum is "+sum);
    }
    
}
