/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlosimulation;

/**
 *
 * @author sazzad
 */
public class MonteCarloSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int num_t=10000000;
        int num_h=0;
        
        for(int i=0;i<num_t;i++){
            double x=Math.random() *2.0-1;
            double y=Math.random() *2.0-1;
             if(x*x+y*y<=1)
                 num_h++;
             
        }
        double pi=4.0*num_h/num_t;
        System.out.println("PI is"+pi);
       
    }
    
}
