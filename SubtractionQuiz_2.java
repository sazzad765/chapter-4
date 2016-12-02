/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subtractionquiz_2;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class SubtractionQuiz_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int num_question=10;
        int correctcount=0;
        int count=0;
        long stime=System.currentTimeMillis();
        String output="";
        Scanner input=new Scanner(System.in);
        while(count<num_question){
            
            int num1=(int)(Math.random()*15);
            int num2=(int)(Math.random()*15);
            
            if(num1<num2){
                int temp=num1;
                num1=num2;
                num2=temp;
            }
            
            System.out.println(num1+"-"+num2+" ?");
            
            int ans=input.nextInt();
            if(num1-num2==ans){
                System.out.println("your ans is correct");
                correctcount++;
            }
            else
                System.out.println("your ans is wrong.\n"+num1+"-"+num2+"="+(num1-num2));
                count++;
                output+="\n"+num1+"-"+num2+"="+ans+((num1-num2==ans)?"correct":"wrong");
                
        }
        long endTime = System.currentTimeMillis();
        long ttime=endTime-stime;
        System.out.println("correct count is"+correctcount+
                "\nTest time is " + ttime / 1000 + " seconds\n" + output);
    }
    
}
