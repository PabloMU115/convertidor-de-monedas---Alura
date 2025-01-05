package conversorMonedas;

public class Monedas {
    public double valorMoneda;
    public double resultadoConversion;

    public Monedas(MonedasWraper plata) {
        this.valorMoneda = plata.conversion_rate();
        this.resultadoConversion = plata.conversion_result();
    }

    public double getValorMoneda() {
        return valorMoneda;
    }

    public double getResultadoConversion() {
        return resultadoConversion;
    }

    public double[] valores() {
        double[] vector = {valorMoneda, resultadoConversion};
        return vector;
    }
}
