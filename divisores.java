import java.util.Scanner;

public class divisores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o valor de A " + (i + 1) + ": ");
            a[i] = ler.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("\\nDivisores de " + a[i] + ":");

            if (a[i] > 0) {
                for (int j = 1; j <= a[i]; j++) {
                    if (a[i] % j == 0) {
                        System.out.print(j + " ");
                    }
                }
            } else {
                System.out.print("Digite um número positivo para listar os divisores.");
            }
            System.out.println();
        }

        ler.close();
    }
}
