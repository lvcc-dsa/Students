/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findminmax;

/**
 *
 * @author taiki nakamura
 */
public class FindMinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {88,33,55,23,64,123};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++){
            if (max < numbers[i])
                max = numbers[i];
            if (min > numbers[i])
                min = numbers[i];
        }
        System.out.println("Smallest number is " + min);
        System.out.println("Largest number is " + max);
    }
    
}
