/**
 * OBJETIVO:Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os
 * dados de idade, sexo (M/F) e salário. Faça um algoritmo que informe:
 * a) a média de salário do grupo;
 * b) a maior e a menor idade do grupo;
 * c) a quantidade de mulheres com salário até R$100,00.
 * Encerre a entrada de dados quando for digitada uma idade negativa.
 * ENTRADA:IDADE,SEXO,SALARIO
 * SAÍDA:media, maior e menor idade , quantidade M com salário ate 100 reais.
 */
void main() {
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    int contMulher100 = 0;
    int idadeMenor = 0;
    int idadeMaior = 0;
    double totalSalario = 0;
    do {
        System.out.println("Qual a idade? ");
        int idade = sc.nextInt();
        //parar o programa sem o último loop
        if (idade < 0){
            break;
        }
        //definir idade
        if (contador == 0){
            idadeMaior = idade;
            idadeMenor = idade;
        }
        //idade maior e menor
        if (idade > idadeMaior){
            idadeMaior = idade;
        }
        if (idade < idadeMenor){
            idadeMenor = idade;
        }
        System.out.println("Qual o sexo? (M ou F) ");
        String sexo = sc.next();
        System.out.println("Qual o sálario? ");
        double salario = sc.nextDouble();
        //quantidade de mulheres com sálario inferior a 100 reais
        if (salario < 100 && sexo.equalsIgnoreCase("F")){
            contMulher100++;
        }
        totalSalario += salario;
        contador++;
    }while (true);
    System.out.println("Média de sálario: " + totalSalario / contador);
    System.out.println("Maior idade: " + idadeMaior + "\n" + "Menor idade: " + idadeMenor);
    System.out.println("Quantidade de F com sálario inferior a R$100: " + contMulher100);
}