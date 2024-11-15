package app.com;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type App.
 */
public class First
{

    public static void main(String[] args) {

        String[] str = {"A", "B",  "D", "E","C", "F", "G", "H"};
        List<String> letters = List.of(str);
        List<String> letters2 = Arrays.asList(str);

        List<String> arrayLetters = new ArrayList<>(Arrays.asList(str));

        arrayLetters.removeIf(x -> x.equals("H") || x.equals("G"));
        arrayLetters.sort(null);
        arrayLetters.forEach(System.out::println);

    }


//    /**
//     * forEach puedes simplemente recorrerlo llamando a foreach directamente a la lista
//     */
//    public static void main(String[] args){
//        ArrayList<Integer> num = new ArrayList();
//        num.add(5);
//        num.add(3);
//        num.add(6);
//
//        num.forEach(System.out::println);
//    }

/**
 * Iterator Tienes más versatilidad y comodidad para realizar modificaciones más complejas como eliminar etc.
 */
//    public static void main(String[] args){
//        ArrayList<Integer> num = new ArrayList();
//        num.add(5);
//        num.add(3);
//        num.add(6);
//
//        Iterator it = num.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//    }

/**
 * stream: No puedes realizar manipulaciones complejas
 */
//    public static void main( String[] args )
//    {
//        Collection<String> num = new ArrayList();
//        num.add("uno");
//        num.add("dos");
//
//        num.stream().forEach(System.out::println);
//
//        num.remove("tres");
//        num.stream().forEach(System.out::println);
//    }
}
