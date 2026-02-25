/**
 * OBJETIVO:Crie um algoritmo que execute as funcionalidades da conta-corrente de uma
 * pessoa. Toda a conta tem um número, uma pessoa vinculada e um saldo.
 * O saldo é atualizado conforme o tipo de movimentação bancária:
 * depósito ou retirada. Se for um depósito, o dinheiro é creditado ao saldo; se for retirada, o
 * dinheiro é debitado do saldo.
 * ENTRADA:Número de conta, nome, saldo atual, deposito ou retirada
 * SAÍDA:saldo atualizado
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual número de conta?");
    double conta = sc.nextDouble();
    System.out.println("Quem está vinculado a conta?(nome completo)");
    String nome = sc.next();

    System.out.println("Qual saldo atual da conta?");
    double saldo = sc.nextDouble();
    System.out.println("Qual operação será feita?\n"+
            "1-Depósito\n"+
            "2-Retirada\n");
    int operacao = sc.nextInt();
    System.out.println("Qual o valor da operação?");
    double valorOperacao = sc.nextDouble();
    //switch

    switch (operacao){
        case 1:
            System.out.println("Saldo atual: "+ (saldo + valorOperacao ));
            break;
        case 2:
            if (saldo>=valorOperacao){
                System.out.println("Saldo atual: " + (saldo - valorOperacao));
            }else {
                System.out.println("Saldo insuficiente para retirada");
            }
            break;
        default:
            System.out.println("Operação indisponivel");
    }

}