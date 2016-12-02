/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computing_future_tuition;

/**
 *
 * @author sazzad
 */
public class Computing_future_tuition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        double t=10000;
        double temp=0;
        
        System.out.println("year     tuition");
        while(i<11){
           t=(t*0.05)+t; 
            System.out.printf(i+"     %.2f\n",t);
            i++;
          if(i<5){
              temp=temp+t;
              
            
        }
        } 
      System.out.println("total cost of four years: "+temp);  
    }
    
}
