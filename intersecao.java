import java.util.Scanner;

public class intersecao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o valor de A " + (i + 1) + ": ");
            a[i] = ler.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print("Digite o valor de B " + (i + 1) + ": ");
            b[i] = ler.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    k++;
                    break;
                }
            }
        }

        System.out.print("Interseção: [ ");
        for (int i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println("]");

        ler.close();
    }
}
