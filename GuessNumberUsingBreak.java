/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumberusingbreak;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class GuessNumberUsingBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=(int)(Math.random()*101);
        Scanner input=new Scanner(System.in);
        
        while(true){
            System.out.println("Enter your guess number(0 to 100): ");
            int g=input.nextInt();
            
            if(g==num){
                System.out.println("Yes , the number is "+num);
                break;
            }
            else if(g>num){
                System.out.println("Your guess is too high");
            }
            else
                System.out.println("Your guess is too low");
        }
        
    }
    
}
