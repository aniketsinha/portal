package portal;

public class Degree {
	
	public Long id;
	public int year;
	public EducationalInstitution institute;
	public float percent;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public EducationalInstitution getInstitute() {
		return institute;
	}
	public void setInstitute(EducationalInstitution institute) {
		this.institute = institute;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}

	
}
