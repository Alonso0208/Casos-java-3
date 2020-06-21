import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
public class Caso6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int c = 0, edad = 0, aptos = 0;
		String nombre= "", continuar = "S", estado= "";
		
		while (continuar.equals("S") || continuar.equals("s")) {
			c++;
			
			System.out.println("Registro " + c);
			System.out.println("=========");
			
			System.out.print("Nombre: ");
			nombre = sc.nextLine();
			
			System.out.print("Edad: ");
			edad = sc.nextInt();
			
			if (edad>=18) {
				estado= "Apto para votar";
				aptos++;
			}
			else {
				estado= "Menor de edad";
			
			}	
			
			System.out.println("Estado del participante: " + estado);
			
			// reiniciar el objeto sc
			sc.nextLine();
			
			System.out.print("¿Desea continua <S/N>: ");
			continuar = sc.nextLine();
		}
		
		// Resumen	
		
		System.out.println("=======");
		System.out.println("RESUMEN");
		System.out.println("=======");
		System.out.println("Participantes Registrados: " + c);
		System.out.println("Cantidad de participantes aptos para votar: " + aptos);
		
		
	}

}
