package numerospares;


import java.util.Scanner;


public class Numerospares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Digite 10 numeros: ");
        for (int i = 0; i < 10; i++){
            numeros[i] = scanner.nextInt();
            }
        System.out.println("Aqui estão os numeros pares:");
            for (int i = 0; i < 10; i++){
                if(numeros[i] % 2 == 0){
                    System.out.println(numeros[i]);
                }
        }
  
    }
    
}