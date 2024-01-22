package Interface;

public class Area {
    private int base;
    private int baseMenor;
    private int altura;

    public  Area (int altura){
        this.altura = altura;
    }

    public Area(int base, int altura){
        this.altura = altura;
        this.base = base;

    }


    public Area(int base, int baseMenor, int altura) {
        this.base = base;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }


    public int CalcularQuadrado(){
        int area = altura * altura;
        return area;
    }

    public float CalcularTrapezio(){
        float area = (base + baseMenor) * altura / 2;
        return area;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
