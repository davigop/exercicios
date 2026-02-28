/**
 * OBJETIVO:Escreva um algoritmo que calcule o produto dos inteiros ímpares de 1 a 15 e,
 * então, exiba os resultados.
 * ENTRADA:
 * SAÍDA:
 */
void main() {
    double produto = 1;
    for (int i = 1; i <= 15; i += 2) {
        produto *= i;
        System.out.println(i+" | "+ produto);
    }
    System.out.println("Valor total: " + produto);

}