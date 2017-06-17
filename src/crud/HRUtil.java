package crud;

import java.util.ArrayList;
import java.util.Date;

import authentication.UserCredential;
import portal.Application;
import portal.Candidate;
import portal.Company;
import portal.Department;
import portal.Employee;
import portal.Job;
import portal.JobPost;
import portal.Salary;
import portal.Skill;

public class HRUtil {

	public static void postNewJob(Company company, Department department, String description, Long id, Job job, int joiningInDays, Salary maxSalary, Salary minSalary, ArrayList<Skill> requiredSkills) {
		Employee poster = UserCredential.getEmployee();
		
		JobPost post = new JobPost();
		post.setCompany(company);
		post.setDepartment(department);
		post.setDescription(description);
		post.setId(id);
		post.setJob(job);
		post.setJoiningInDays(joiningInDays);
		post.setMaxSalary(maxSalary);
		post.setMinSalary(minSalary);
		post.setRequiredSkills(requiredSkills);
		post.setPoster(poster);
		post.setPostedDate(new Date());
	}
	
	public static JobPost getJobPostById(Long jobPostId) {
		JobPost jobPost = null;
		//fetch details from DB
		return jobPost;
	}
	
	public static Application getApplicationDetails(Long id) {
		Application appl = null;
		//query DB for application
		return appl;
	}
	
	public static ArrayList<Application> getAllApplicationsForJobPost(Long jobPostId) {
		ArrayList<Application> allApplications = new ArrayList<Application>();
		//fetch details from DB
		return allApplications;
	}
	
	public static Candidate getCandidateDetails(Long id) {
		Candidate candidate = null;
		//fetch details from DB based on id
		return candidate;
	}
}
