/**
 * Objetivo:Faça um algoritmo que calcule e imprime a soma dos inteiros de 1 a 10. Utilize
 * as estruturas ENQUANTO-FACA / REPITA-FACA para fazer um laço com as
 * instruções de cálculo e incremento. O laço deve terminar quando o valor de x se
 * tornar 11.
 * Entrada:
 * Saída:
 */
void main() {
    double soma = 0;
    int ciclo = 0;
    do {
        ciclo ++;
        soma +=ciclo;
        System.out.println(ciclo);
    }while (soma < 12 );
    System.out.println(soma);
}