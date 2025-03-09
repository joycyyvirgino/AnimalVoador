package aniamalvoador;

import java.util.ArrayList;
import java.util.List;

public class RepositorioVoar {
    private List<Voador> voadores;

    public RepositorioVoar(){
        this.voadores = new ArrayList<>();
    }

    public void adicionar(Voador voador){
        voadores.add(voador);
    }
    public void Fazervoar(){
        for (Voador v : voadores){
            v.voar();
        }
    }
}
