package aniamalvoador;

import java.util.Random;

public class Main {
    public static void main(String[] args) {




        Voador[] voadores = new Voador[10]; // Array de voadores
        Random   random   = new Random();

        // Instancia 10 voadores aleatórios
        for (int i = 0; i < voadores.length; i++) {
            int escolha = random.nextInt(3); // Gera um número entre 0 e 2
            if (escolha == 0) {
                voadores[i] = new GalinhaVoadora();
            } else if (escolha == 1) {
                voadores[i] = new Drone();
            } else {
                voadores[i] = new Morcego("Morcego-Vampiro");
            }
        }

        // Faz todos os voadores voarem, planarem e pousarem
        for (Voador v : voadores) {
            v.voar();    // Chamada polimórfica
            v.planar();  // Chamada polimórfica
            v.pousar();  // Chamada polimórfica
            System.out.println("------------------");
        }
    }
}

