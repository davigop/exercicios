/**
 * OBJETIVO:76. Faça um algoritmo que receba uma data no formato DDMMAAAA e escreva qual
 * a estação do ano correspondente (Primavera, Verão, Outono, Inverno).
 * ENTRADA:DD/MM/AAAA
 * SAÍDA:estação do ano
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Para saber a estação informe uma data\n" +
                        "Digite a data:");
    int data = sc.nextInt();
    int dia = data / 1000000;
    int mes = data / 10000 % 100;
    //estações
    switch (mes){
        case 1:
                System.out.println("Verão");
                break;
        case 2:
            System.out.println("Verão");
            break;
        case 3:
            if (dia <= 20){
                System.out.println("Verão");
            }else{
                System.out.println("Outono");
            }break;
        case 4:
            System.out.println("Outono");
            break;
        case 5:
            System.out.println("Outono");
            break;
        case 6:
            if (dia <= 20){
                System.out.println("Outono");
            }else{
                System.out.println("Inverno");
            }break;
        case 7:
            System.out.println("Inverno");
            break;
        case 8:
            System.out.println("Inverno");
            break;
        case 9:
            if (dia <=22){
                System.out.println("Inverno");
            }else {
                System.out.println("Primavera");
            }break;
        case 10:
            System.out.println("Primavera");
            break;
        case 11:
            System.out.println("Primavera");
            break;
        case 12:
            if (dia <= 21){
                System.out.println("Primavera");
            }else {
                System.out.println("Verão");
            }break;
    }
}