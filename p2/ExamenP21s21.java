import java.util.Scanner;

public class ExamenP21s21 {

    public static void main(String[] args) {

        int contador = 0;
        double suma = 0.0;
        int maximaVecesQueSeRepite = 0;
        int moda = 0;
        double varianza = 0.0;
        double desviacion = 0.0;
        Scanner ingresar = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de edades a registrar:");

        contador = ingresar.nextInt();
        int[] edad = new int[contador];
        //Codigo para sacar la media
        for (int i = 0; i < contador; i++) {
            System.out.println("Ingrese edad: ");
            edad[i] = ingresar.nextInt();
            suma = suma + edad[i];
        }
        double media = suma / contador;
        //Codigo para sacar la moda.
        for (int i = 0; i < edad.length; i++) {
            int vecesQueSeRepite = 0;
            for (int j = 0; j < edad.length; j++) {
                if (edad[i] == edad[j]) {
                    vecesQueSeRepite++;
                }
            }
            if (vecesQueSeRepite > maximaVecesQueSeRepite) {
                moda = edad[i];
            }
        }
        //Codigo para sacar la desviacion estandar
        for (int i = 0; i < edad.length; i++) {
            double rango;
            rango = Math.pow(edad[i] - media, 2f);
            varianza = varianza + rango;
        }
        varianza = varianza / 10f;//suma de diferencias sobre "n"
        //teniendo ya la varinza solo debemos sacarle raiz cuadrada
        //tendremos la desviación estandar
        desviacion = Math.sqrt(varianza);

        System.out.println("La media es " + media);
        System.out.println("La moda es " + moda);
        System.out.println("Desviacion estandar: " + desviacion);
    }

}
