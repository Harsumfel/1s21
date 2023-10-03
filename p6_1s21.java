import java.util.Scanner;

class p6_1s21{
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		System.out.println("ingresa tu nombre");
        nombre = teclado.nextLine();
        String edad;
        System.out.println("ingresa tu edad");
        edad = teclado.nextLine();
        System.out.println("Bienvenido " + nombre + " tu edad es: " + edad + " años" );
	    System.out.println("Puede proseguir programando");
	}
}