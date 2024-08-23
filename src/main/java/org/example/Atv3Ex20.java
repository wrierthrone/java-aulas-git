//Faça um algoritmo que leia um inteiro n e
//imprima um tabuleiro de xadrez ou damas com lado n.
//Represente casas pretas por um "X" e casas brancas por um "O". Ex: n = 4
//O X O X
//X O X O
//O X O X
//X O X O

package org.example;

import java.util.Scanner;

public class Atv3Ex20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, x, y, z = 0, cont1 = 0, cont2 = 0;
        System.out.println("Escreva o tamanho do tabuleiro: ");
        n = leia.nextInt();
        for (x=1; x<n; x++){
            cont1+=1;
            if (cont1 % 2 == 0){
                System.out.printf("X");
            }else {
                System.out.printf("O");
            }
            for (y=1; y<n; y++){
                cont2+=1;
                if (cont2 % 2 == 0){
                    System.out.printf("O");
                }else {
                    System.out.printf("X");
                }
            }
            if (n % 2 != 0){
                cont2--;
            }
            System.out.println();
        }
    }
}
