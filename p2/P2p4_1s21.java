public class P2p4_1s21{
	public static void main(String[] args) {
		int contador = 0;
		int numero = 2;
		System.out.println("Los primeros 10 números primos son: ");
		while (contador < 10){
			if(esPrimo(numero)){
				System.out.println(numero + " ");
				contador ++;
			}
			numero ++;
		}
	}
	public static boolean esPrimo(int numero){
		if (numero<=1){
			return false;
		}
		for (int i=2; i*i<=numero; i++){
			if(numero%i==0){
				return false;
			}
		}
		return true;
	}
}