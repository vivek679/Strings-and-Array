/*
 * Raj is a professor who handles Mathematics ,he wants to conduct evaluation
 *  for the students.He wants to find the highest mark among the students to 
 *  give the proficiency .Write a Java program to help Raj. (Assume 6 set of 
 *  marks provided always)
 */
import java.util.Scanner;
public class Highestmark {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] marks = new int [6];
		boolean invalidMark = false;
		int i=0;
		do {
			marks[i] = sc.nextInt();
			if(marks[i]<0 || marks[i]>100)
				invalidMark = true;
			i++;
		}while(i<6 && !invalidMark);
		if(invalidMark) {
			System.out.println("Invalid mark");
		}
		else {
			int large =0;
			for (int m:marks) {
				if(large<m)
					large=m;
			}
			System.out.println("Highest mark is "+large);
		}
	}
}
