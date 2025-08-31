import java.util.Objects;

public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public abstract void info();

    public abstract double converter();

    @Override
    public boolean equals(Object obj) {
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