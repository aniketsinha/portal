package crud;

import java.util.ArrayList;
import java.util.Date;

import authentication.UserCredential;
import portal.Application;
import portal.Candidate;
import portal.Company;
import portal.JobPost;
import portal.Salary;
import portal.Skill;

public class CandidateUtil {

	public static ArrayList<JobPost> searchJobsByKeywords(ArrayList<String> keywords) {
		ArrayList<JobPost> result = new ArrayList<JobPost>();
		//query DB with user's input
		return result;
		
	}
	public static ArrayList<JobPost> searchJobsByCompanies(ArrayList<Company> companies) {
		ArrayList<JobPost> result = new ArrayList<JobPost>();
			//query DB with user's input
		return result;
	}
	public static ArrayList<JobPost> searchJobsByCities(ArrayList<String> cities) {
		ArrayList<JobPost> result = new ArrayList<JobPost>();
		//query DB with user's input
		return result;
	}
	public static ArrayList<JobPost> searchJobsBySkills(ArrayList<Skill> skills) {
		ArrayList<JobPost> result = new ArrayList<JobPost>();
		//query DB with user's input
		return result;
	}
	
	public static ArrayList<JobPost> searchJobsBySalary(Salary minSalary, Salary maxSalary) {
		ArrayList<JobPost> result = new ArrayList<JobPost>();
		//query DB with user's input
		return result;
	}
	
	public static ArrayList<JobPost> searchJobsByFilters(ArrayList<String> keyword, ArrayList<Company> companies, ArrayList<String> cities, ArrayList<Skill> skills, Salary minSalary, Salary maxSalary) {
		ArrayList<JobPost> result = new ArrayList<JobPost>();
		//query DB with user's input
		return result;
	}
	
	public static JobPost getJobPostDetails(Long postId) {
		JobPost jobPost = null;
		//fetch post details from DB
		return jobPost;
	}
	
	public static Company getCompanyDetails(Long companyId) {
		Company company = null;
		//fetch details from DB
		return company;
	}
	
	public static Application applyForJob(Long jobPostId) {
		Application jobAppl = new Application();
		JobPost jobPost = HRUtil.getJobPostById(jobPostId);
		Candidate candidate = UserCredential.getCandidate();
		jobAppl.setCandidate(candidate);
		jobAppl.setViewedByHR(Boolean.FALSE);
		jobAppl.setJobPost(jobPost);
		jobAppl.setAppliedDate(new Date());
		
		return jobAppl;
	}
}
