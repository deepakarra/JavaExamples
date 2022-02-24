package MapFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 *Example to Convert the list into stream and use flatmap 
 */
public class FlatMapExample {

	public static void main (String[] args) {
		List<String>emp1Dep = new ArrayList();
		emp1Dep.add("dep1");
		emp1Dep.add("dep2");
		List<String>emp2Dep = new ArrayList<>();
		emp2Dep.add("dep3");
		emp2Dep.add("dep2");
		
		List<Employee> empList= Arrays.asList(new Employee(1,"emp1",emp1Dep),new Employee(1,"emp2",emp2Dep));
	
		System.out.println(empList.stream()
        .flatMap(x->x.getDepartment().stream())
        .collect(Collectors.toSet()));   
		}
}


