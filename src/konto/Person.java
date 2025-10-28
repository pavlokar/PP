package konto;

public class Person {
	
	private String Name;
	private int Alter;
	private int Beitrittsdatum;
	
	public Person(String Name, int Beitrittsdatum) {
		this.Name = Name;
		this.Alter = 0;
		this.Beitrittsdatum = Beitrittsdatum;
	}
	
	public int getAlter() {
		return Alter;
	}
	
	public String getName() {
		return Name;
	}
	
	public int getBeitrittsdatum() {
		return Beitrittsdatum;
	}
}
