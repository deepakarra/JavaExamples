import java.util.*;

/**
 * Example to double every number of an array using ForEach
 *
 */
public class ForEachExample {
	public static void main(String[] argv) throws Exception {

		// Java7
		// List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4});
		// for(int i=0;i<list.size();i++) {
		// System.out.println(i*i);
		// }

		// java8
		List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 4 });
		list.forEach(i -> System.out.println(i * i));
	}
}