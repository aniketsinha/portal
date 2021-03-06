package portal;

public class Employee extends Person{
	private Long id;
	private Department department;
	private Company company;
	private CompanyBranch branch;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public CompanyBranch getBranch() {
		return branch;
	}
	public void setBranch(CompanyBranch branch) {
		this.branch = branch;
	}
}
