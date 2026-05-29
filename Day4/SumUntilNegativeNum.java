import java.util.Scanner;
public class SumUntilNegativeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum=0;
		do {
			System.out.print("Enter a number: ");
			num = sc.nextInt();
			if (num < 0) {
				break;
			}
			sum+=num;
		}
		while (num > 0);
		System.out.println("Sum is "+sum);
		sc.close();
	}

}
