package MapFlatMap;

import java.util.List;

public class Employee {
private int id;
private String EmpName;
private List<String> department;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getEmpName() {
	return EmpName;
}


public void setEmpName(String empName) {
	EmpName = empName;
}


public List<String> getDepartment() {
	return department;
}


public void setDepartment(List<String> department) {
	this.department = department;
}


public Employee(int id, String empName, List<String> department) {
	super();
	this.id = id;
	EmpName = empName;
	this.department = department;
}


@Override
public String toString() {
	return "Employee [id=" + id + ", EmpName=" + EmpName + ", department=" + department + "]";
}



}
