/**
 * OBJETIVOS:
 * Escrever um algoritmo que lê um valor N inteiro e positivo e que calcula e escreve o valor de E.
 * E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!
 * ENTRADA:numero n
 * SAÍDA:
 */
void main() {
  Scanner sc = new Scanner(System.in);
  double valorE = 1;
  int contador = 1;
  int fatorial = 1;
  System.out.println("Valor N? ");
  int valorN = sc.nextInt();
  while (contador <= valorN){
    fatorial *= contador;
    valorE = valorE + (double) 1 / fatorial;
    contador++;
  }
  System.out.println(valorE);
}