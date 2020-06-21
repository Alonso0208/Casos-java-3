import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c=1, n=0, num_menor=10000000;
		while (c<=5) {
			System.out.print("Ingrese número " + c + " : ");
			n = sc.nextInt();
			
			if (n<num_menor)
				num_menor= n;
		
			c++;
		}

		System.out.println("El número menor es: " + num_menor);
		
	}

}
