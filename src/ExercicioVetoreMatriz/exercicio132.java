/**
 * Objetivo:Faça um algoritmo para calcular a transposta de uma matriz.
 * Entrada:
 * Saída:transposta da matriz
 */
void main() {
    //indicando a matriz
    int [][] matriz = {
            {1,2,3},
            {4,5,6}
    };
    //vetor da transposta
    int [][] transposta = new int [3][2];
    //laço de repetição para a transposta
    for (int j = 0 ; j < 3 ; j++){
        System.out.println();//pular linhas a cada linha indicada pelo índice[j] na transposta
        for (int i = 0; i < 2; i++){ //colunas da transposta
            transposta[j][i] = matriz[i][j];//indicando os valores que estar na matriz
            System.out.print(transposta[j][i] + " ");//imprimindo transposta
        }
    }
}