package edu.whoslv.contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = keyboard.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = keyboard.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void contar(int pUm, int pDois) throws ParametrosInvalidosException {
        if (pUm > pDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = pDois - pUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }


    }
}
