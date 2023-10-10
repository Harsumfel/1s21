import java.util.Scanner;

public class P9_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;
		System.out.println("Que tipo de operacion desea realizar");
		System.out.println("escriba Suma, Resta, Multiplicacion o Divicion");
		operacion = teclado.nextLine();

		if (operacion.equals("Suma")){
			System.out.println("Haremos una Suma");
		} else if (operacion.equals("Resta")){
			System.out.println("Haremos una Resta");
		} else if (operacion.equals("Multiplicacion")){
			System.out.println("Haremos una Multiplicacion");
		} else if (operacion.equals("Divicion")){
			System.out.println("Haremos una Divicion");

		} else{
			System.out.println("No existe la operacion");
		}
	}
}