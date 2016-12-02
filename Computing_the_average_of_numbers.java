/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computing_the_average_of_numbers;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Computing_the_average_of_numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p=0;
        int n=0;
        int data;
        double total=0;
        Scanner input= new Scanner(System.in);
        do{
            System.out.println("Enter an int value, the program exits if the input is 0: ");
            data=input.nextInt();
            total+=data;
            if(data>0){
                p++;
            }
            if(data<0){
                n++;
            }
                
                
        }while(data!=0);
        double a=(total/(p+n));
        System.out.println("The number of positives is: "+p);
        System.out.println("The number of negatives is: "+n);
        System.out.println("The total is: "+total);
        System.out.println("The average is: "+a);
        
    }
    
}
