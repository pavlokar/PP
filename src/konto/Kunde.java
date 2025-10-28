package konto;
import java.util.ArrayList;

public class Kunde {
	private int Kundennummer;
	private ArrayList<Konto> Kontos;
	private Person KundePerson;
	
	public Kunde(int Kundennummer, Person NewPerson) {
		this.Kundennummer = Kundennummer;
		this.KundePerson = NewPerson;
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
	
	public int getBeitrittsdatum() {
		return KundePerson.getBeitrittsdatum();
	}
}
