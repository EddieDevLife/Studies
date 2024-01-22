package Area;

public class Triangulo extends FigurasGeometricas{
    private float area;

    public Triangulo(int base, int altura) {
        super(base, altura);

    }

    public void areaTriangulo() {
    float v = getBase() * getAltura();
    this.area = v/2;
        System.out.println(area);
    }

    public float getArea() {
        return area;
    }
}
