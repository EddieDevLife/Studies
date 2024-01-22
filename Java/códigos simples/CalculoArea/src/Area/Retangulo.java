package Area;

public class Retangulo extends FigurasGeometricas {
    private float area;

    public Retangulo(int base, int altura) {
        super(base, altura);
    }
    public void areaRetangulo() {
        float v = getBase() * getAltura() ;
        this.area = v;
        System.out.println(area);
    }


    public float getArea() {
        return area;
    }
}
