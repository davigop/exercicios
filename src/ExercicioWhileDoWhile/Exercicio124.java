/**
 * OBJETIVO:
 * Faça um algoritmo que leia informações de alunos (Matricula, Nota1, Nota2 ,
 * Nota3) com o fim das informações indicado por Matricula = 9999 . Para cada
 * aluno deve ser calculada a média final de acordo com a seguinte fórmula:
 * Média final = [(2 * Nota1) +(3* Nota2) +(4* Nota 3)] / 9
 * Se a média final for igual ou superior a 5, o algoritmo deve mostrar Matrícula,
 * Média Final e a mensagem "APROVADO";
 * se a média final for inferior a 5, o algoritmo deve mostrar Matricula, Média Final e a mensagem "REPROVADO".
 * Ao final devem ser mostrados o total de aprovados, o total de alunos da turma e o total de reprovados.
 * ENTRADA:matricula, n1,n2,n3
 * SAÍDA:total aprovado, total alunos e total reprovado
 */
void main() {
    Scanner sc = new Scanner(System.in);
    int contAprovado = 0;
    int contTotalTurma = 0;
    int contReprovado = 0;
    do {
        System.out.println("Qual a matricula?( use 9999 para parar)");
        int matricula = sc.nextInt();
        if (matricula == 9999){
            break;
        }
        //pegar notas das provas
        System.out.println("Qual a nota da N1?");
        double notaUm = sc.nextDouble();
        System.out.println("Qual a nota da N2?");
        double notaDois = sc.nextDouble();
        System.out.println("Qual a nota da N3?");
        double notaTres = sc.nextDouble();
        //calcular média e dizer aprovado ou reprovado
        double mediaFinal = ((2 * notaUm) + ( 3 * notaDois ) + ( 4 * notaTres)) / 9;
        if (mediaFinal >= 5){
            System.out.println("Matrícula: " + matricula + "\n"
                                +"Média final: " + mediaFinal +"\n"
                                +"Aprovado!");
            //contador aprovados
            contAprovado++;
        }else {
            System.out.println("Matrícula: " + matricula + "\n"
                    +"Média final: " + mediaFinal +"\n"
                    +"Reprovado!");
            //contadoreprovado
            contReprovado++;
        }
        //contador total da turma
        contTotalTurma++;
    }while (true);
    System.out.println("Total Alunos: " + contTotalTurma);
    System.out.println("Total aprovado: " + contAprovado);
    System.out.println("Total repovado: " + contReprovado);
}