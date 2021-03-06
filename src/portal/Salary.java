package portal;

import java.util.ArrayList;

public class Salary {

	private float basic;
	private float hra;
	private float conveyance;
	private float educationAllowance;
	private float otherAllowance;
	private boolean isESOP;
	private float esopPercent;
	private ArrayList<Perk> perks;
	private float ctc;
	
	public float getBasic() {
		return basic;
	}
	public void setBasic(float basic) {
		this.basic = basic;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	public float getConveyance() {
		return conveyance;
	}
	public void setConveyance(float conveyance) {
		this.conveyance = conveyance;
	}
	public float getEducationAllowance() {
		return educationAllowance;
	}
	public void setEducationAllowance(float educationAllowance) {
		this.educationAllowance = educationAllowance;
	}
	public float getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(float otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public boolean isESOP() {
		return isESOP;
	}
	public void setESOP(boolean isESOP) {
		this.isESOP = isESOP;
	}
	public float getEsopPercent() {
		return esopPercent;
	}
	public void setEsopPercent(float esopPercent) {
		this.esopPercent = esopPercent;
	}
	public ArrayList<Perk> getPerks() {
		return perks;
	}
	public void setPerks(ArrayList<Perk> perks) {
		this.perks = perks;
	}
	public float getCtc() {
		return ctc;
	}
	public void setCtc(float ctc) {
		this.ctc = ctc;
	}
	
	
}
