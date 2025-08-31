public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() { //infos da moeda
        System.out.println("Real: R$ " + this.valor);
    }

    @Override
    public double converter() { //converte a moeda
        return this.valor;
    }
}