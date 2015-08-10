/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Scanner;

/**
 *
 * @author Hashim shafiq
 */
public class Selectionsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Values ?");
        for(int i=0;i<array.length;i++)
            array[i] = input.nextInt();
        
        int endIndex = array.length-1;
        for(int current=0; current<=endIndex;current++){
            swap(array,current,minIndex(array,current,endIndex));
        }
        
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"   ");
        }
        
        
    }
    
    public static int minIndex(int[] array, int startindex,int endindex){
        int indexofmin = startindex;
        for(int index = startindex + 1; index <= endindex ; index++){
            if(array[index] < array[indexofmin])
                indexofmin = index;
        
        }
        return indexofmin;
    }
    
    public static void swap(int[] array,int index1,int index2){
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
    }
    
}
