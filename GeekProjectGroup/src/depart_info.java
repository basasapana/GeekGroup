
public class depart_info {
	private String DID;
	private String department;
	public depart_info(String DID, String department) {
		super();
		this.DID = DID;
		this.department = department;
	}
	public String getDID() {
		return DID;
	}
	public void setDID(String dID) {
		DID = dID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
