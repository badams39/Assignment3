import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
	    assertTrue(CryptoManager.isStringInBounds("HELLO WORLD"));
	    assertTrue(CryptoManager.isStringInBounds("1234567890"));
	    assertTrue(CryptoManager.isStringInBounds("!@#$%^&*()_+"));
	}

	@Test
	public void testEncryptCaesar() {
	    assertEquals("BCD", CryptoManager.caesarEncryption("ABC", 1));
	    assertEquals("^_ ", CryptoManager.caesarEncryption("ABC", 29));  
	    assertEquals("!\"#", CryptoManager.caesarEncryption("ABC", 96));
	    assertEquals("!", CryptoManager.caesarEncryption(" ", 1));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("Y@A", CryptoManager.caesarDecryption("ZAB", 1));
		assertEquals("HELLO WORLD", CryptoManager.caesarDecryption("4188;LC;>80", 300));
		assertEquals("ABC", CryptoManager.caesarDecryption("!\"#", 96));  
		assertEquals("_", CryptoManager.caesarDecryption(" ", 1));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("_J,_N'R", CryptoManager.bellasoEncryption("TESTING", "KEY"));
		assertEquals(" T![", CryptoManager.bellasoEncryption("TEST", "LONGERKEY"));
		assertEquals("MPZF", CryptoManager.bellasoEncryption("JAVA", "CODE"));
		assertEquals("+", CryptoManager.bellasoEncryption(" ", "KEY"));

	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("LIJQIG[", CryptoManager.bellasoDecryption("WN#\\N &", "KEY"));
		assertEquals("R9YG", CryptoManager.bellasoDecryption("UH]L", "CODE"));
		assertEquals("U", CryptoManager.bellasoDecryption(" ", "KEY"));
		assertEquals("@@@@@", CryptoManager.bellasoDecryption("ZZZZZ", "Z"));
	}

}
