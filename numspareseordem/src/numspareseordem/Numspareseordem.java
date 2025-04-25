package numspareseordem;


import java.util.Scanner;


public class Numspareseordem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numeros = new float[30];
        System.out.println("Digite 30 numeros: ");
        for (int i = 0; i < 30; i++){
            numeros[i] = scanner.nextFloat();
            }
        System.out.println("Aqui estão os numeros pares:");
            for (int i = 0; i < 30; i++){
                if(numeros[i] % 2 == 0){
                    System.out.println(numeros[i]);
                }
        }
            float menor = numeros[0];
            float maior = numeros[0];
            for (int i = 1; i < 30; i++){
                if (numeros[i] < menor){
                    menor = numeros[i];
                } 
                if (numeros[i] > maior){
                    maior = numeros[i];
                }
            }
            System.out.println("Esse é o menor numero: " + menor );
            System.out.println("Esse é o maior numero: " + maior );
            scanner.close();
    }
    
}