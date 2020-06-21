import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int c=1, n=0, num_mayor=0;
		
		while(c<=4) {
			System.out.print("Ingrese número " + c + ": ");
			n = sc.nextInt();
			
			
			if (n>num_mayor)
				num_mayor=n;
				
			c++;
			
		}
		System.out.println("El numero menor es: " + num_mayor);
	}

}
