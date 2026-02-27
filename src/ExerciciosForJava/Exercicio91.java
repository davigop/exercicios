/**
 * OBJETIVO:Faça um algoritmo que imprima todos os números pares compreendidos entre
 * 85 e 907. O algoritmo deve também calcular a soma destes valores.
 * ENTRADA:
 * SAÍDA:SOMA E números pares
 */
void main() {
    int soma = 0;
    for (int i = 86; i <= 906; i +=2) {
        System.out.println(i);
        soma += i;
    }
    System.out.println(soma);
}