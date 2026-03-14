/**
 * OBJETIVO:Chico tem 1,50 metros e cresce 2 centímetros por ano, enquanto Zé tem 1,10
 * metros e cresce 3 centímetros por ano. Construa um algoritmo que calcule e
 * imprima quantos anos serão necessários para que Zé seja maior que Chico.
 * ENTRADA:
 * SAÍDA:
 */
void main() {
    int anos = 0;
    double chico = 1.50;
    double ze = 1.10;
    while (ze < chico){
        ze += 0.03;
        anos++;
    }
    System.out.println(ze);
    System.out.println(anos);
}