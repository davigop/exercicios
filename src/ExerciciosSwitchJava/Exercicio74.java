/**
 * OBJETIVO:O programa de uma loja de móveis mostra o seguinte menu na tela de vendas:
 * 1-Venda a Vista
 * 2-Venda a Prazo 30 dias
 * 3-Venda a Prazo 60 dias
 * 4-Venda a Prazo com 90 dias
 * 5-Venda com cartão de débito
 * 6-Venda com cartão de crédito
 * Escolha a opção:
 * Faça um programa que receba o valor da venda, escolha a condição de
 * pagamento no menu e mostre o total da venda final conforme condições a seguir:
 * Venda a Vista - desconto de 10%
 * Venda a Prazo 30 dias - desconto de 5%
 * Venda a Prazo 60 dias - mesmo preço
 * Venda a Prazo 90 dias - acréscimo de 5%
 * Venda com cartão de débito - desconto de 8%
 * Venda com cartão de crédito - desconto de 7%
 * ENTRADA:valor da venda,condição de pagamento
 * SAÍDA:valor total da venda
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual valor da venda?");
    double venda = sc.nextDouble();
    System.out.println("1-Venda a Vista\n" +
            "2-Venda a Prazo 30 dias\n" +
            "3-Venda a Prazo 60 dias\n" +
            "4-Venda a Prazo com 90 dias\n" +
            "5-Venda com cartão de débito\n" +
            "6-Venda com cartão de crédito\n"+
            "Escolha uma opção:");
    int opcao = sc.nextInt();

    double vendaTotal = 0;
    switch (opcao){
        case 1: {
            System.out.println("Valor Total: " + (venda - (venda * 10 / 100)));
        }   break;
        case 2:
            System.out.println("Valor Total: "+ (venda - (venda * 5 / 100)));
            break;
        case 3:
            System.out.println("Valor Total: "+ venda);
            break;
        case 4:
            System.out.println("Valor Total: "+ (((venda*5)/100)+ venda)  );
            break;
        case 5:
            System.out.println("Valor Total: "+(venda - (venda * 8 / 100)));
            break;
        case 6:
            System.out.println("Valor Total: "+(venda - (venda * 7 / 100)));
            break;
        default:
            System.out.println("Opção indisponivel");
    }

}
