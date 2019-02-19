/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Berkay
 */
public class Main {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.println("***************************");
            
            for (int j = 1; j <= 10; j++) {
                
                int carpim=i*j;
                System.out.println(i+"X"+j+"="+carpim);
                
            }
            System.out.println("***************************");
        }
        
    }
 
}
