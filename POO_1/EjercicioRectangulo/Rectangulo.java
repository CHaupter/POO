public class Rectangulo{

	//Atributos
	private  int lado1= 2;
	private  int lado2= 5;
	//Getters
	public int getLado1(){

		return this.lado1;	

	}	

	public int getLado2(){

		return this.lado2;

	}

	//Setters

	public void setLado1(int l1){

		lado1= lado1;

	}

	public void setLado2(int l2){

		lado2= lado2;

	}

	//Método para calcular el valor del area
	
	public static float MetodoArea(int lado1, int lado2){

		return lado1*lado2;

	}

}
