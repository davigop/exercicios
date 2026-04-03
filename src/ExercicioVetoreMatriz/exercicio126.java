/**
 * Faça um algoritmo que copie o conteúdo de um vetor em um segundo vetor.
 * Objetivo: copiar o conteúdo do vetorA para o vetorB
 * Entrada:
 * Saída:cópia do conteúdo de A para B
 */

void main() {
    //definindo vetorA
    int[] vetorA = {17,20,22,24};
    //criando o vetorB utilizando "vetorA.length" pois dá o tamanho do vetorA
    int[] vetorB = new int [vetorA.length];
    //copiando vetores
    for (int i = 0; i < vetorA.length; i ++) {
        vetorB[i] = vetorA[i];
    }
    //imprimindo vetorB
    for (int n:vetorB) {
        System.out.println(n + " ");
    }


}