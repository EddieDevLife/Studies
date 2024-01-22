package Interface;

import java.util.spi.AbstractResourceBundleProvider;

public class Controle {
    public static void main(String[] args) {
        Area c = new Area(13,10,15);


        System.out.println("area total: " + c.CalcularTrapezio());
    }
}