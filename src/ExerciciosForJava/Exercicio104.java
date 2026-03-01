/**
 * OBJETIVO:Sem utilizar a operação de multiplicação, escreva um programa que multiplique
 * dois números inteiros. Por exemplo: 2 * 2 = 2 + 2.
 * ENTRADA:valorA E B
 * SAÍDA:multiplição
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual o valor A? ");
    double valorA = sc.nextDouble();
    System.out.println("Qual o valor B? ");
    double valorB = sc.nextDouble();
    double resultado = 0;
    for (int i = 1; i <= valorB ; i++) {
        resultado += valorA;
    }
    System.out.println("Resultado de " + valorA + "X" + valorB + ": " + resultado);
}