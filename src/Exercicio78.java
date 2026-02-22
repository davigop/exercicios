/**
 * OBJETIVO:Faça um programa que lê quatro valores: I, A, B e C, onde I é um número inteiro
 * e positivo e A, B, e C são quaisquer valores reais. O programa deve escrever os
 * valores lidos e:
 * • se I = 1, escrever os três valores A, B e C em ordem crescente;
 * • se I = 2, escrever os três valores A, B e C em ordem decrescente;
 * • se I = 3, escrever os três valores A, B, e C de forma que o maior valor fique entre os outros dois;
 * • se I não for um dos três valores acima, dar uma mensagem indicando isto.
 * ENTRADA:I,A,B,C
 * SAÍDA:
 *   se I = 1, escrever os três valores A, B e C em ordem crescente;
 *   se I = 2, escrever os três valores A, B e C em ordem decrescente;
 *   se I = 3, escrever os três valores A, B, e C de forma que o maior valor fique
 */
void main() {
    Scanner sc = new Scanner(System.in);
    double valorMaior = 0;
    double valorMeio = 0;
    double valorMenor = 0;
    System.out.println("Digite o valor A");
    double valorA = sc.nextDouble();
    System.out.println("Digite o valor B");
    double valorB = sc.nextDouble();
    System.out.println("Digite o valor C");
    double valorC = sc.nextDouble();
    System.out.println("Digite o valor de I entre 1 e 3");
    int opcao = sc.nextInt();
    //escolha
    switch (opcao) {
        case 1:{
            if (valorA <= valorB && valorA <= valorC) {
                System.out.println(valorA);
                if (valorB <= valorC) {
                    System.out.println(valorB);
                    System.out.println(valorC);
                } else {
                    System.out.println(valorC);
                    System.out.println(valorB);
                }
            } else if (valorB <= valorA && valorB <= valorC) {
                System.out.println(valorB);
                if (valorA <= valorC) {
                    System.out.println(valorA);
                    System.out.println(valorC);
                } else {
                    System.out.println(valorC);
                    System.out.println(valorA);
                }

            } else {
                if (valorC <= valorA && valorC <= valorB) {
                    System.out.println(valorC);
                    if (valorA <= valorB) {
                        System.out.println(valorA);
                        System.out.println(valorB);
                    } else {
                        System.out.println(valorB);
                        System.out.println(valorA);
                    }
                }
            }
        }break;
        case 2:{
            if (valorA >= valorB && valorA >= valorC) {
                System.out.println(valorA);
                if (valorB >= valorC) {
                    System.out.println(valorB);
                    System.out.println(valorC);
                } else {
                    System.out.println(valorC);
                    System.out.println(valorB);
                }
            } else if (valorB >= valorA && valorB >= valorC) {
                System.out.println(valorB);
                if (valorA >= valorC) {
                    System.out.println(valorA);
                    System.out.println(valorC);
                } else {
                    System.out.println(valorC);
                    System.out.println(valorA);
                }

            } else {
                if (valorC >= valorA && valorC >= valorB) {
                    System.out.println(valorC);
                    if (valorA >= valorB) {
                        System.out.println(valorA);
                        System.out.println(valorB);
                    } else {
                        System.out.println(valorB);
                        System.out.println(valorA);
                    }
                }
            }

        }break;
        case 3:{
            if (valorA>= valorB || valorA<= valorB && valorA<= valorC || valorA>= valorC){
                valorMeio = valorA;
                if (valorB>= valorC){
                    valorMaior = valorB;
                    valorMenor = valorC;
                }else {
                    valorMenor = valorB;
                    valorMaior = valorC;
                }
                System.out.println(valorMaior);
                System.out.println(valorMeio);
                System.out.println(valorMenor);
            }else if (valorB>=valorA || valorB<= valorMenor && valorB <=valorC || valorB >= valorC){
                    valorMeio = valorB;
                    if (valorA>= valorC){
                        valorMaior = valorA;
                        valorMenor = valorB;
                    }else {
                        valorMenor = valorA;
                        valorMaior = valorB;
                    }
                    System.out.println(valorMaior);
                    System.out.println(valorMeio);
                    System.out.println(valorMenor);
                }else if (valorC >= valorA || valorC <= valorA && valorC >= valorB || valorC <= valorB){
                valorMeio = valorC;
                if (valorA>= valorB){
                    valorMaior = valorA;
                    valorMenor = valorB;
                }else {
                    valorMenor = valorA;
                    valorMaior = valorB;
                }

            }
        }break;
        default:
            System.out.println("Opção indisponivel");

    }
}



