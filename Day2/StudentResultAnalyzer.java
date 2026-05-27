import java.util.Scanner;
public class StudentResultAnalyzer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student's Name: ");
		String name = sc.nextLine();
		Double mk1,mk2,mk3,total,avg;
		System.out.print("Enter Marks of 3 Subjects: ");
		mk1 = sc.nextDouble();
		mk2 = sc.nextDouble();
		mk3 = sc.nextDouble();
		total = mk1+mk2+mk3;
		avg = total/3;
		System.out.println("---Result---");		
		System.out.println("Students Name: "+name);
		System.out.println("Marks in Subject 1: "+mk1);
		System.out.println("Marks in Subject 2: "+mk2);
		System.out.println("Marks in Subject 3: "+mk3);
		System.out.println("Total Marks: "+total);
		System.out.println("Average Marks: "+avg);
		System.out.println("Is average Marks Greater than 50?:- "+ (avg > 50));
	}

}
