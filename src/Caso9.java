import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float  promedio , Pasis , mayorProm = 0, menorProm = 1000000000; 
		String continuacion = "s" , nombre , estado , nMayor = "", nMenor = "";
		int n1 , n2 ,n3 ,c =0 , nAsistencias , cCerti = 0 , sCerti = 0;
		
		
		while(continuacion.equals("s") || continuacion.equals("S")) {
			c++;
			System.out.println("************");
			System.out.println("REGISTRO " + c);
			System.out.println("************");
			
			System.out.print("Nombre del alumno: ");
			nombre = sc.nextLine();
			
			System.out.print("Primera nota de " +  nombre + ": ");
			n1 = sc.nextInt();
			
			System.out.print("Segunda nota de " +  nombre + ": ");
			n2 = sc.nextInt();
			
			System.out.print("Tercera nota de " +  nombre + ": ");
			n3 = sc.nextInt();
			
			System.out.print("Asistencia  del alumno " +  nombre + " de las 12 sesiones: ");
			nAsistencias = sc.nextInt();
			
			System.out.println("***********");
			System.out.println("RESULTADOS");
			System.out.println("***********");
			
			promedio = (float) (((n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5)));
			Pasis = (float) ((nAsistencias * 100) / 12);
			if( promedio>=13 && Pasis >= 70) {
				estado = "Obtiene Certificado";
				cCerti++;
			}else {
				estado = "No obtiene Certificado";
				sCerti++;
			}
			System.out.println("Promedio: " + promedio);
			System.out.println("Porcentaje de asistencia: " + Pasis + "%");
			System.out.println("Estado: " + estado );
			
			System.out.println("");
			
			if(promedio>mayorProm) {
				mayorProm = promedio;
				nMayor= nombre;		
			}
			if(promedio<menorProm) {
				menorProm = promedio;
				nMenor = nombre;
			}
			
			sc.nextLine();
			
			
			System.out.print("¿Registrar otro? [S/N] : ");
			continuacion = sc.nextLine();
			
		}
		
			System.out.println("*******");
			System.out.println("RESUMEN");
			System.out.println("*******");
			System.out.println("Numero de alumnos: " + c);
			System.out.println("El mayor promedio es de " + mayorProm + " y pertenece a " + nMayor);
			System.out.println("El menor promedio es de " + menorProm + " y pertenece a " + nMenor);
			System.out.println("Numero de alumnos con sertificados: " + cCerti);
			System.out.println("Numero de alumnos sin sertificados: " + sCerti);


	}

}
