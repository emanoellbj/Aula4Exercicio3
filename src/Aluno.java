
public class Aluno extends ObjetoComparavel{
	
	private String nome;
	private int idade;
	
	public Aluno() {
	}
	
	public Aluno(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	@Override
    public int comparar(Comparavel outro) {
        if (outro instanceof Aluno) {
            Aluno outroAluno = (Aluno) outro;
            if (getIdade() < outroAluno.idade) {
                return -1;
            } else if (getIdade() > outroAluno.idade) {
                return 1;
            } else {
                return 0;
            }
        } else {
            throw new IllegalArgumentException("O objeto passado não é um Aluno.");
        }
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
