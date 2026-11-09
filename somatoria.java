import java.util.Scanner;

public class somatoria {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o valor de A " + (i + 1) + ": ");
            a[i] = ler.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            int soma = 0;

            for (int j = i; j < a.length; j++) {
                soma = soma + a[j];
            }

            b[i] = soma;
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }

        ler.close();
    }
}
