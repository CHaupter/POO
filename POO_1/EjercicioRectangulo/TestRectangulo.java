public class TestRectangulo{

	public static void main(String[] args){

		//Creamos objetos de tipo Rectangulo
		Rectangulo r1= new Rectangulo();
		Rectangulo r2= new Rectangulo();		

		//System.out.println(r1.lado1); No hay accesibilidad		
		//System.out.println(r2.lado2); lado1 y lado2 son atributos 'private'
		
		//Cambiamos los valores por defecto del rectangulo r2

		r2.setLado1(100);
		r2.setLado2(1000);


		System.out.printf("Atributos del rectángulo (r1):\nlado1: %d, lado2: %d\n\n",r1.getLado1(), r1.getLado2());
		System.out.printf("Atributos del rectángulo (r2):\nlado1: %d, lado2: %d\n\n",r2.getLado1(), r2.getLado2());
		
		float area= Rectangulo.MetodoArea(r1.getLado1(), r1.getLado2());
		System.out.printf("El area del rectangulo es %.2f\n\n", area);

	}

}
