public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Real: R$ " + this.valor);
    }

    @Override
    public double converter() {
        return this.valor;
    }
}