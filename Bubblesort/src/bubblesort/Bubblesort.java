/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hashim Shafiq
 */
public class Bubblesort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
		System.out.println("Enter Values ?");
        for(int i=0;i<array.length;i++){
            array[i] = input.nextInt();
        }
        
        
      boolean swapped = true;
      int current = 0;
      int tmp;
      while (swapped) {
            swapped = false;
            current++;
            for (int i = 0; i < array.length - current ; i++) {                                       
                  if (array[i] > array[i + 1]) {                          
                        tmp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = tmp;
                        swapped = true;
                  }
            }                
      }
      // for(int i=0;i<array.length;i++){
        //   System.out.print(array[i]+" ");
       //}
      System.out.print(Arrays.toString(array));
        
    }
    
}
