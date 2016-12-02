/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=(int)(Math.random()*101);
        
        Scanner input=new Scanner(System.in);
        
        int guess=-1;
        while(guess!=num){
            
            System.out.println("enter guess number(0-100): ");
            guess=input.nextInt();
            
            if(guess==num)
                System.out.println("Your number is "+num);
            else if(guess>num)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }
    }
    
}
