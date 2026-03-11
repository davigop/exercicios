/**
 * OBJETIVO:Faça um algoritmo que calcule a média de salários de uma empresa, pedindo
 * ao usuário o nome dos funcionários e os salários e devolvendo a média, o salário
 * mais alto e o salário mais baixo. Use nome = “fim” para encerrar a leitura.
 * ENTRADA:
 * SAÍDA:
 */
void main() {
    Scanner sc = new Scanner(System.in);
    double totalSalario = 0;
    double salarioMaior = 0;
    double salarioMenor = 0;
    int contador = 0;
    do {
        //NOME FUNCIONARIO
        System.out.println("Qual nome do Fucionário?(use fim para parar) ");
        String nome = sc.nextLine();

        //QUEBRAR ANTES DE CHEGAR NO SALÁRIO
        if (nome.equalsIgnoreCase("fim")){
            break;
        }
        //SALÁRIO
        System.out.println("Qual o salário de: " + nome );
        double salario = sc.nextDouble();
        //DEFINIR OS SALARIOS INICIAIS
        if (contador == 0){
            salarioMaior = salario;
            salarioMenor = salario;
        }
        //DESCOBRIR SALARIO MAIOR
        if (salario > salarioMaior){
            salarioMaior = salario;
        }
        //DESCOBRIR SALARIO MENOR
        if (salario < salarioMenor){
            salarioMenor = salario;
        }
        sc.nextLine();

        //TOTAL TODOS OS SALARIOS (USAR NA MEDIA)
        totalSalario += salario;
        contador++;

    } while(true);

    System.out.println("Salário médio: " + totalSalario / contador);
    System.out.println("Salário menor: " + salarioMenor);
    System.out.println("Salário maior: " + salarioMaior);
}