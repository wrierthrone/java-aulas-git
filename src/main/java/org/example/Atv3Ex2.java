//Elabore um algoritmo que leia um determinado número e apresente na tela a tabuada de multiplicação deste número. Por exemplo, digamos que o número informado foi 2, o programa deverá apresentar na tela:
//1 x 2 = 2
//2 x 2 = 4
//3 x 2 = 6
//?
//10 x 2 = 20

package org.example;

import java.util.Scanner;

public class Atv3Ex2 {
    public static void main(String[] args) {
        int n, i, res;
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o número que deseja obter a tabuada: ");
        n = leia.nextInt();
        System.out.println("TABUADA DO " + n);
        for (i = 1; i <= 10 ; i++){
            res = i * n;
            System.out.println(i + " * " + n + " = " + res);
        }
    }
}
