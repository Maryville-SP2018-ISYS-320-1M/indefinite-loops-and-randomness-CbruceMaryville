import java.util.Scanner;
import java.util.Random;

/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/22/2018
*/

public class P5_RandomMessageRepeater {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.println(getRandomMessage(""));

		System.out.println("Now testing whileRepeater");
		String GetMessage = getRandomMessage("");
		whileRepeater(GetMessage);

		System.out.println("Now testing doWhileReater");
		String GetMessage2 = getRandomMessage("");
		doWhileRepeater(GetMessage);
	}

	public static String getRandomMessage(String output) {
		Random rand = new Random();
		int randomNum = rand.nextInt(3);

		if (randomNum == 0) {
			output = "This is the first random expression";
		}
		if (randomNum == 1) {
			output = "You got the second random expression";
		}
		if (randomNum == 2) {
			output = "Lucky you getting the third random expression";
		}
		return output;
	}

	public static String whileRepeater(String GetMessage) {
		int input = 0;
		while (input != -1) {
			System.out.println(GetMessage);
			Scanner console = new Scanner(System.in);

			System.out.println("To NOT hear again press -1");

			input = console.nextInt();
		}
		return GetMessage;

	}

	public static String doWhileRepeater(String GetMessage2) {
		int input = 0;
		do {
			System.out.println(GetMessage2);
			Scanner console = new Scanner(System.in);

			System.out.println("To NOT hear again press -1");

			input = console.nextInt();
		} while (input != -1);
		return GetMessage2;
	}
}
