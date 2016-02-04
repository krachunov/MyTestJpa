package edu.pragmatic.homework.sql.jpa;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("E")
@Table(name = "employees2")
public class Employee extends People {

	@Column(name="hire_date")
	private String hireDate;

	public Employee() {
	}

	public Employee(String birthDate, String firstName, String lastLame,
			String gender, int empNo, String hireDate) {
		super(birthDate, firstName, lastLame, gender, empNo);
		this.hireDate = hireDate;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

}
