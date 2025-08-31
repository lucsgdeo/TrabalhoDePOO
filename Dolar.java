public class Dolar extends Moeda { // classe dolar
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() { //infos da moeda
        System.out.println("Dolar: US$ " + this.valor);
    }

    @Override
    public double converter() { //converte a moeda
        return this.valor * 5.43;
    }
}