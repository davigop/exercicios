/**
 * objetivo:Construa um algoritmo que, tendo como dados de entrada o preço de um
 * produto e um código de origem, mostre o preço junto de sua procedência (ex.
 * 500,00 – Sul). Caso o código não seja nenhum dos especificados, o produto
 * deve ser encarado como importado.
 * Código de origem
 * 1 – Sul 5 ou 6 – Nordeste
 * 2 – Norte 7 ou 8 ou 9 – Sudeste
 * 3 – Leste 10 até 20 – Centro Oeste
 * 4 – Oeste 25 até 35 – Nordeste
 * ENTRADA:preço de um produto e um código de origem
 * SAÍDA:ostre o preço junto de sua procedência (ex. 500,00 – Sul)
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual preço do produto?");
    double preco = sc.nextDouble();
    System.out.println("Qual código da origem?");
    int codigo = sc.nextInt();

}