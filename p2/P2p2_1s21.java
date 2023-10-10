public class P2p2_1s21{
	public static void main(String[] args) {
		int val=6;
		switch(val){
		case 1: System.out.println("se evalua a 1"); break;
		case 2: System.out.println("se evalua a 2"); break;
		case 3: System.out.println("se evalua a 3"); break;
		case 4: System.out.println("se evalua a 4"); break;
		case 5: System.out.println("se evalua a 5"); break;
	    default: System.out.println("valor fuera del rango"); break;
		}

		Character opc='t';
		switch(opc){
        case 'a': System.out.println("Se evaluo A"); break;
        case 'b': System.out.println("Se evaluo B"); break;
        case 'c': System.out.println("Se evaluo C"); break;
        case 'd': System.out.println("Se evaluo D"); break;
        case 'e': System.out.println("Se evaluo E"); break;
        case 'f': System.out.println("Se evaluo F"); break;
        default: System.out.println("la opcion no existe"); break;
		}

		String cadena = "uno";
		switch (cadena) {
		case "uno":System.out.println("Uno"); break;
		case "dos":System.out.println("Dos"); break;
		case "tres":System.out.println("tres"); break;
		case "cuatro":System.out.println("cuatro"); break;
		default: System.out.println("no existe la opcion"); break;	
		}
	}
}