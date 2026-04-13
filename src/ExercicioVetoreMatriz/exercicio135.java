/**
 * Objetivo:Escreva um algoritmo que lê uma matriz M(5,5) e calcule as somas:
 * a) da linha 4 de M;
 * b) da coluna 2 de M;
 * c) da diagonal principal;
 * d) da diagonal secundária;
 * e) de todos os elementos da matriz;
 * f) Escreva estas somas e a matriz
 * Entrada:5 linhas e 5 colunas
 * Saída:
 */
void main() {
    Scanner sc = new Scanner(System.in);
    int somaLinha = 0;
    int somaColuna = 0;
    int somaDiagPrincipal = 0;
    int somaDiagSecundaria = 0;
    int somaTotal = 0;
    int[][] matriz = new int[5][5];
    for (int i = 0; i < 5; i++) {
        System.out.println("Quais elementos da linha " + i + " ?");
        for (int j = 0; j < 5; j++) {
            System.out.println("Elemento da coluna " + j);
            matriz[i][j] = sc.nextInt();
            if (i == 3) {
                somaLinha += matriz[i][j];
            }
            if (j == 1) {
                somaColuna += matriz[i][j];
            }
            if (i == j) {
                somaDiagPrincipal += matriz[i][j];
            }
            if (j == i) {
                somaDiagSecundaria += matriz[i][j];
            }
            somaTotal += matriz[i][j];
        }

    }
    System.out.println("Soma da linha 4: " + somaLinha);
    System.out.println("Soma da coluna 2: " + somaColuna);
    System.out.println("Soma diagonal principal: " + somaDiagPrincipal);
    System.out.println("Soma diagonal secundária: " + somaDiagSecundaria);
    System.out.println("Soma total da matriz: " + somaTotal);
    for (int i = 0; i < 5; i++) {
        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.print(matriz[i][j] + " ");
        }
    }
}

