import java.util.Scanner;
public class P3p1_1s21{
    static Scanner teclado = new Scanner(System.in);
	public static void Suma(){
	System.out.println("Suma de 2 numeros");
	System.out.println("ingrese el 1er Numero");
	int a = teclado.nextInt();
	System.out.println("ingrese el 2do Numero");
	int b = teclado.nextInt();
	int c = a+b;
	System.out.println("La suma fue " + c);
	}
	public static void Resta(){
	System.out.println("Resta de 2 numeros");
	System.out.println("ingrese el 1er Numero");
	int a = teclado.nextInt();
	System.out.println("ingrese el 2do Numero");
	int b = teclado.nextInt();
	int c = a-b;
	System.out.println("La Resta fue " + c);
	}
	public static void Multiplicacion(){
	System.out.println("multiplicacion de 2 numeros");
	System.out.println("ingrese el 1er Numero");
	int a = teclado.nextInt();
	System.out.println("ingrese el 2do Numero");
	int b = teclado.nextInt();
	int c = a*b;
	System.out.println("La multiplicacion fue " + c);
	}
	public static void Divicion(){
	System.out.println("Divicion de 2 numeros");
	System.out.println("ingrese el 1er Numero");
	int a = teclado.nextInt();
	System.out.println("ingrese el 2do Numero");
	int b = teclado.nextInt();
	int c = a/b;
	System.out.println("La Divicion fue " + c);
	}
	public static void Salir(){
	    System.out.println("Salir de las operaciones logicas");
	}
	public static void menu(){
		System.out.println("Operaciones basicas");
		System.out.println("A) Suma");
		System.out.println("B) Resta");
		System.out.println("C) Multiplicacion");
		System.out.println("D) Divicion");
		System.out.println("S) Salir");
		System.out.println("Que opcion deceas?");
	}
	public static void main(String[] args){
		menu();
		String opc=teclado.nextLine();
		if(opc.equals("A"))Suma();
		if(opc.equals("B"))Resta();
		if(opc.equals("C"))Multiplicacion();
		if(opc.equals("D"))Divicion();
		if(opc.equals("S"))Salir();
	}
}
