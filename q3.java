
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author najeeb
 */
public class q3 {
    public static void main(String[] args) {
        int arry[]={23,6,47,35,2,14};
        System.out.println("The Array is :");
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
        System.out.println("The  Odd Numbers in Array are :");
        int i = 0;
        for ( i = 0; i < arry.length; i++){
            int j = arry[i]%2;
            if (j ==1) {
            System.out.println(arry[i]);
        }
            }
        
        
        }
        
    }

