package fundamentals;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um Salário: ");
        String input1 = ler.nextLine().replace(",", ".");
        System.out.print("Digite outro Salário: ");
        String input2 = ler.nextLine().replace(",", ".");
        System.out.print("Digite outro Salário: ");
        String input3 = ler.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(input1);
        double salario2 = Double.parseDouble(input2);
        double salario3 = Double.parseDouble(input3);

        double soma = salario1 + salario2 + salario3;
        double media = soma / 3;

        System.out.println("A média dos salários é " + media);
    }
}
