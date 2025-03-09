package aniamalvoador;

public class Morcego implements Voador{
    private String especie;

    public Morcego(String s) {

    }

    @Override
    public void voar() {
        System.out.println("O morcego está batendo suas asas e voando.");
    }

    @Override
    public void planar() {

    }

    @Override
    public void pousar() {

    }

    public void localizarPresas() {
        System.out.println("O morcego está usando ecolocalização para encontrar presas.");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
