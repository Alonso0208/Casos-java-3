import java.util.Scanner;
public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		// for ascendente de 1 en 1
		for (int i = 1; i <=10; i++) 
			System.out.println("Bienvenido " + nombre + " al curso.");
		
		// for descendente de 2 en 2
		for (int j = 10; j >= 1; j-=2)
			System.out.println("Bienvenido " + nombre + " al curso.");
		
			
			
			
	}

}
