/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthmetic;

import java.util.Scanner;

/**
 *
 * @author Gurveer Singh
 */

        enum Singh
                {
                         Add, Subtract,Multiplication;
                }
public class Arthmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
         int Input = s.nextInt(); 
         
         System.out.println("Enter Operation");
         String Input2 = s.nextLine();
         if(Input2=="max")
                 {
                     System.out.println("You Got it");
                 }
         else{
                 System.out.println("Error");}
         
         Singh operation= Singh.Add;//
         System.out.println(operation);
         
    }
}

             
    

    

