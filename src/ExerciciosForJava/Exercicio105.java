/**
 * OBJETIVO:A série de Fibonacci é formada pela sequência:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * ENTRADA:
 * SAÍDA:
 */
void main() {
    int atual = 1;
    int anterior = 0;
    for (int i = 1; i <= 20; i++) {
        System.out.println("Fibonnaci: " + anterior);
        int proximo = anterior;
        anterior = atual;
        atual = proximo + anterior;
    }
}