import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[15];
        int[] b = new int[15];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o valor de A " + (i + 1) + ": ");
            a[i] = ler.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = 1;

            for (int j = 1; j <= a[i]; j++) {
                b[i] = b[i] * j;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("A: " + a[i] + " | B: " + b[i]);
        }

        ler.close();
    }
}
