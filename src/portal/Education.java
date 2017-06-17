package portal;

import java.util.ArrayList;

public class Education {

	private Degree xth;	
	private Degree xii;
	private Degree ug;
	private Degree pg;
	private ArrayList<Degree> moreDegrees;
	private ArrayList<Certification> certifications;
	
	public Degree getXth() {
		return xth;
	}
	public void setXth(Degree xth) {
		this.xth = xth;
	}
	public Degree getXii() {
		return xii;
	}
	public void setXii(Degree xii) {
		this.xii = xii;
	}
	public Degree getUg() {
		return ug;
	}
	public void setUg(Degree ug) {
		this.ug = ug;
	}
	public Degree getPg() {
		return pg;
	}
	public void setPg(Degree pg) {
		this.pg = pg;
	}
	public ArrayList<Degree> getMoreDegrees() {
		return moreDegrees;
	}
	public void setMoreDegrees(ArrayList<Degree> moreDegrees) {
		this.moreDegrees = moreDegrees;
	}
	public ArrayList<Certification> getCertifications() {
		return certifications;
	}
	public void setCertifications(ArrayList<Certification> certifications) {
		this.certifications = certifications;
	}

	
}
