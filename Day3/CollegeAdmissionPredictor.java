import java.util.Scanner;
public class CollegeAdmissionPredictor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double maths,phys,chem,avg;
		System.out.print("Enter Maths Marks: ");
		maths = sc.nextDouble();
		System.out.print("Enter Physics Marks: ");
		phys = sc.nextDouble();
		System.out.print("Enter Chemistry Marks: ");
		chem = sc.nextDouble();
		avg = (maths+phys+chem)/3;
		if ((maths >= 70 && phys >= 60 && chem >= 60) || avg >= 80) {
			System.out.println("Admission Status: Eligible");
		}
		else if (maths < 35 || phys < 35 || chem < 35) {
			System.out.println("Admission Status: NOT Eligible");
		}
		if (maths > 90 && phys > 90 && chem > 90) {
			System.out.println("Scholarship Status: Eligible");
		}
		else {
			System.out.println("Scholarship Status: NOT Eligible");
		}
		sc.close();
	}

}
