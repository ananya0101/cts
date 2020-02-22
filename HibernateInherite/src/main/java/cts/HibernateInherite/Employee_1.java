package cts.HibernateInherite;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_1")
public class Employee_1 extends Person_1
{
	@Column(name="joining_date")
    private Date joiningDate;	

	@Column(name="department_name")
	private String departmentName;
	
	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public Employee_1() {
	}
	
	public Employee_1(String firstname, String lastname, Date joiningDate, String departmentName) {
		super(firstname, lastname);
		this.joiningDate = joiningDate;
		this.departmentName = departmentName;
	}
}	