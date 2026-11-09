import java.util.Scanner;

public class rotinaBusca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[10];
        boolean encontrou = false;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o valor de A " + (i + 1) + ": ");
            a[i] = ler.nextInt();
        }

        System.out.print("Qual valor deseja procurar? ");
        int valor = ler.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == valor) {
                System.out.println("O valor está na posição A[" + i + "].");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Esse valor não está no vetor A.");
        }

        ler.close();
    }
}
