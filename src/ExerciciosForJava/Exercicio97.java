/**
 * OBJETIVO:Faça um algoritmo que leia um número e imprima a sua tabela de multiplicação
 * de 1 até 13.
 * ENTRADA:valorA
 * SAÍDA:valor A * 1-13
 */
void main() {
    System.out.println("Qual o valor A: ");
    double valorA = new Scanner(System.in).nextInt();
    System.out.println("Multiplicação:");
    for (int i = 1; i <= 13; i++) {
        System.out.println(i +  "x"+ valorA + ": " + valorA * i);
    }
}