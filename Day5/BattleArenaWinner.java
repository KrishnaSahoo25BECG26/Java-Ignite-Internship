import java.util.Scanner;
public class BattleArenaWinner {
	static String result(int score1, int score2) {
		if (score1 > score2) {
			return "Player1 Wins!";
		}
		else if (score1 < score2) {
			return "Player2 Wins!";
		}
		else {
			return "Match Draw";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Score of player 1: ");
		int score1 = sc.nextInt();
		System.out.print("Enter your Score of player 2: ");
		int score2 = sc.nextInt();
		System.out.println(result(score1, score2));
		sc.close();
	}

}
