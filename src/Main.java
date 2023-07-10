public class Main {
    public static Aluno maxIdade(Aluno[] alunos) {
        Aluno max = alunos[0];
        for (int i = 1; i < alunos.length; i++) {
            if (alunos[i].comparar(max) > 0) {
                max = alunos[i];
            }
        }
        return max;
    }
    
    public static Aluno minIdade(Aluno[] alunos) {
        Aluno min = alunos[0];
        for (int i = 1; i < alunos.length; i++) {
            if (alunos[i].comparar(min) < 0) {
                min = alunos[i];
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[10];
        alunos[0] = new Aluno("João", 20);
        alunos[1] = new Aluno("Maria", 22);
        alunos[2] = new Aluno("Pedro", 18);
        alunos[3] = new Aluno("Ana", 25);
        alunos[4] = new Aluno("Lucas", 21);
        alunos[5] = new Aluno("Clara", 19);
        alunos[6] = new Aluno("Carlos", 23);
        alunos[7] = new Aluno("Julia", 24);
        alunos[8] = new Aluno("Miguel", 20);
        alunos[9] = new Aluno("Laura", 22);
        
        Aluno alunoMaisVelho = maxIdade(alunos);
        Aluno alunoMaisNovo = minIdade(alunos);
        
        System.out.println("Aluno mais velho: " + alunoMaisVelho.getNome() + " (" + alunoMaisVelho.getIdade() + " anos)");
        System.out.println("Aluno mais novo: " + alunoMaisNovo.getNome() + " (" + alunoMaisNovo.getIdade() + " anos)");
    }
}