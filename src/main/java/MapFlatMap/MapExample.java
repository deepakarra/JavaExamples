package MapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Example to convert a list into stream and use map to return list of employeenames
 */
public class MapExample {
public static void main (String[] args) {
List<Employee> empList= Arrays.asList(new Employee(1,"emp1",Arrays.asList("dep1,dep2")),new Employee(1,"emp2",Arrays.asList("dep3,dep2")));
System.out.println(empList.stream().map(emp->emp.getId()).collect(Collectors.toList()));
}
}
