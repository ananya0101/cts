package hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User
{
	@Id
	@GeneratedValue
	@Column(name="ID")
	int id;
	
	@Column(name="name")
	String n;
	
	@Column(name="salary")
	int s;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
}