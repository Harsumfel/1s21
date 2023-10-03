import java.util.Scanner;

class p4_1s21{
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		System.out.println("ingresa tu nombre");
		nombre = teclado.nextLine();
		System.out.println("Bienvenido" + nombre + ", a la clase");
		String edad;
		System.out.println("ingresa tu edad");
		edad = teclado.nextLine();
		String correo;
		System.out.println("ingresa tu correo");
		correo = teclado.nextLine();
		String telefono;
		System.out.println("ingresa tu telefono");
		telefono = teclado.nextLine();
		System.out.println("Tus datos  son " + edad + " años, " + correo+ ", " + telefono + "." );

     }
}     