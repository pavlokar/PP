package konto;
import java.util.ArrayList;

public class Filiale {
	private ArrayList<Mitarbeiter> Mitarbeiter;
	private String Filialname;
	private int Begründungsdatum;
	
	public Filiale(String Filialname) {
		this.Filialname = Filialname;
		Begründungsdatum = 0;
	}
	
	public ArrayList<Mitarbeiter> getMitarbeiter(){
		return Mitarbeiter;
	}
	
	public String getFilialname() {
		return Filialname;
	}
	
	public int getBegründungsdatum() {
		return Begründungsdatum;
	}
	
	public void setFilialname(String Newname) {
		this.Filialname = Newname;
	}
	
	public void addMitarbeiter(Mitarbeiter NewMitarbeiter) {
		Mitarbeiter.add(NewMitarbeiter);
	}
	
	public void removeMitarbeiter(Mitarbeiter NewMitarbeiter) {
		Mitarbeiter.remove(NewMitarbeiter);
	}
}
