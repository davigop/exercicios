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
 * SAÍDA:mostre o preço junto de sua procedência (ex. 500,00 – Sul)
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual preço do produto?");
    double preco = sc.nextDouble();
    System.out.println("Qual código da origem?");
    int codigo = sc.nextInt();
    if (codigo>= 25 && codigo<=35){
        System.out.println("Nordeste");
    }else {
        if (codigo>= 10 && codigo <= 20){
            System.out.println("Centro-Oeste");
        }
    }
    switch (codigo){
        case 1:
            System.out.println(preco+" - Sul");
            break;
        case 2:
            System.out.println(preco+" - Norte");
            break;
        case 3:
            System.out.println(preco+" - Leste");
            break;
        case 4:
            System.out.println(preco+" - Oeste");
            break;
        case 5,6:
            System.out.println(preco+" - Nordeste");
            break;
        case 7,8,9:
            System.out.println(preco+" - Sudeste");
            break;
        default:
            System.out.println(preco +" - Importado");
    }

}