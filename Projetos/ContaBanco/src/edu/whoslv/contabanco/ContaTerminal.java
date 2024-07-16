package edu.whoslv.contabanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Olá, para começarmos, digite seu nome: ");
        String nome = keyboard.nextLine();

        System.out.print("Agora a sua agência: ");
        int agencia = keyboard.nextInt();

        System.out.print("Sua conta: ");
        int conta = keyboard.nextInt();

        System.out.print("E por fim, o seu saldo: ");
        double saldo = keyboard.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque!", nome, agencia, conta, saldo);
    }
}
