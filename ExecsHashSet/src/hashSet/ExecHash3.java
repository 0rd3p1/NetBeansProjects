package hashSet;


import java.util.Set;
import java.util.HashSet;

public class ExecHash3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        
        for (int i = 1; i <=5; i++) {
            num.add(i);
        }
        
        num.clear();
        
        System.out.println("O HashSet esta vazio? " + num.isEmpty());
    }
    
}
