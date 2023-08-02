package selectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i ++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        int posicao_menor, aux;
        for(int i = 1; i < vetor.length; i++){
            posicao_menor=i;
            for(int j = i+1; j < vetor.length; j++){
                if(vetor[j]<vetor[posicao_menor]){
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        }
        System.out.println("ordenado");
        for(int i = 0; i < vetor.length; i ++){
            System.out.println(vetor[i]);
        }
    }
}
