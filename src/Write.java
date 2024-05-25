import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * @FunctionalInterface interface A{ void show(); }
 * 
 * 
 * class B implements A{ public void show() { System.out.println("hi"); } }
 * 
 * class Write{ public static void main(String[] args) { B obj = new B();
 * obj.show(); }
 * 
 * }
 * 
 * 
 * class Write{ public static void main(String[] args) { A obj = () ->
 * System.out.println("hi"); obj.show(); } }
 */


/*
 * class Write{ public static void main(String [] args) { List<Integer> nums =
 * Arrays.asList(4,5,6,7,8);
 * 
 * List<Integer> fillist =
 * nums.stream().map(i->i*i).collect(Collectors.toList());
 * fillist.forEach(x->System.out.println(x)); }
 * 
 * }
 */
