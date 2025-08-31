public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() { //infos da moeda
        System.out.println("Euro: € " + this.valor);
    }

    @Override
    public double converter() { //converte a moeda
        return this.valor * 6.35;
    }
}