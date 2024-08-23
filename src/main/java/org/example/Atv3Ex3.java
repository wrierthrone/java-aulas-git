//Crie um algoritmo que leia um determinado número e apresente
//na tela a tabuada da divisão deste número. Por exemplo, digamos
// que o número informado foi 5, o programa deverá apresentar na tela:
//5 : 5 = 1
//10 : 5 = 2
//15 : 5 = 3
//?
//50 : 5 = 10

package org.example;

import java.util.Scanner;

public class Atv3Ex3 {
    public static void main(String[] args) {
        int n, i, res;
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o número que deseja obter a tabuada da divisão: ");
        n = leia.nextInt();
        System.out.println("TABUADA DO " + n);
        for (i = n; i < n * 11; i+= n){
            res = i / n;
            System.out.println(i + " / " + n + " = " + res);
        }
    }
}
