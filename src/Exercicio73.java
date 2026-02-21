/**
 * Objetivo;Faça um programa, utilizando estrutura de condição, que receba um número
 * real, digitado pelo usuário e mostre o menu para selecionar o tipo de cálculo que
 * deve ser realizado:
 * 101-Raiz quadrada
 * 102-A metade
 * 103-10% do número
 * 104-O dobro
 * Escolha a opção:
 * ENTRADA:numero real,tipo de calculo
 * SAÍDA:calculo
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual cálculo deve ser realizado?\n"+
                        "101-Raiz quadrada\n"+
                        "102-A metade\n" +
                        "103-10% do número\n"+
                        "104-O dobro\n");
    //receber entradas
    int calculo = sc.nextInt();
    System.out.println("Qual o número será usado para o cálculo");
    double numeroReal = sc.nextInt();
    //switch case101
    switch (calculo){
        case 101:{
            int raiz = 0;
            for (int i = 1; i <= numeroReal ; i++) {
                if (i * i == numeroReal){
                    raiz = i;
                    break;
                }

            }
            if (raiz != 0){
                System.out.println("Raiz Quadrada: "+ raiz);
            }else {
                System.out.println("Raiz Quadrada não exata!");
            }
        }break;
        case 102:{
            System.out.println("Metade: "+ numeroReal/2);
        }break;
        case 103:{
            System.out.println("10% do número: "+ (numeroReal * 10)/ 100);
        }break;
        case 104:{
            System.out.println("Dobro: "+ numeroReal * 2);
        }break;
        default:{
            System.out.println("Opção não disponivel!");
        }
    }

}