
import java.util.Scanner;



/**
 *
 * @author najeebpc
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to the array: ");
        for (int i = 0; i < 10; i++) {
            array[i]= sc.nextInt();
        }
        
        //int[] array = new int[10]; 
        //System.out.println(n);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index "+ i + " is " + array[i]);
            
            //array[i]= sc.nextInt();
        }

        
    }
    
}
