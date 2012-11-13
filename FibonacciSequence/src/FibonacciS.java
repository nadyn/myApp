import java.util.Scanner;

public class FibonacciS {
	static int fibonacciS(int n) {
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		if (n == 3)
			return 1;
		return fibonacciS(n - 1) + fibonacciS(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число n:");
		String path = sc.nextLine();
		System.out.println("Чи́сла Фибона́ччи при этом n:");

		for (int n = 1; n <= Integer.valueOf(path); n++)
			System.out.print(fibonacciS(n) + ", ");
		System.out.println("...");

	}
}