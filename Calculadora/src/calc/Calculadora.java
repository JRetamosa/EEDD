package calc;

public class Calculadora {
	public static void main(String[] args) {
		
	}
	
	/**
	 * Realiza la suma de dos números enteros. 
	 * @param num1
	 * @param num2
	 * @return num1+ num2.
	 */
	public static int  sumar (int num1, int num2){
			return num1 + num2;
	}
		 
	/**
	 * Realiza la resta de dos números enteros. 
	 * @param num1
	 * @param num2
	 * @return num1 - num2.
	 */
	public static  int  restar (int num1, int num2){
			return num1 - num2;
	}
	
	
	/**
	 * Realiza la división de dos números enteros. 
	 * @param num1
	 * @param num2
	 * @return num1 / num2.
	 */
	public static int dividir(int num1, int num2)
	{
	  int result = 0;
	  if(num2 !=0)
	     result = num1/num2;
	  else{
	      System.out.println("No se puede dividir por cero.");
	  }
	   return result;
	}
	
	
	
	/**
	 * Realiza la multiplicación de dos números enteros. 
	 * @param num1
	 * @param num2
	 * @return num1 * num2.
	 */
	public static  int  multiplicar (int num1, int num2){
			return num1 * num2;
	}
	
	
	
	public boolean positivo(int numero){
		
		if(numero>0) {
			return true;
		}
		else return negativo(numero);
		}
	public boolean negativo(int numero){
		if(numero <0) {
			return false;
		}
		else return positivo(numero);
		}
	
	
	public static boolean esPrimo(int numero){
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
	
	}

