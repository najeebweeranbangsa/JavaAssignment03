
import java.io.PrintStream;
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
public class q5 {
    public static void main(String[] args) {
        int arry[] = {23,45,12,56,22};
        
        for (int i = 0; i < arry.length; i++) {
            Arrays.sort(arry);
            System.out.println(arry[i]);
            
        }
    }
}
