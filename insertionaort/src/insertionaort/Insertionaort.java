/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionaort;

import java.util.Scanner;

/**
 *
 * @author Hashim Shafiq
 */
public class Insertionaort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
		System.out.println("Enter values ");
        for(int i=0;i<array.length;i++){
            array[i] = input.nextInt();
        }
        
      int  j, newValue;
      for (int i = 1; i < array.length; i++) {
            newValue = array[i];
            j = i;
            while (j > 0 && array[j - 1] > newValue) {
                  array[j] = array[j - 1];
                  j--;
            }
            array[j] = newValue;
      }
      for(int i =0;i<array.length;i++){
          System.out.println(array[i]+" ");
      }
    
    }
    
    
}
