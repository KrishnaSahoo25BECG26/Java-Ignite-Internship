import java.util.Scanner;
public class PalindromeNumCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp,dig,rev = 0;
		temp = num;
		while (temp != 0) {
			dig = temp%10;
			rev = rev*10+dig;
			temp /= 10;
		}
		if (rev == num) {
			System.out.println("It is a Palindrome Number.");
		}
		else {
			System.out.println("It is NOT a Palindrome Number.");
		}
		sc.close();
	}

}
