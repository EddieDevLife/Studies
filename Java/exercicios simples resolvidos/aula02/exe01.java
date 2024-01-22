import java.util.Date;
import java.util.Locale;

public class exe01 {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.print("A hora do sistema é ");
        System.out.println(relogio.toString());
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do sistema é ");
        System.out.println (loc.getDisplayLanguage()); // imprime “Português”
    }
}
