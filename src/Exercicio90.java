/**
 * OBJETIVO:Faça um algoritmo que imprima os múltiplos positivos de 7, inferiores a 1000.
 * ENTRADA:
 * SAÍDA: multiplo de 7
 */
void main() {
    Scanner sc = new Scanner(System.in);
    for (int i = 7; i < 1000; i += 7) {
        System.out.println(i);
    }
    
}