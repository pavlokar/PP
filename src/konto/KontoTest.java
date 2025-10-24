package konto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

class KontoTest { 
	 String iban1 = "DE08700901001234567890";
	 Konto konto1 = new Konto(iban1); 
	 
	 @Test 
	 public void testIBANUebernommen() { 
	  assertEquals("DE08700901001234567890", konto1.getIban()); 
	 } 
	 
	 @SuppressWarnings("deprecation")
	@Test 
	 public void testKontostandAmAnfang() { 
	  assertEquals(0, konto1.getKontostand()); 
	 } 
	 
	 @SuppressWarnings("deprecation")
	@Test 
	 public void testEinzahlen() { 
	  konto1.einzahlen(200); 
	  assertEquals(200.00, konto1.getKontostand()); 
	 } 

	 @SuppressWarnings("deprecation")
	@Test 
	 public void testAuszahlen() { 
	  konto1.einzahlen(200); 
	  konto1.auszahlen(150); 
	  assertEquals(50.00, konto1.getKontostand()); 
	 } 

	 @Test 
	 public void testAuszahlenTrue() { 
	  konto1.einzahlen(200); 
	  assertTrue(konto1.auszahlen(150)); 
	 } 
	 
	 @Test 
	 public void testAuszahlenFalse() { 
	  konto1.einzahlen(200); 
	  assertFalse(konto1.auszahlen(250)); 
	 } 

	 @SuppressWarnings("deprecation")
	@Test 
	 public void testUeberziehe() { 
	  konto1.einzahlen(200); 
	  konto1.auszahlen(250); 
	  assertEquals(200, konto1.getKontostand()); 
	 } 
	}
