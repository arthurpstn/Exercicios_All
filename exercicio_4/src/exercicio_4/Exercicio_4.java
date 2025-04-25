/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_4;
import java.util.Scanner;
/**
 *
 * @author Brave Tec
 */
public class Exercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantos sao pares?");
        System.out.println("Digite 20 numeros:");
        float[] numeros = new float[20];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextFloat();
        }
       System.out.println("O numero de numeros pares eh:");
        int count = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
        }
        }
       
    
