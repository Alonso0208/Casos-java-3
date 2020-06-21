import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c=1, factorial=1;
	System.out.print("Ingrese Número: ");
	int n=sc.nextInt();
	 while(c<=n) {
		 factorial*=c;
		 c++;
	 }
	 
	 System.out.println("El factorial de " + n + " es: " + factorial);

	}

}
