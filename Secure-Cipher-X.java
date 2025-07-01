import java.math.BigInteger;

public class SecureCipherX {
    
    // Encrypt plaintext using modular arithmetic
    public static int[] encrypt(String plaintext, int key, int mod) {
        int[] ciphertext = new int[plaintext.length()];
        for (int i = 0; i < plaintext.length(); i++) {
            ciphertext[i] = (plaintext.charAt(i) * key) % mod;
        }
        return ciphertext;
    }

    // Decrypt ciphertext using modular inverse
    public static String decrypt(int[] ciphertext, int key, int mod) {
        BigInteger keyInverse = BigInteger.valueOf(key).modInverse(BigInteger.valueOf(mod));
        StringBuilder decryptedText = new StringBuilder();
        
        for (int c : ciphertext) {
            decryptedText.append((char) ((c * keyInverse.intValue()) % mod));
        }
        return decryptedText.toString();
    }

    public static void main(String[] args) {
        String plaintext = "IMTIYAZ56";
        int key = 7;
        int mod = 97;  // Large prime number
        
        // Encryption Process
        int[] ciphertext = encrypt(plaintext, key, mod);
        System.out.print("Ciphertext: ");
        for (int c : ciphertext) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Decryption Process
        String decryptedText = decrypt(ciphertext, key, mod);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}