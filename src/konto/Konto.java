package konto;

public class Konto { 
	 private double kontostand; 
	 private String iban; 
	 
	 public Konto(String iban) {   
		 this.iban = iban; 
		 kontostand = 0; 
	 } 
	 
	 public double getKontostand() { 
		 return kontostand; 
	 } 
	  
	 public String getIban() { 
		 return iban; 
	 } 
	 
	 public void einzahlen(double betrag) { 
		 kontostand += betrag; 
	 } 
	 
	 public boolean auszahlen(double betrag) {   
		 kontostand -= betrag; 
		 return true; 
	} 
}
