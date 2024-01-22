import java.awt.Toolkit;
import java.awt.Dimension;

public class exe02 {
    public static void main(String[] args) {
        

        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width +" X " + d.height);
    

    }
    
}
