import java.util.Scanner;

public class what {
	public static void main(String[] args) {
		Scanner asa = new Scanner(System.in);
		boolean quit = false;
		int opt1 = 0;
		float total = 0, num1 = 0, num2 = 0;
		System.out.print("Enter the first number: ");
		num1 = asa.nextInt();
		System.out.print("Enter the second numnber: ");
		num2 = asa.nextInt();
		do {
			System.out.println("1. Multiplication");
			System.out.println("2. Divison");
			System.out.println("3. Addition");
			System.out.println("4. Subtraction");
			System.out.println("5. Quit");
			System.out.print("Enter an option: ");
			opt1 = asa.nextInt();
			switch (opt1) {
			case 1:
				total = num1 * num2;
				break;
			case 2:
				total = num1 / num2;
				break;
			case 3:
				total = num1 + num2;
				break;
			case 4:
				total = num1 - num2;
				break;
			case 5:
				total = 0;
				num1 = 0;
				num2 = 0;
				System.out.println("Numbers set to 0");
				System.out.print("End program?(true/false): ");
				quit = asa.nextBoolean();
				while (quit == true) {
					System.exit(0);
				}
			}
			System.out.println("total: " + total);
			if (num1 != 0) {
				System.out.print("Continue calculation. Enter a number: ");
				num2 = asa.nextInt();
				num1 = total;
			} else {
				System.out.print("Enter the first number: ");
				num1 = asa.nextInt();
				System.out.print("Enter the second number: ");
				num2 = asa.nextInt();
			}
		} while (quit == false);

	}
}
