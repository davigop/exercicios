/**
 * OBJETIVO:Um hotel com 30 quartos cobra R$ 50,00 por diária e mais uma taxa de
 * serviços. A taxa de serviços é de:
 * • R$ 4,00 por diária, se o número de diárias for < 15;
 * • R$ 3,60 por diária, se o número de diárias for = 15;
 * • R$ 3,00 por diária, se o número de diárias for > 15.
 * Faça um algoritmo que imprima o nome e o total da conta de cada cliente do hotel.
 * Imprima também o total ganho pelo hotel.
 * ENTRADA:nome, tempo de diaria
 * SAÍDA:nome, total da conta do cliente e total de ganhos do hotel.
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Cobramos uma taxa fixa de R$50,00. ");
    int taxaFixa = 50;
    double taxaServico = 0;
    double totalCliente = 0;
    double totalHotel = 0;
    for (int i = 1; i <= 3; i++) {
        System.out.println("Qual seu nome?");
        String nome = sc.next();
        System.out.println("Quantos dias ficará hospedado?");
        int dias = sc.nextInt();
        if (dias < 15){
            taxaServico = 4 * dias;
        }else {
            if (dias == 15){
                taxaServico = 3.60 * dias;
            }else {
                if (dias > 15){
                    taxaServico = 3 * dias;
                }
            }
        }
        totalCliente = taxaServico + taxaFixa;
        System.out.println(nome + ": ");
        System.out.println(totalCliente);
        totalHotel += totalCliente;
        totalCliente = 0;
    }
    System.out.println("Total de ganhos do hotel: " + totalHotel);
}