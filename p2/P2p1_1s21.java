public class P2p1_1s21{
	public static void main(String[] args) {	
		int a=18;
		if (a<10){
			System.out.println("siingreso porque es verdadero");
		}

		if(a>10){
			System.out.println("este segmento si se ejecuta porque se cumpela condicion");
		}

		if (true){
			System.out.println("aqui se ejecuta porque es verdadero");
		}

		if (false){
			System.out.println("esto no se ejecuta porque es falso");
		}

		if (true == true){
			System.out.println("se ejecutara por ser 1?");
		}

		System.out.println("continuamos el codigo");

		System.out.println("");

		a= 17;

		if (a>18){
			System.out.println("eres mayor de edad");
		}else {
			System.out.println("eres menor de edad");
		}

		a=10;

		if (a == 2){
			System.out.println("se evaluo a 2");
		}else if (a == 3){
			System.out.println("se evaluo a 3");
		} else if (a == 5){
			System.out.println("se evaluo a 5");
		}else{
			System.out.println("se evaluaron los demas digitos");
		}
		int divisor=1;
		int dividendo=0;

		if (divisor == 0){
			System.out.println("no es posible hacer la division");
		}else{
			System.out.println("si es posible realizar la divsion");
		}

	}
}