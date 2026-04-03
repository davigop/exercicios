/**
 * Faça um algoritmo que some o conteúdo de dois vetores e armazene o
 * resultado em um terceiro vetor.
 * OBJETIVO:
 * ENTRADA:
 * SAÍDA: vetorC com o resultado do vetorA + vetorB
 */
void main() {
    //definindo vetorA
    int[] vetorA = {1,2,3,4};
    //definindo vetorB
    int[] vetorB = {5,6,7,8};
    //definindo vetorC
    int[] vetorC = new int [vetorA.length];
    //somando e adicionando resultado ao vetorC
    for (int i = 0; i < vetorA.length; i++) {
        vetorC[i] = vetorA[i] + vetorB[i];
    }
    //imprimindo resultados do vetor C
    for (int n:vetorC ) {
        System.out.println(n);
    }
}