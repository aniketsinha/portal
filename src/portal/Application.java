package portal;

import java.util.Date;

public class Application {
	public Long id;
	public JobPost jobPost;
	public Candidate candidate;
	public Date appliedDate;
	public boolean isViewedByHR;
	public boolean isShortlisted;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public JobPost getJobPost() {
		return jobPost;
	}
	public void setJobPost(JobPost jobPost) {
		this.jobPost = jobPost;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public Date getAppliedDate() {
		return appliedDate;
	}
	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}
	public boolean isViewedByHR() {
		return isViewedByHR;
	}
	public void setViewedByHR(boolean isViewedByHR) {
		this.isViewedByHR = isViewedByHR;
	}
	public boolean isShortlisted() {
		return isShortlisted;
	}
	public void setShortlisted(boolean isShortlisted) {
		this.isShortlisted = isShortlisted;
	}
	
		
}
