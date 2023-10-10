import java.util.Scanner;

class p4_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena;
		System.out.println("Ingresa tu nombre ");
		cadena = teclado.nextLine();
		System.out.println("Tu nombre es: "+ cadena);
		System.out.println("Ingresa tu edad ");
		cadena = teclado.nextLine();
		System.out.println("Tu edad es: " + cadena);
		System.out.println("Ingresa tu correo ");
		cadena = teclado.nextLine();
		System.out.println("Tu correo es: " + cadena);
		System.out.println("Ingresa tu telefono ");
		cadena = teclado.nextLine();
		System.out.println("Tu telefono es: " + cadena);
	}
}