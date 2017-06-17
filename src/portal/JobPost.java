package portal;

import java.util.ArrayList;
import java.util.Date;

public class JobPost extends Job{
	private Long id;
	private Job job;
	private ArrayList<Skill> requiredSkills;
	private String description;
	private Salary minSalary;
	private Salary maxSalary;
	private int joiningInDays;
	private Date postedDate;
	private Employee poster;
	private ArrayList<Application> applications;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public ArrayList<Skill> getRequiredSkills() {
		return requiredSkills;
	}
	public void setRequiredSkills(ArrayList<Skill> requiredSkills) {
		this.requiredSkills = requiredSkills;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Salary getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(Salary minSalary) {
		this.minSalary = minSalary;
	}
	public Salary getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(Salary maxSalary) {
		this.maxSalary = maxSalary;
	}
	public int getJoiningInDays() {
		return joiningInDays;
	}
	public void setJoiningInDays(int joiningInDays) {
		this.joiningInDays = joiningInDays;
	}
	public Date getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	public Employee getPoster() {
		return poster;
	}
	public void setPoster(Employee poster) {
		this.poster = poster;
	}
	public ArrayList<Application> getApplications() {
		return applications;
	}
	public void setApplications(ArrayList<Application> applications) {
		this.applications = applications;
	}
	
}
