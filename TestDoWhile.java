/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdowhile;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class TestDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("enter an int number(enter 0 for output): ");
        int num=input.nextInt();
        int sum=0;
        do{
            num=input.nextInt();  
            sum+=num;
        
        }while(num!=0);
        System.out.println("The sum is "+sum);
    }
    
}
