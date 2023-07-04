public class Rectangulo extends PoligonoRegular {


    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2*base) + (2*altura);
    }

}