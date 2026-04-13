/**
 * Objetivo:Faça um algoritmo que leia uma matriz mat 4 x 4, e imprima na tela a soma dos
 * elementos abaixo da diagonal principal da matriz mat.
 * Entrada:
 * Saída:soma da parte abaixo da diagonal principal
 */
void main() {
    int [][] matriz = {//defininido a matriz
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
    };
    int soma = 0;//criando variável soma
    for (int i = 0; i < 4; i++){//laço de repetição para acessar indice
        for (int j = 0; j < 4; j++){
            if (i > j){//condição para a soma apenas dos abaixos a diagonal principal
                soma += matriz[i][j];//somando
            }
        }
    }
    System.out.println("Soma total : " + soma);//imprimindo soma
}