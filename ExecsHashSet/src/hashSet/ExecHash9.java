package hashSet;


import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class ExecHash9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Character> cha = new HashSet<>();

        Collections.addAll(cha, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        
        System.out.println("Esxistem " + cha.size() + " caracteres no alfabeto");
    }

}
