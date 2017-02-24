package metodo4;
import java.util.Scanner;
public class ejemplo4 {
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		int resul;
		int numero1, numero2;
		System.out.println("introduce el primer numero");
		numero1= sc.nextInt();
		System.out.println("introduce el segundo numero");
		numero2= sc.nextInt();
		
		resul= multiplicar(numero1,numero2);
		System.out.println(" la multiplicacion es:"+resul);
		
	}
	public static int multiplicar(int numero1, int numero2 ){
		int multi = numero1*numero2;
		return multi;
		
		
	}


	}
