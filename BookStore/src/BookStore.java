
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class BookStore {

	public static void main(String[] args) throws IOException {
		String[][] books = new String[100][];
		Double[][] prices = new Double[100][];
		System.out.println("Hello and welcome to our online book store . ");
		LocalDate date = LocalDate.now();
		System.out.println("Today is : " + date);
		Scanner scanner = new Scanner(System.in);

		try {
			while (true) {
				Integer rowIndex = 0;
				System.out.println("Please Select from menu : ");
				System.out.println("[1] :Submit your purchacse");
				System.out.println("[01] :Exit");
				Integer menu = scanner.nextInt();
				switch (menu) {
				case 1:
					System.out.println("Please enter your first name : ");
					String firstName = scanner.next();
					System.out.println("Please enter your last name : ");
					String lastName = scanner.next();
					System.out.println("How many books do you want to buy : ");
					int count = scanner.nextInt();
					Double totalPrice = 0d;
					for (int indexOfBook = 0; indexOfBook < count; indexOfBook++) {
						System.out.println("Please enter the name of book : ");
						String nameOfBook = scanner.next();
						System.out.println("Please enetr price of book : ");
						Double price = scanner.nextDouble();
						totalPrice += price;

						books[rowIndex][indexOfBook] = nameOfBook;
						prices[rowIndex][indexOfBook] = price;
					}
					System.out.println("Total price is : " + totalPrice + " Euro");
					System.out.println("Thanks for your purchase :) ");
					System.out.println("Goodbye");
					rowIndex++;
					break;

				case 0:
					System.out.println("Goodbye");
					System.exit(0);
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
