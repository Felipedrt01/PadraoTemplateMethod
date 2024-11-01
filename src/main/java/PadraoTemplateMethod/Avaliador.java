package PadraoTemplateMethod;

public abstract class Avaliador {

    private String nome;
    String tipoAvaliador;
    private float nota1;
    private float nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public abstract String verificarAprovacao();

    public String getTipo() {
        return tipoAvaliador;
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarAprovacao() +
                '}';
    }
}
