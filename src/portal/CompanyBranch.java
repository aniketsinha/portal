package portal;

import java.util.ArrayList;

public class CompanyBranch {
	private Long id;
	private String city;
	private Employee manager;
	private ArrayList<Department> departments;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	public ArrayList<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}

	
}
