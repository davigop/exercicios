/**
 * OBJETIVO:Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria
 * qualquer preço. O monge, necessitando de alimentos, indagou à rainha sobre o
 * pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro de
 * xadrez (que possui 64 casas), de tal forma que o primeiro quadro deveria conter
 * apenas um grão e os quadros subsequentes, o dobro do quadro anterior. Crie um
 * algoritmo para calcular o total de grãos que o monge recebeu.
 * ENTRADA:
 * SAÍDA:
 */
void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double graos = 1;
    double total = 0;
    for (int i = 1; i <= 64; i++) {
        total += graos ;
        graos = graos * 2;
    }
    System.out.println(total);
}