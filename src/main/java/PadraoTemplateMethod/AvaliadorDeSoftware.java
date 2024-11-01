package PadraoTemplateMethod;

public class AvaliadorDeSoftware extends Avaliador {

    public AvaliadorDeSoftware(String nome) {
        setNome(nome);
        setTipoAvaliador("Avaliador de Software");
    }

    @Override
    public String verificarAprovacao() {
        if (this.calcularMedia() >= 8.0f) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    private void setTipoAvaliador(String tipoAvaliador) {
        this.tipoAvaliador = tipoAvaliador;
    }
}
