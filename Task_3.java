//Task: Student Grade Calculator

package Level_1;

import java.util.Scanner;

public class Task_3 {
	
	public static void find_Grade(int no) {
		
		Scanner sc = new Scanner(System.in);
		double sum = 0; 

        for (int i = 1; i <= no; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = sc.nextDouble();
            sum += grade;
        }

        // Calculate average
        double average = sum / no;

        // Display the average
        System.out.printf("The average grade is: %.2f%n", average);
        sc.close();
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of grades to be entered: ");
        int no = sc.nextInt();
        
        find_Grade(no);
        sc.close();
	}

}
