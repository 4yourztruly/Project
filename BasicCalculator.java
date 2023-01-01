import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args)
	{
		// Lagrar två nummer
		double nummer1, nummer2;

		// Tar användarens input
		Scanner sc = new Scanner(System.in);

		System.out.println("Ange två nummer");

		// Tar inmatade numren
		nummer1 = sc.nextDouble();

		nummer2 = sc.nextDouble();

		System.out.println("Skriv en av följande (+,-,*,/)");

		char op = sc.next().charAt(0);

		
		
		double o = 0;

		
		
		switch (op) {
		
		

		// Detta adderar numrena
		case '+':

			o = nummer1 + nummer2;

			break;
			
			

		// Detta subtraherar numren
		case '-':

			o = nummer1 - nummer2;

			break;
			
			

		// Detta multiplicerar numren
		case '*':

			o = nummer1 * nummer2;

			break;

			
			
		// Detta dividerar numrena
		case '/':

			o = nummer1 / nummer2;

			break;

			
			
		default:

			System.out.println("System Fel");

			break;
			
		}

		System.out.println("Resultat:");

		System.out.println();

		// Detta skriver ut resultatet
		System.out.println(nummer1 + " " + op + " " + nummer2
						+ " = " + o);
		
	}
	
}
