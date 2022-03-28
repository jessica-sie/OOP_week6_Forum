// Write a program called PrintArray which prompts user for the number of items in an array (a non-negative integer) and saves it in an int variable called NUM_ITEMS. It then prompts user for the values of all the items and saves them in an int array called items. The program shall then print the contents of the array in the form of [x1, x2, ..., xn].
import java.util.Scanner;
import java.util.Arrays;


public class PrintArray{
    public static void main(String[] args){
        // scanner 
        Scanner sc = new Scanner(System.in);
        int NUM_ITEMS; // for number of items in array 
        int[] items; // array declaration

        // user input for number of elements 
        do {
            System.out.println("number of items in array: ");
            NUM_ITEMS = sc.nextInt();
        }
        while(NUM_ITEMS <= 0);

        // allocate memory for array elements 
        items = new int[NUM_ITEMS];

        // populating array w user input 
        for (int i = 0; i< NUM_ITEMS; i++){
            System.out.println();
            items[i] = sc.nextInt();
        }

        // printing array elements 
        for (int i  = 0 ; i < NUM_ITEMS; i++){
            System.out.println(items[i]);
        }
        
        sc.close();
    }
}