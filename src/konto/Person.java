package konto;

public class Person {
	
	private String Name;
	private int Alter;
	private String Geburtsdatum;
	public String Beitrittsdatum;
	
	public Person(String Name, String Beitrittsdatum, String Geburtsdatum) {
		this.Name = Name;
		this.Alter = 0;
		this.Beitrittsdatum = Beitrittsdatum;
		this.Geburtsdatum = Geburtsdatum;
	}
	
	public int getAlter() {
		return Alter;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getBeitrittsdatum() {
		return Beitrittsdatum;
	}
	
	public String getGeburtsdatum() {
		return Geburtsdatum;
	}
	
	public void Geburtstag() {
		Alter += 1;
	}
}
