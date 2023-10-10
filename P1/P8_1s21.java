import java.util.Scanner;
class P8_1s21{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String edad;
		System.out.println("ingresa tu edad: ");
		edad = teclado.nextLine();
		if (edad >= 18){
			System.out.println("eres mayor de edad...");
		}
	}
}