/**
 * OBJETIVO:Faça um algoritmo que calcule a média de salários de uma empresa, pedindo ao
 * usuário a quantidade de funcionários, o nome e o salário de cada funcionário e
 * devolvendo a média, o salário mais alto e o salário mais baixo.
 * ENTRADA:
 * SAÍDA:quantidade funcionarios, nome, salário
 */
void main() {
    Scanner sc = new Scanner(System.in);
    double salarioMaior = 0;
    double salarioMenor = 0;
    double salarioTotal = 0;
    System.out.println("Quantos funcionários se tem? ");
    int funcionarios = sc.nextInt();

    for (int i = 1; i <= funcionarios; i++) {
        System.out.println("Qual nome do funcionário?");
        String nome = sc.nextLine();
        System.out.println("Qual salário do funcionário? ");
        double salario = sc.nextDouble();
        salarioTotal += salario;
        if (i == 1){
            salarioMaior = salario;
            salarioMenor = salario;
        }
        else {
            if (salario < salarioMenor){
                salarioMenor = salario;
            }
            if (salario > salarioMaior){
                    salarioMaior = salario;
            }
        }
    }
    System.out.println(salarioMaior);
    System.out.println(salarioMenor);
    System.out.println("Média de Salário: " + (salarioTotal/funcionarios));
}