
public class CryptoManagerMain {

	public static void main(String[] args) {
		System.out.println(CryptoManager.caesarEncryption("ABC", 1));
		System.out.println(CryptoManager.caesarDecryption("ZAB", 1));
		System.out.println(CryptoManager.bellasoEncryption("TESTING", "KEY"));
		System.out.println(CryptoManager.bellasoDecryption("ZZZZZ", "Z"));

	}

}
