import java.util.Scanner;

public class Maioresouiguaisa10 {


    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             float[] numeros = new float[15];
             System.out.println("Digite 15 nomeros: ");
             for (int i = 0; i < 15; i++){
                 numeros [i] = scanner.nextFloat();
             }
             System.out.println("Os numeros maiores que 10 são: ");
             for (int i = 0; i < 15; i++){
                 if (numeros[i] > 10){
                     System.out.println(numeros[i]);
                 }
             }
    }
    
}
