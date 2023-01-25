
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bcs2
 */
public class q2 {
    public static void main(String[] args) {
        int array[] = {23,6,47,35,2,14};
        System.out.println("The Array Before Sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
        System.out.println("The Array Agter Sort: ");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
    }
}
