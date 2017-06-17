package portal;

import java.util.ArrayList;

public class Candidate extends Person{
	
	public Long id;
	public Person candidate;
	public float totalExperience;
	public Company currentCompany;
	
	public ArrayList<PastJob> pastJobs;
	public ArrayList<Skill> skills;
	
	public Salary currentSalary;
	public Salary expectedSalary;
	
	public Education education;
	public int availableAfterDays;
			
}
