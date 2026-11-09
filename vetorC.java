import java.util.Scanner;

public class vetorC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o valor de A " + (i + 1) + ": ");
            a[i] = ler.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print("Digite o valor de B " + (i + 1) + ": ");
            b[i] = ler.nextInt();
        }

        for (int i = 0; i < c.length; i++) {
            if (a[i] > b[i]) {
                c[i] = 1;
            } else if (a[i] < b[i]) {
                c[i] = -1;
            } else {
                c[i] = 0;
            }
        }

        System.out.print("C = [ ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println("]");

        ler.close();
    }
}
