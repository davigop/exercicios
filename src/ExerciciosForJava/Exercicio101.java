/**
 * OBJETIVO:
 * Escreva um algoritmo que determine o fatorial de um número. Para este
 * problema, tem-se como entrada o valor do número do qual se deseja calcular o
 * fatorial. O fatorial de 0 é igual a 1. O fatorial de um número N(N!) é definido
 * conforme a seguir.
 * ENTRADA:
 * SAÍDA:
 */

void main() {
    double fatorial = 1;
    System.out.println("Digite o valor A: ");
    double valorN = new Scanner(System.in).nextDouble();

    for (int i = 1; i <= valorN; i++) {
        fatorial *= i;
    }
    System.out.println(fatorial);
}