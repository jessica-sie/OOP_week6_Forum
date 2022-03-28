import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args){
        // scanner 
        Scanner sc = new Scanner(System.in);

        int numStudents; // num of students 
        int[] grades; // array declaration

        // user input
        do {
            System.out.println("number of students: ");
            numStudents = sc.nextInt();
        }while(numStudents <= 0 );

        // allocate memory for array elements 
        grades = new int[numStudents];

        int ttl =0;
        int max = 0; 
        int min = 1000;
        // populating array
        for (int i = 0 ; i < numStudents; i++){
            do{
                grades[i] = sc. nextInt();
            }while(grades[i]<0 || grades[i] > 100);
            //ttl
            ttl += grades[i];

            // max
            if (grades[i] > max){
                max = grades[i];
            }
            //min 
            if (grades[i]<min){
                min = grades[i];
            }
            
        }

        // computing average 
        double ave = (double)ttl/numStudents;

        //output 
        System.out.println("average: "+ ave);

        System.out.println("max: "+ max);
        System.out.println("min: "+ min);


        
        sc.close();

    }
}
