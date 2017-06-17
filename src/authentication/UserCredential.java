package authentication;

import portal.Candidate;
import portal.Employee;

public class UserCredential {
	public static Employee getEmployee() {
		Employee emp = null;
		//fetch logged in user details
		return emp;
	}
	public static Employee getEmployee(Long employeeId) {
		Employee emp = null;
		//fetch user details from DB based on employeeId 
		return emp;
	}
	
	public static Candidate getCandidate() {
		Candidate candidate = null;
		//fetch candidate details based on user's session
		return candidate;
	}
	public static Candidate getCandidate(Long candidateId) {
		Candidate candidate = null;
		//fetch candidate details from DB
		return candidate;
	}
}
