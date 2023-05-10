package javaapplication5;

import java.util.*;

public class JavaApplication5 {

    static Scanner entrada = new Scanner(System.in);
    static int total;

    static int salarios() {
        System.out.println("Digite o nome do funcionario: ");
        String n1 = entrada.next();
        System.out.println("Digite o salario do: " + n1);
        int f1 = entrada.nextInt();
        System.out.println("Digite o nome do funcionario: ");
        String n2 = entrada.next();
        System.out.println("Digite o salario do: " + n2);
        int f2 = entrada.nextInt();
        System.out.println("Digite o nome do funcionario: ");
        String n3 = entrada.next();
        System.out.println("Digite o salario do: " + n3);
        int f3 = entrada.nextInt();
        System.out.println("Salarios de: " + n1 + " R$" + f1);
        System.out.println("Salarios de: " + n2 + " R$" + f2);
        System.out.println("Salarios de: " + n3 + " R$" + f3);
        total = f1 + f2 + f3;
        return 0;
    }

    static double media() {
        double resultado = total / 3;
        System.out.println("MÉDIA SALARIAL: R$ " + resultado);
        return 0;
    }

    public static void main(String[] args) {
        salarios();
        media();
    }
}
