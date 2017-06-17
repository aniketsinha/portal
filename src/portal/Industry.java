package portal;

import java.util.ArrayList;

public class Industry {
	private Long id;
	private String name;
	private ArrayList<Industry> relatedIndustries;
	
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
