package portal;

import java.util.ArrayList;

public class Industry {
	public Long id;
	public String name;
	public ArrayList<Industry> relatedIndustries;
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
	public ArrayList<Industry> getRelatedIndustries() {
		return relatedIndustries;
	}
	public void setRelatedIndustries(ArrayList<Industry> relatedIndustries) {
		this.relatedIndustries = relatedIndustries;
	}
}
