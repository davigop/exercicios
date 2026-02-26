/**
 * OBJETIVO:Crie um algoritmo para uma calculadora utilizando a instrução escolha-caso para
 * determinar a operação que deve ser executada, conforme o usuário escolher no
 * menu de opções. Conforme a opção escolhida pelo usuário, uma operação
 * diferente da calculadora deve ser executada.
 * ENTRADA:OPERAÇÃO
 * SAÍDA:RESULTADO
 */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual o valor A?");
    double valorA = sc.nextDouble();
    System.out.println("Qual o valor B?");
    double valorB = sc.nextDouble();
    System.out.println("Escolha a operção a ser realizada:\n"+
            "Soma = 1\n"+
            "Subtração = 2\n"+
            "Divisão = 3\n"+
            "Multiplicação = 4\n");
    int operacao = sc.nextInt();
    //switch
    switch (operacao){
            //soma
        case 1:
            System.out.println("Resultado: " + (valorA + valorB));
            break;
            //subtração
        case 2:
            System.out.println("Resultado: " + (valorA - valorB));
            break;
            //divisão
        case 3:
            System.out.println("Resultado: " + (valorA/valorB));
            break;
            //multiplicação
        case 4:
            System.out.println("Resultado: " + (valorA*valorB));
            break;
        default:
            System.out.println("Opção inválida!");
    }


    
}