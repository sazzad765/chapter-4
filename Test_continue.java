/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_continue;

/**
 *
 * @author sazzad
 */
public class Test_continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0;
        int num=0;
        while(num<20){
            num++;
            
            if(num==10||num==11)
               continue;
            sum+=num;
            
        }
        System.out.println("The sum is " + sum);
    }
    
}
