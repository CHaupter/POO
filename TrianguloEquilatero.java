import java.util.*;

public class TrianguloEquilatero{

	public static void main(String[] args){

		System.out.println("Introduce la longitud del lado del triangulo: \n");

		Scanner sc= new Scanner(System.in);
		float lado= sc.nextFloat();		
		sc.close();

		float Perimetro=MetodoPerimetro(lado);
		System.out.printf("El perimetro del triangulo es %.2f\n\n",Perimetro);		}

	public static float MetodoPerimetro(float lado){

		float Perimetro= 3*lado;

		return Perimetro;
	}



}
