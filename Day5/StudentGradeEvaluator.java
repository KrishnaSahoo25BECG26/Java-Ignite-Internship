import java.util.Scanner;
public class StudentGradeEvaluator {
	static char calcGrade(double mks) {
		if (mks >= 90) {
			return 'A';
		}
		else if (mks >= 80 && mks < 90) {
			return 'B';
		}
		else if (mks >= 70 && mks < 80) {
			return 'C';
		}
		else if (mks >= 60 && mks <70) {
			return 'D';
		}
		else{
			return 'F';
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Marks: ");
		double marks = sc.nextDouble();
		char grade = calcGrade(marks);
		System.out.println("Your Grade is "+grade);
		sc.close();
	}

}
