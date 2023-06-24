/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
public class AlunoControle {

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the alunoVisao
     */
    public AlunoVisao getAlunoVisao() {
        return alunoVisao;
    }

    /**
     * @param alunoVisao the alunoVisao to set
     */
    public void setAlunoVisao(AlunoVisao alunoVisao) {
        this.alunoVisao = alunoVisao;
    }
    
    private Aluno aluno;
    private AlunoVisao alunoVisao;
    
    public AlunoControle(Aluno aluno, AlunoVisao alunoVisao) {
        this.aluno = aluno;
        this.alunoVisao = alunoVisao;
        
    }
    
    public void atualizaDadosAluno(String nome, int idade, String matricula) {
        getAluno().setNome(nome);
        getAluno().setIdade(idade);
        getAluno().setMatricula(matricula);
        exibirDetalhesAluno();
    }
    
public void exibirDetalhesAluno() {
        int nome = getAluno().getIdade();
        int idade = getAluno().getIdade();
    String matricula = getAluno().getMatricula();
        AlunoVisao.exibirDadosAluno(nome, idade,
            matricula);
}

}