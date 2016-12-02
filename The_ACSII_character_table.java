/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_acsii_character_table;

/**
 *
 * @author sazzad
 */
public class The_ACSII_character_table {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int count=0;
        for(char i='!';i<='~';i++){
            System.out.print(i+" ");
            count++;
            if(count>9){
                System.out.println("\n");
                count=0;
            }
        }
    }
    
}
