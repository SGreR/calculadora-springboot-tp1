package infnet.desenvolvimento.calculadoraTP1.model;

public class Calculadora {
    public double primeiroNumero;
    public double segundoNumero;

    public Calculadora(double primeiroNumero, double segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    public double getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(double primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public double add(){
        return primeiroNumero + segundoNumero;
    }
    public double subtract(){
        return primeiroNumero - segundoNumero;
    }
    public double multiply(){
        return primeiroNumero * segundoNumero;
    }
    public double divide(){
        return primeiroNumero / segundoNumero;
    }
    public double power(){
        return Math.pow(primeiroNumero, segundoNumero);
    }
}
