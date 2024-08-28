
package Arreglos;

import java.util.Scanner;


public class Matriz3x3 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [][] numeros = new int [3][3];
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println("Digite el valor para la posicion ["+i+"]["+j+"]: ");
                numeros[i][j] = teclado.nextInt();
            }
        }
         System.out.println("\nLos numeros digitados son: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println(numeros[i][j]);
                
            }
            
        }
        boolean diagonalIgual = true;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i][i] != numeros[0][0]){
                diagonalIgual = false;
                break;
                
            }
        }
        if(diagonalIgual){
            System.out.println("\nLos numeros de la Diagonal son Iguales.");
        } else{
            System.out.println("\nLos numeros de la Diagonal NO son iguales.");
        }
        }
    }


