
public class CalculadoraEnergia {
    public double masa;

    public CalculadoraEnergia(double masa) {
        this.masa = masa;
    }

    public double calcularEnergiaCinetica(double velocidadInicial, double velocidadFinal, double salto) {
        double energiaTotal = 0.0;
        for (double velocidad = velocidadInicial; velocidad <= velocidadFinal; velocidad += salto) {
            double energia = 0.5 * masa * (velocidad * velocidad);
            energiaTotal += energia;
        }
        return energiaTotal;
    }

    public double calcularEnergiaPotencial(double alturaInicial, double alturaFinal, double salto) {
        double energiaTotal = 0.0;
        double gravedad = 9.81;
        for (double altura = alturaInicial; altura <= alturaFinal; altura += salto) {
            double energia = masa * gravedad * altura;
            energiaTotal += energia;
        }
        return energiaTotal;
    }

    public double calcularEnergiaTotal(double velocidadInicial, double velocidadFinal, double alturaInicial, double alturaFinal, double salto) {
        double energiaCinetica = calcularEnergiaCinetica(velocidadInicial, velocidadFinal, salto);
        double energiaPotencial = calcularEnergiaPotencial(alturaInicial, alturaFinal, salto);
        return energiaCinetica + energiaPotencial;
    }

    public double calcularSumaEcuacionLineal(double limiteInferior, double limiteSuperior, double incremento) {
        double suma = 0.0;
        for (double x = limiteInferior; x <= limiteSuperior; x += incremento) {
            double y = Math.sqrt(x - 3);
            suma += y;
        }
        return suma;
    }
}

