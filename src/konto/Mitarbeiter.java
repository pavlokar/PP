package konto;
import java.util.ArrayList;

public class Mitarbeiter {
	private int Mitarbeiternummer;
	private ArrayList<Kunde> Kunden;
	private Person MitarbeiterPerson;
	private ArrayList<Filiale> Filialen;
	
	public Mitarbeiter(int Mitarbeiternummer, Person newPerson, String Beitrittsdatum, ArrayList<Filiale> filiale) {
		this.Mitarbeiternummer = Mitarbeiternummer;
		this.MitarbeiterPerson = newPerson;
		this.MitarbeiterPerson.Beitrittsdatum = Beitrittsdatum;
		this.Filialen = filiale;
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
	
	public String getBeitrittsdatum() {
		return MitarbeiterPerson.getBeitrittsdatum();
	}
	
	public int getAlter() {
		return MitarbeiterPerson.getAlter();
	}
	
	public String getName() {
		return MitarbeiterPerson.getName();
	}
	
	public String getGeburtsdatum() {
		return MitarbeiterPerson.getGeburtsdatum();
	}
	
	public void KundeGeburtstag() {
		MitarbeiterPerson.Geburtstag();
	}
	
	public ArrayList<String> getFilialenamen(){
		ArrayList<String> FilialeNamen = new ArrayList<String>();
		for (Filiale filial : Filialen) {
			FilialeNamen.add(filial.getFilialname());
		}
		return FilialeNamen;
	}
}
