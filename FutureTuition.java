/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretuition;

/**
 *
 * @author sazzad
 */
public class FutureTuition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double t=10000;
        int year=1;
        while(t<20000){
            t=t*1.07;
            year++;
            
        }
        System.out.println("Tuition will be doubled in " + year + " years");
    }
    
}
