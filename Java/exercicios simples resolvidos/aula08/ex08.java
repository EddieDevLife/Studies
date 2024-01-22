import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        // imc
        float IMC, peso, altura;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o seu peso");
        peso = sc.nextFloat();
        System.out.println("digite sua altura");
        altura = sc.nextFloat();

        IMC = peso / (altura * altura);

        if (IMC < 16) {
            System.out.println("Magreza grave");

        } else {
            if (IMC < 17) {
                System.out.println("Magreza moderada");

            } else {
                if (IMC < 18.5) {
                    System.out.println("Magreza leve");

                } else {
                    if (IMC < 25) {
                        System.out.println("Saudavel");

                    } else {
                        if (IMC < 30) {
                            System.out.println("Sobrepeso");

                        } else {
                            if (IMC < 35) {
                                System.out.println("Obesidade Grau I");

                            } else {
                                if (IMC < 40) {
                                    System.out.println("Obesidade Grau 2 (severa)");

                                } else {
                                    System.out.println("Obesidade grau 3 (mórbida)");
                                }

                            }

                        }

                    }
                }

            }
        }
    }
}