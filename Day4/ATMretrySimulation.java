import java.util.Scanner;
public class ATMretrySimulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin, cPin = 7456;
		do {
			System.out.print("Enter 4-Digit pin: ");
			pin = sc.nextInt();
			if (pin != cPin) {
				System.out.println("Try Again!");
			}
			else {
				System.out.println("Success.");
			}
		}
		while (pin != cPin);
		sc.close();
	}

}
