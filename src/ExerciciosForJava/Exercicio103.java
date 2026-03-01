/**
 * OBJETIVO:Um determinado material radioativo perde metade de sua massa a cada 50
 * segundos. Dada a massa inicial, em gramas, faça um programa que determine o
 * tempo necessário para que essa massa se torne menor que 0,05 gramas.
 * ENTRADA:MASSA INICIAL
 * SAÍDA:
 */
void main() {
    System.out.println("Qual á a massa? ");
    double massa = new Scanner(System.in).nextDouble();
    int tempo = 0;
    for (;massa >= 0.05;){
        massa = massa / 2;
        tempo += 50;
    }
    System.out.println("Tempo necessário: " + tempo + " segundos");
}