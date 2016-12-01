import java.util.*;

public class TestMatematicas{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero");
		int numero= sc.nextInt();
		
		boolean par= Matematicas.esPar(numero);
		boolean divisiblePorTres= Matematicas.esDivisiblePorTres(numero);
		boolean divisiblePorCinco= Matematicas.esDivisiblePorCinco(numero);	
	

		System.out.printf("¿Es %d par? %b\n¿Es divisible por tres? %b\n¿Es divisible por cinco? %b\n\n", numero, par, divisiblePorTres, divisiblePorCinco);
		

}


}
