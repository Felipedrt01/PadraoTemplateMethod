package PadraoTemplateMethod;

public class AvaliadorDeHardware extends Avaliador {

    public AvaliadorDeHardware(String nome) {
        setNome(nome);
        setTipoAvaliador("Avaliador de Hardware");
    }

    @Override
    public String verificarAprovacao() {
        if (this.calcularMedia() >= 7.0f) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    private void setTipoAvaliador(String tipoAvaliador) {
        this.tipoAvaliador = tipoAvaliador;
    }
}
