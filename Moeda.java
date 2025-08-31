import java.util.Objects;

public abstract class Moeda { // classe moeda
    protected double valor;

    public Moeda(double valor) { // construtor
        this.valor = valor;
    }

    public double getValor() { // pegar valor
        return valor;
    }

    public abstract void info(); // infos sobre a moeda

    public abstract double converter(); // converter para real

    @Override
    public boolean equals(Object obj) { // Pelo que entendi através de buscas na internet, o equals e hash code são utilzados para que possamos encontrar objetos dentro da Collecyion
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Moeda outraMoeda = (Moeda) obj;
        return Double.compare(outraMoeda.valor, this.valor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}