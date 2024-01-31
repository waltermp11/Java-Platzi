import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {


        Map<Integer, String> listtaMapNombre = new HashMap<Integer, String>();
        listtaMapNombre.put(1, "Walter");
        listtaMapNombre.put(2, "Manuela");
        listtaMapNombre.put(3, "Jesus");
        listtaMapNombre.put(4, "Maria Eugenia ");
        listtaMapNombre.put(5, "Raul Alberto");
        listtaMapNombre.put(6, "Juan Pablo");
        listtaMapNombre.put(7, "Jean Paul");
        listtaMapNombre.put(8, "Walter");


        System.out.println("Aca vamos a imprimir la collection hashmap ✅✅✅");

        //Para nosotros pode imprimir el Map, usamos un iterator

        Iterator it = listtaMapNombre.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave : " + key + " --> Valor :" + listtaMapNombre.get(key));


        }
    }
}
