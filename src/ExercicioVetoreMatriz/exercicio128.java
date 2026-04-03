/**
 * Faça um algoritmo que faça a união de dois vetores de mesmo tamanho e
 * mesmo tipo em um terceiro vetor com dobro do tamanho.
 * OBJETIVO: unir dois vetores de tamanhos e tipo igual utilizando um terceiro vetor que dobre esse tamanho.
 * ENTRADA:
 * SAÍDA:
 */
void main() {
    //definindo vetores e seus tamanhos
    int[] vetorA = {1, 2, 3, 4};
    int[] vetorB = {5, 6, 7, 8};
    //dobrando o tamanho do vetorC
    int[] vetorC = new int[vetorA.length * 2];
    //pegando os números do vetorA. 0 a 3 números
    for (int i = 0; i < vetorA.length; i++) {
        vetorC[i] = vetorA[i];
    }
    //pegando números do vetorB. 4 a 7 números
    for (int i = 0; i < vetorA.length;i++){
        vetorC[i + vetorA.length] = vetorB [i];
    }
    //imprimindo vetorC
    for (int n:vetorC){
        System.out.println("Vetor C: "+ n);
    }
}