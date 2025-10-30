package konto;
import java.util.ArrayList;

public class Kunde {
	private int Kundennummer;
	private ArrayList<Konto> Kontos;
	private Person KundePerson;
	private ArrayList<Filiale> Filialen;
	
	public Kunde(int Kundennummer, Person NewPerson, String Beitrittsdatum, ArrayList<Filiale> filiale) {
		this.Kundennummer = Kundennummer;
		this.KundePerson = NewPerson;
		this.KundePerson.Beitrittsdatum = Beitrittsdatum;
		this.Filialen = filiale;
	}
	
	public int getKundennummer(){
		return Kundennummer;
	}
	
	public ArrayList<Konto> getKontos(){
		return Kontos;
	}
	
	public void addKonto(Konto konto) {
		Kontos.add(konto);
	}
	
	public void deleteKonto(Konto konto) {
		Kontos.remove(konto);
	}
	
	public String getBeitrittsdatum() {
		return KundePerson.getBeitrittsdatum();
	}
	
	public int getAlter() {
		return KundePerson.getAlter();
	}
	
	public String getName() {
		return KundePerson.getName();
	}
	
	public String getGeburtsdatum() {
		return KundePerson.getGeburtsdatum();
	}
	
	public void KundeGeburtstag() {
		KundePerson.Geburtstag();
	}
	
	public ArrayList<String> getFilialenamen(){
		ArrayList<String> FilialeNamen = new ArrayList<String>();
		for (Filiale filial : Filialen) {
			FilialeNamen.add(filial.getFilialname());
		}
		return FilialeNamen;
	}
}
