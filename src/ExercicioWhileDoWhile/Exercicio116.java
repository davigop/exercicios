/**
 * OBJETIVO:
 * Faça um algoritmo que leia um número e divida-o por dois (sucessivamente)
 * ate que o resultado seja menor que 1. Mostre o resultado da ultima divisão e a
 * quantidade de divisões efetuadas.
 * ENTRADA:
 * SAÍDA:
 */
void main() {
  Scanner sc = new Scanner(System.in);
  int quantidade = 0;
  System.out.println("Qual o número a ser divido? ");
  double numero = sc.nextDouble();
  while (numero >= 1) {
    numero /= 2;
    quantidade++;
  }
  System.out.println("Quantidade de divisões: " + quantidade);
  System.out.println("Ultima divisão: " + numero);
}