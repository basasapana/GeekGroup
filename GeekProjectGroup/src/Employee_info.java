import java.util.Objects;

public class Employee_info {
	private String fName;
	private String lName;
	private String DOB;
	private String Position;
	private String Salary;
	private String ssn;
	private String DID;
	public Employee_info(String fName,String lName,String DOB,String Position,String Salary,String ssn,String DID) {
		this.fName=fName;
		this.lName=lName;
		this.DOB=DOB;
		this.Position=Position;
		this.Salary = Salary;
		this.ssn=ssn;
		this.DID=DID;
		
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDID() {
		return DID;
	}
	public void setDID(String dID) {
		DID = dID;
	}
	/*@Override
	public int hashCode() {
		return Objects.hash(DOB, ssn);
	}
	@Override
	public boolean equals(Object o) {
		 if (o == this) return true;
	        if (!(o instanceof Employee_info)) {
	            return false;
	        }
	        Employee_info emp = (Employee_info) o;
	        return ssn == emp.ssn && Objects.equals(DOB, emp.DOB);
	
	}*/
}
