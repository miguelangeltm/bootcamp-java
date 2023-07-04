public class Triangulo extends PoligonoRegular {

    double lado1;
    double lado2;
    double lado3;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void getLados(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1+lado2+lado3;
    }
}
