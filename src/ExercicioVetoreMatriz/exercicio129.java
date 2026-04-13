/**
 * Escrever um algoritmo que lê um vetor N(20) e o escreve. Troque, a seguir, o 1o
 * elemento com o último, o 2o com o penúltimo etc. até o 10o com o 11o e escreva
 * o vetor N assim modificado.
 * OBJETIVO: receber vetorN com 20 valores e imprimi-lo. Depois trocar os elementos de colocando ao contrario.
 * ex: primeiro lugar vai para ultimo e o segundo para penultimo e assim sucessivamente.
 * ENTRADA: 20 valores para o vetorN
 * SAÍDA:VetorN original ao contrario
 */
void main() {
    Scanner sc = new Scanner(System.in);
    //definindo o vetorN e seu tamanho
    int[] vetorN = new int[20];
    //utilizando essa estrutura abaixo para receber as entradas dos vetores.
    for (int i = 0; i < vetorN.length; i++){
        System.out.println("informe o valor para o vetor: ");
        vetorN[i] = sc.nextInt();
    }
    //imprimindo o vetorOriginal.
    for (int n:vetorN){
        System.out.println(n);
    }
    //fazendo a troca de posições dos vetores
    for (int i = 0 ; i < vetorN.length / 2; i++){
        int temporario = vetorN[i];//temporario está sendo usado para não perder o valor que estava no vetor
        int indiceFinal = (vetorN.length - 1) - i;
        vetorN[i] = vetorN[indiceFinal];
        vetorN[indiceFinal] = temporario;
    }
    //imprimindo vetor atualizado
    for (int n : vetorN){
        System.out.println("Vetor N modificado: " + n);
    }

}