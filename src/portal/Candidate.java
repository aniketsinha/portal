package portal;

import java.util.ArrayList;

public class Candidate extends Person{
	
	private Long id;
	private Person candidate;
	private float totalExperience;
	private Company currentCompany;
	
	private ArrayList<PastJob> pastJobs;
	private ArrayList<Skill> skills;
	
	private Salary currentSalary;
	private Salary expectedSalary;
	
	private Education education;
	private int availableAfterDays;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Person getCandidate() {
		return candidate;
	}
	public void setCandidate(Person candidate) {
		this.candidate = candidate;
	}
	public float getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(float totalExperience) {
		this.totalExperience = totalExperience;
	}
	public Company getCurrentCompany() {
		return currentCompany;
	}
	public void setCurrentCompany(Company currentCompany) {
		this.currentCompany = currentCompany;
	}
	public ArrayList<PastJob> getPastJobs() {
		return pastJobs;
	}
	public void setPastJobs(ArrayList<PastJob> pastJobs) {
		this.pastJobs = pastJobs;
	}
	public ArrayList<Skill> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<Skill> skills) {
		this.skills = skills;
	}
	public Salary getCurrentSalary() {
		return currentSalary;
	}
	public void setCurrentSalary(Salary currentSalary) {
		this.currentSalary = currentSalary;
	}
	public Salary getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(Salary expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	public int getAvailableAfterDays() {
		return availableAfterDays;
	}
	public void setAvailableAfterDays(int availableAfterDays) {
		this.availableAfterDays = availableAfterDays;
	}
			
}
