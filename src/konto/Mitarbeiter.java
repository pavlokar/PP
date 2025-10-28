package konto;
import java.util.ArrayList;

public class Mitarbeiter {
	private int Mitarbeiternummer;
	private ArrayList<Kunde> Kunden;
	private Person MitarbeiterPerson;
	
	public Mitarbeiter(int Mitarbeiternummer, Person newPerson) {
		this.Mitarbeiternummer = Mitarbeiternummer;
		this.MitarbeiterPerson = newPerson;
	}
	
	public ArrayList<Kunde> getKunde(){
		return Kunden;
	}
	
	public int getMitarbeiternummer() {
		return Mitarbeiternummer;
	}
	
	public void addKunde(Kunde newKunde) {
		Kunden.add(newKunde);
	}
	
	public void removeKunde(Kunde newKunde) {
		Kunden.remove(newKunde);
	}
	
	public int getBeitrittsdatum() {
		return MitarbeiterPerson.getBeitrittsdatum();
	}
}
