/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding_the_highest_score;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Finding_the_highest_score {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of student: ");
        int n=input.nextInt();
        int m=0;
        String mn="";
        for(int i=0;i<n;i++){
            System.out.println("enter the student’s name and score: ");
            String name=input.next();
            int num=input.nextInt();
            if(num>m){
                m=num;
                mn=name;
            }
        }
        System.out.println("the name of the student with the highest score is : "+mn+"\nthe highest score is: "+m);
    }
    
}
