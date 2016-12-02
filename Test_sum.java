/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_sum;

/**
 *
 * @author sazzad
 */
public class Test_sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float sum=0;
       
        for(float i =0.01f;i<=1.0f;i=i+0.01f)
        sum+=i;
        System.out.println("The sum is "+sum);
    }
    
}
