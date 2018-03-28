package in.webportal.Model.in;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class UserProfileModel {

	private String userName;
	private String position;
	private String contactNum;
	private String imgStr;
	private AddressObj address;
	private Date doj;
	private String exp;
	private String skills;
	private List<String> workingProj;
	private Map<String, List<String>> workingModules;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the contactNum
	 */
	public String getContactNum() {
		return contactNum;
	}

	/**
	 * @param contactNum
	 *            the contactNum to set
	 */
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	/**
	 * @return the imgStr
	 */
	public String getImgStr() {
		return imgStr;
	}

	/**
	 * @param imgStr
	 *            the imgStr to set
	 */
	public void setImgStr(String imgStr) {
		this.imgStr = imgStr;
	}

	/**
	 * @return the address
	 */
	public AddressObj getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(AddressObj address) {
		this.address = address;
	}

	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}

	/**
	 * @param doj
	 *            the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	/**
	 * @return the exp
	 */
	public String getExp() {
		return exp;
	}

	/**
	 * @param exp
	 *            the exp to set
	 */
	public void setExp(String exp) {
		this.exp = exp;
	}

	/**
	 * @return the skills
	 */
	public String getSkills() {
		return skills;
	}

	/**
	 * @param skills
	 *            the skills to set
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the workingProj
	 */
	public List<String> getWorkingProj() {
		return workingProj;
	}

	/**
	 * @param workingProj
	 *            the workingProj to set
	 */
	public void setWorkingProj(List<String> workingProj) {
		this.workingProj = workingProj;
	}

	/**
	 * @return the workingModules
	 */
	public Map<String, List<String>> getWorkingModules() {
		return workingModules;
	}

	/**
	 * @param workingModules
	 *            the workingModules to set
	 */
	public void setWorkingModules(Map<String, List<String>> workingModules) {
		this.workingModules = workingModules;
	}

}
