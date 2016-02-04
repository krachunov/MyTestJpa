package edu.pragmatic.homework.sql.jpa;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance
@DiscriminatorColumn(name = "PROJ_TYPE")
@Table(name = "employees2")
public abstract class People {

	@Id
	private int empNo;

	@Column(name = "birth_date")
	private String birthDate;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastLame;

	private String gender;

	public String getBirthDate() {
		return birthDate;
	}

	public People() {
	}

	public People(String birthDate, String firstName, String lastLame,
			String gender, int empNo) {
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastLame = lastLame;
		this.gender = gender;
		this.empNo = empNo;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastLame() {
		return lastLame;
	}

	public void setLastLame(String lastLame) {
		this.lastLame = lastLame;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
