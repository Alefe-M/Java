package Ex3;

public class Aluno {
    
    private int matricula;
    private String nome;
    private double n1;
    private double n2;
    private double trabalho;

   
    public Aluno(int matricula, String nome, double n1, double n2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.trabalho = trabalho;
    }

   
    public Aluno() {}

   
    public double calculaMedia() {
        return (n1 + n2 + trabalho) / 3;
    }

    
    public double calculaNotaFinalNecessaria() {
        double mediaAtual = calculaMedia();
        if (mediaAtual >= 6.0) {
            return 0.0; 
        } else {
            return (15 - (n1 + n2 + trabalho)) / 2; 
        }
    }

   
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }
}
