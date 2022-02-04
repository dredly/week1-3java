import java.util.Scanner;

public class RewriteNumber {
	public static void main(String args[]) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter an integer between 0 and 9");
			int num = in.nextInt();
			String numWord = "";
			// if (num == 0)
			// numWord = "zero";
			// else if (num == 1)
			// numWord = "one";
			// else if (num == 2)
			// numWord = "two";
			// else if (num == 3)
			// numWord = "three";
			// else if (num == 4)
			// numWord = "four";
			// else if (num == 5)
			// numWord = "five";
			// else if (num == 6)
			// numWord = "six";
			// else if (num == 7)
			// numWord = "seven";
			// else if (num == 8)
			// numWord = "eight";
			// else if (num == 9)
			// numWord = "nine";

			switch (num) {
				case 0:
					numWord = "zero";
					break;
				case 1:
					numWord = "one";
					break;
				case 2:
					numWord = "two";
					break;
				case 3:
					numWord = "three";
					break;
				case 4:
					numWord = "four";
					break;
				case 5:
					numWord = "five";
					break;
				case 6:
					numWord = "six";
					break;
				case 7:
					numWord = "seven";
					break;
				case 8:
					numWord = "eight";
					break;
				case 9:
					numWord = "nine";
					break;
			}

			System.out.println("You entered " + numWord);
		}
	}
}
