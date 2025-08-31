import java.util.ArrayList;
import java.util.List;

public class Cofrinho { // Classe cofrinho
    private List<Moeda> listaMoedas;

    public Cofrinho() {
        this.listaMoedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda) { // adiciona moeedas
        this.listaMoedas.add(moeda);
        System.out.println("Moeda adicionada");
    }

    public void remover(Moeda moeda) { // remove moeedas
        if (this.listaMoedas.remove(moeda)) {
            System.out.println("Moeda removida");
        } else {
            System.out.println("Moeda não encontrada");
        }
    }

    public void listagemMoedas() { // lista moeedas
        if (this.listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio");
        } else {
            System.out.println("--- Moedas no Cofrinho ---");
            for (Moeda moeda : this.listaMoedas) {
                moeda.info();
            }
            System.out.println("---------------------------");
        }
    }

    public double totalConvertido() { // converte moeedas
        if (this.listaMoedas.isEmpty()) {
            return 0;
        }

        double total = 0;
        for (Moeda moeda : this.listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }
}