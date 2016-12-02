/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

/**
 *
 * @author sazzad
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("          Multiplication Table\n");
        System.out.print("  ");
        
        for(int j=1;j<=9;j++)
            System.out.print("   "+ j);
        System.out.println("\n---------------------------------------");
        
        for(int i=1;i<=9;i++){
            System.out.print(i+"|");
        for(int j=1;j<=9;j++){
            System.out.printf("%4d",i*j);
        }
        System.out.println();
        
        }
    }
    
}
