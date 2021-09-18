package exercicioRelampagoSurpresaHalloween;

import java.util.List;

public class Turma {

    private Professor professor;
    private List<Aluno> alunos;

    public Turma(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNomeProfessor() {
        return professor.getNome();
    }

    public List<Aluno> getAluno() {
        return alunos;
    }

    public void setAluno(List<Aluno> aluno) {
        this.alunos = aluno;
    }

    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
