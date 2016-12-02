/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgcontinue;

/**
 *
 * @author sazzad
 */
public class Continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        while(i<1000){
            i++;
            if(i%2==0){
                
                continue;
            }
        
        System.out.println(i);
        }
        
    }
    
}
