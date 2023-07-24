import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int[] vetor = new int[10];

        do {
            System.out.println("\n-----Escolha uma Opção-----");
            System.out.println("1-Bubble sort");
            System.out.println("2-Insertion Sort");
            System.out.println("3-Merge Sort");
            System.out.println("4-Selection Sort");
            System.out.println("5-Quick Sort");
            System.out.println("6-Sair");

            int numero1 = entrada.nextInt();
            numero = numero1;

            if (numero1 == 1) {
                vetor = gerarVetorAleatorio(vetor.length);
                System.out.println("Desordenado:");
                exibirVetor(vetor);
                Ordenacao.bubbleSort(vetor);
                System.out.println("\nOrdenado:");
                exibirVetor(vetor);
            } else if (numero1 == 2) {
                vetor = gerarVetorAleatorio(vetor.length);
                System.out.println("Desordenado:");
                exibirVetor(vetor);
                Ordenacao.insertionSort(vetor);
                System.out.println("\nOrdenado:");
                exibirVetor(vetor);
            } else if (numero1 == 3) {
                vetor = gerarVetorAleatorio(vetor.length);
                System.out.println("Desordenado:");
                exibirVetor(vetor);
                Ordenacao.mergeSort(vetor);
                System.out.println("\nOrdenado:");
                exibirVetor(vetor);
            } else if (numero1 == 4) {
                vetor = gerarVetorAleatorio(vetor.length);
                System.out.println("Desordenado:");
                exibirVetor(vetor);
                Ordenacao.selectionSort(vetor);
                System.out.println("\nOrdenado:");
                exibirVetor(vetor);
            } else if (numero1 == 5) {
                vetor = gerarVetorAleatorio(vetor.length);
                System.out.println("Desordenado:");
                exibirVetor(vetor);
                Ordenacao.quickSort(vetor);
                System.out.println("\nOrdenado:");
                exibirVetor(vetor);
            }
        } while (numero != 6);

        System.out.println("Você saiu do loop");
    }

    private static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        return vetor;
    }

    private static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
