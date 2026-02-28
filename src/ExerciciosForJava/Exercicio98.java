/**
 * OBJETIVO:Escreva um algoritmo que calcule os quadrados e cubos dos números de 0 a 10
 * e imprima os valores resultantes no formato de tabela, como segue:
 * Número    Quadrado          Cubo
 * 0            0               0
 * 1            1               1
 * 2            4               8
 * 3            9              27
 * 4           16              64
 * 5           25              125
 * 6           36              216
 * 7           49              343
 * 8           64              512
 * 9           81              729
 * 10         100             1000
 * ENTRADA:
 * SAÍDA:
 */
void main() {
  int cubo = 0;
  int quadrado =0;
  System.out.println("Numero\tQuadrado\tCubo");
  for (int i = 1; i <= 10; i++) {
    quadrado = i * i;
    cubo = i * i * i;
    System.out.println(i+"\t\t" + quadrado +"\t\t\t"+ cubo);
  }
}