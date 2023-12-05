import java.util.Scanner;
public class P3p10_1s21{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		int n=teclado.nextInt();
		int sumatoria=0;

		for (int i=0;i<n;i++){
			sumatoria += numx(n)/factn(n);
			System.out.println("El resultado de la sumatoria es: " + sumatoria);
		}
	}

	public static double numx(int n){
		double numx = 1;
		numx = alcubo(n)*factorial(n);
		return numx;
	}

	public static double alcubo(int n){
		double ac = 1;
		ac = Math.pow(n,3);
		return ac;
	}

	public static double factorial(int n){
		double fact = 1;
		for (int i =0; i <= n; i++) {
			fact *= i+1;
		} 
		return fact;
	}
	public static double factn(int n){
		double factn =1;
		for (int i =0; i <= n; i ++){
			factn = factn * i;
		}
		return factn;
	}
}