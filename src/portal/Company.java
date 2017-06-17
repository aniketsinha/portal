package portal;

public class Company {
	public Long id;
	public String name;
	public Employee ceo;
	public Industry industry;
	public int noOfEmployees;
	public int noOfBranches;
	public CompanyBranch headQuarter;
	public int yearOfInception;
	public boolean isPrivatelyHeld;
	public boolean isProfitable;
	public Long annualRevenue;
	public float glassdoorRating;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getCeo() {
		return ceo;
	}
	public void setCeo(Employee ceo) {
		this.ceo = ceo;
	}
	public Industry getIndustry() {
		return industry;
	}
	public void setIndustry(Industry industry) {
		this.industry = industry;
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	public int getNoOfBranches() {
		return noOfBranches;
	}
	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	public CompanyBranch getHeadQuarter() {
		return headQuarter;
	}
	public void setHeadQuarter(CompanyBranch headQuarter) {
		this.headQuarter = headQuarter;
	}
	public int getYearOfInception() {
		return yearOfInception;
	}
	public void setYearOfInception(int yearOfInception) {
		this.yearOfInception = yearOfInception;
	}
	public boolean isPrivatelyHeld() {
		return isPrivatelyHeld;
	}
	public void setPrivatelyHeld(boolean isPrivatelyHeld) {
		this.isPrivatelyHeld = isPrivatelyHeld;
	}
	public boolean isProfitable() {
		return isProfitable;
	}
	public void setProfitable(boolean isProfitable) {
		this.isProfitable = isProfitable;
	}
	public Long getAnnualRevenue() {
		return annualRevenue;
	}
	public void setAnnualRevenue(Long annualRevenue) {
		this.annualRevenue = annualRevenue;
	}
	public float getGlassdoorRating() {
		return glassdoorRating;
	}
	public void setGlassdoorRating(float glassdoorRating) {
		this.glassdoorRating = glassdoorRating;
	}
	
	
}
