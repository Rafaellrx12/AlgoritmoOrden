public class Ordenacao {

    public static void bubbleSort(int[] vetor) {
        int aux, j;
        boolean controle;

        for (int i = 0; i < vetor.length; i++) {
            controle = true;
            for (j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    controle = false;
                }
            }
            if (controle) {
                break;
            }
        }
    }

    public static void insertionSort(int[] vetor) {
        int aux, j;

        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
    }

    public static void mergeSort(int[] vetor) {
        int[] auxiliar = new int[vetor.length];
        mergeSort(vetor, auxiliar, 0, vetor.length - 1);
    }

    private static void mergeSort(int[] vetor, int[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, auxiliar, inicio, meio);
            mergeSort(vetor, auxiliar, meio + 1, fim);
            intercalar(vetor, auxiliar, inicio, meio, fim);
        }
    }

    private static void intercalar(int[] vetor, int[] auxiliar, int inicio, int meio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            auxiliar[i] = vetor[i];
        }

        int esquerda = inicio;
        int direita = meio + 1;

        for (int i = inicio; i <= fim; i++) {
            if (esquerda > meio) {
                vetor[i] = auxiliar[direita++];
            } else if (direita > fim) {
                vetor[i] = auxiliar[esquerda++];
            } else if (auxiliar[esquerda] < auxiliar[direita]) {
                vetor[i] = auxiliar[esquerda++];
            } else {
                vetor[i] = auxiliar[direita++];
            }
        }
    }

    public static void selectionSort(int[] vetor) {
        int posicao_menor, aux;
        for (int i = 0; i < vetor.length; i++) {
            posicao_menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicao_menor]) {
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        }
    }

    public static void quickSort(int[] vetor) {
        quickSort(vetor, 0, vetor.length - 1);
    }

    private static void quickSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = pedaco(vetor, esquerda, direita);
            quickSort(vetor, esquerda, p);
            quickSort(vetor, p + 1, direita);
        }
    }

    private static int pedaco(int[] vetor, int esquerda, int direita) {
        int meio = (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;

        while (true) {
            do {
                i++;
            } while (vetor[i] < pivo);
            do {
                j--;
            } while (vetor[j] > pivo);

            if (i >= j) {
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
}
