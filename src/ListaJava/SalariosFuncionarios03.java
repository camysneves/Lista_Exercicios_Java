package ListaJava;

import java.util.Scanner;

public class SalariosFuncionarios03 {

    public static void main(String[] args) {

        var funcionario = "";

        while (!funcionario.equalsIgnoreCase("fim")) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o nome do funcionário(a): ");
            funcionario = leitor.nextLine();


            int salario = 0;
            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Digite o salário do funcionário(a): ");
            salario = leitor2.nextInt();

            int novoSalario = 0;
            int aumento = 0;
            if (salario < 500) {
                aumento = (20 * salario) / 100;
                novoSalario = salario + aumento;
            } else {
                System.out.println(funcionario + " não teve reajuste de salário");
            }

            System.out.println("O novo salário do(a) " + funcionario + " é de " + novoSalario);

            Scanner leitor3 = new Scanner(System.in);
            System.out.println("Funcionário(a) ou fim?");
            funcionario = leitor3.nextLine();



        }
    }
}
