/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class q1 {
    public static void main(String[] args) {
        
    int[] aryNums = {23,6,47,35,2,14};
    int i;
    int arrayTotal=0;
    int average = 0;
    
    for(i=0;i<aryNums.length;i++){
    
    arrayTotal = arrayTotal + aryNums[i];
    }
    
    average = arrayTotal/aryNums.length;    
    System.out.println("total"+ average);
        
    }
    
}
