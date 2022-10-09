package ListaJava;

import java.util.Scanner;

public class NumerosInteiros02 {

    public static void main(String[] args) {

        var contador = 0;

        while (contador < 10) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o valor: ");


            var numero = leitor.nextInt();
            contador++;

            if (numero % 2 == 0) {
                System.out.println(numero + " É Par!");

            } else {
                System.out.println(numero + " É Ímpar!");
            }
        }

    }

}

