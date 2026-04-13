/**
 * OBJETIVO;Faça um algoritmo para somar duas matrizes.
 * ENTRADA:
 * SAÍDA:resultado das matrizes
 */

void main() {
    Scanner sc = new Scanner(System.in);
    int [] valorA = new int [4];
    valorA[0] = 1;
    valorA[1] = 2;
    valorA[2] = 3;
    valorA[3] = 4;
    int [] valorB = {5,6,7,8};
    for (int i = 0; i < valorA.length; i++){
        int resultado;
        resultado = valorA[i] + valorB[i];
        System.out.println(i + ": "+resultado);
    }
}