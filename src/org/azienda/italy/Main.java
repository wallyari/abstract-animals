package org.azienda.italy;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Andrea", "Rossi", 1200, 12);
		Employee e2 = new Employee("Arianna", "Verdi", 1400, 12);
		Employee e3 = new Employee("Luigi", "Neri", 1700, 14);
		Employee e4 = new Employee("Michela", "Bianchi", 1700, 14);
		
		Boss boss1 = new Boss("Angela", "Rossi", 4100, 5000);
		Boss boss2 = new Boss("Carmine", "Verdi", 4000, 6000);
				
		Person[ ] company = { e1, e2, e3, e4, boss1, boss2 };
		
		int maxYearIncome = Integer.MIN_VALUE;
		int minYearIncome = Integer.MAX_VALUE;
		
		Person maxIncomePerson = null;
		Person minIncomePerson = null;
		
		for (int i = 0; i < company.length; i++) {
			
			Person personValue = company[i];
			int personYearIncomeValue = personValue.getYearIncome(); 
			
			if(personYearIncomeValue > maxYearIncome) {
				maxYearIncome = personYearIncomeValue;
				maxIncomePerson = personValue;
			}
			if(personYearIncomeValue < minYearIncome) {
				minYearIncome = personYearIncomeValue;
				minIncomePerson = personValue;
			}
			
		}
		System.out.println("Incasso annuale massimo: " + maxYearIncome + " euro");
		System.out.println("Persona con incasso annuale massimo: \n" + maxIncomePerson);
		
		System.out.println("------------------------------------------");
		
		System.out.println("Incasso annuale minimo: " + minYearIncome + " euro");
		System.out.println("Persona con incasso annuale minimo: \n" + minIncomePerson);
	}
	
}