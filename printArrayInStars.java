import java.util.Scanner;

public class printArrayInStars {
    public static void main(String[] args){
        // scanner 
        Scanner sc = new Scanner(System.in);

        int NUM_ITEMS;
        int[] items;// declaring array 

        // user input for number of elements (non negative integer)
        do {
            System.out.println("number of items in array: ");
            NUM_ITEMS = sc.nextInt();
        }
        while(NUM_ITEMS <= 0);

        // allocate memory for array elements 
        items = new int[NUM_ITEMS];

        // populating array w user input 
        for (int i = 0; i< NUM_ITEMS; i++){
            System.out.println("array element: ");
            items[i] = sc.nextInt();
        }

        // printing array elements 
        for (int i  = 0 ; i < NUM_ITEMS; i++){
            for (int j = 0; j < items[i]; j++){
                System.out.print('*');
            }
            System.out.println(items[i]);
        }
        
        sc.close();
    }
}
