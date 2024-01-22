
public class ex08 {
    public static void main(String[] args) {
        int a, b, c;
        double x2;
        double x1;
        double delta;
        //teste
        a = 1;
        b = 5;
        c = 4;
        delta= (Math.pow(b, 2)) - 4 * a * c;
        x1 = (-1 * b + Math.sqrt(delta))/ 2 * a;
        x2 = (-1 * b - Math.sqrt(delta))/ 2 * a;

        System.out.println("x1= " + x1 + " x2= " + x2);


    }
    
}
