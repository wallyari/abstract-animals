package org.azienda.italy;
import java.time.LocalDate;
import java.util.Random;

public abstract class Person {

	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String companyCode;
	
	public Person(String name, String surname) {
		
		setName(name);
		setSurname(surname);
		setDateOfBirth();
		setCompanyCode();
		
	}
	
	private void setCompanyCode() {
		Random rnd = new Random();
		companyCode = rnd.nextInt(99999999) + "";
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	private void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	private void setDateOfBirth() {
		this.dateOfBirth = LocalDate.now();
	}

	public String getCompanyCode() {
		return companyCode;
	}
	
	public String getFullName() {
		return getName() + " " + getSurname() + " \nCode: " + getCompanyCode();
	}
	
	public abstract int getYearIncome();
	
	@Override
	public String toString() {

		return "\nNome e Cognome: " + getFullName()
				+ "\nData di nascita: " + getDateOfBirth()
				+ "\nIncasso annuale: " + getYearIncome() + " euro";
	}
}
	