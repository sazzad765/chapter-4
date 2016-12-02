/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbreak;

/**
 *
 * @author sazzad
 */
public class TestBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0;
        int num=0;
        while(num<20){
            num++;
            sum+=num;
            if(sum>=100)
                break;
            
        }
        System.out.println("The number is " + num);
         System.out.println("The sum is " + sum);
    }
    
}
