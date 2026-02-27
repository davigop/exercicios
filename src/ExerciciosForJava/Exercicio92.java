/**
 * OBJETIVO:Faça um algoritmo que calcule o valor de A, dado por:
 *onde N é um número inteiro positivo.
 * ENTRADA:N
 * SAÍDA:A
 */
void main() {
  Scanner sc = new Scanner(System.in);
  double valorA = 0;
  System.out.println("Qual valor de N?");
  int valorN = sc.nextInt();
  for (int i = 1; i <= valorN; i++) {
    double numerador = 0;
    numerador = (double) (valorN - i + 1)  / i;
    valorA += numerador;
  }
  System.out.println(valorA);
}