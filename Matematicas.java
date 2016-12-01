import java.util.*;
public class Matematicas{
	
	public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero");
		double numero= sc.nextFloat();
		sc.close();
		esPar(numero);
		
		boolean si=esPar(numero);
	if(si=true)
		System.out.printf(" El numero %.0f es par",numero);
	else
		System.out.printf(" El numero %.0f no es par",numero);


	}
	public static boolean esPar(double numero){
	if(numero%2==0)
		return true;
	else
		return false;

	}
}
