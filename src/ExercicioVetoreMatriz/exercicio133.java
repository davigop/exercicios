/**
 * Objetivo:Faça um algoritmo que leia uma matriz mat 2 x 3 e imprima na tela a soma de
 * todos os elementos da matriz mat.
 * Entrada:
 * Saída:Soma total
 */
void main() {
    //definindo a matriz
    int [][] matriz = {
            {1,2,3},
            {4,5,6}
    };
    int soma = 0;//criando a variável soma

    for (int i = 0; i < 2; i++) {//laço de repetição para a matriz
        for (int j = 0; j < 3;j++){
            soma += matriz[i][j];//somando itens da matriz
        }
    }
    System.out.println("Soma total: " + soma);//imprimindo a soma
}