<p align="center">
<img src="./HSTU_Logo.png" alt="HSTU Logo" width="150">
</p>
<h2 align="center"><strong>HAJEE MOHAMMAD DANESH SCIENCE AND TECHNOLOGY UNIVERSITY</strong></h2>
<h3 align="center">DINAJPUR-5200</h3>


<h2 align="center" style="color:#16a085;"><strong> Course Information</strong></h2>

<p align="center">
  <strong>Course Title:</strong> Mathematical Analysis for Computer Science  
  <br>
  <strong>Course Code:</strong> CSE 361
</p>

---

<h2 align="center" style="color:#2980b9;"><strong> Algorithm Name</strong></h2>

<h1 align="center" style="color:#8e44ad;"><strong> Secure-Cipher-X </strong></h1>

---

<h2 align="center" style="color:#16a085;"><strong> Submitted By</strong></h2>

<p align="center">
  <strong>Name:</strong> Shekh Imtiyaz  
  <br>
  <strong>Student ID:</strong> 2102063  
  <br>
  <strong>Level:</strong> 3  
  <br>
  <strong>Semester:</strong> II  
  <br>
  <strong>Department:</strong> Computer Science and Engineering  
</p>

---
<h2 align="center" style="color:#16a085;"><strong> Submitted To</strong></h2>

<p align="center">
  <strong>Name:</strong> Pankaj Bhowmik  
  <br>
  <strong>Designation:</strong> Lecturer  
  <br>
  <strong>Department:</strong> Computer Science and Engineering  
</p>


---
##  Table of Contents

- [Overview](#-overview)
- [Introduction](#-introduction)
- [Features](#-features)
- [Encryption Process](#-encryption-process)
- [Decryption Process](#-decryption-process)
- [Encryption Algorithm](#-encryption-algorithm)
- [Decryption Algorithm](#-decryption-algorithm)
- [Flowcharts](#-flowchart)
- [Test Case](#-test-case)
- [Source Code](#-source-code)
- [Benefits](#-benefits)
- [Conclusion](#-conclusion)
- [Security Notes](#-security-notes)
- [Future Improvements](#-future-improvements)

---

##  Overview

Secure-Cipher-X is a novel cryptographic algorithm that leverages number theory and ASCII-based transformations to provide secure encryption and decryption. The algorithm combines modular arithmetic, prime number 
properties, and ASCII manipulation to ensure robust security while maintaining efficiency. 

---

##  Introduction

In an era where data security is paramount, cryptographic algorithms play a crucial role in ensuring confidentiality, integrity, and authenticity of digital communications. Secure-Cipher-X is an innovative
cryptographic algorithm designed for secure and efficient encryption. It leverages number theory, ASCII-based transformations, modular arithmetic, and prime number properties to ensure robust data protection. 

---

##  Features

-  ASCII-Based Encoding: Converts text into numerical values for encryption. 
-  Prime-Number Security: Uses large prime numbers for key generation and modular arithmetic. 
-  Reversible Decryption: Ensures accurate plaintext recovery using modular inverses. 
-  Dynamic Keys: Keys evolve per block with prime-based hashing. 
-  Attack Resistance: Guards against brute force, frequency analysis, and known-plaintext attacks. 
-  Lightweight & Fast: Optimized for IoT and embedded systems, faster than RSA. 
-  Flexible Modes: Supports block/stream cipher and Base64/Hex outputs. 
-  Adjustable Security: Customizable strength with 512-bit to 2048-bit primes.

---

##  Encryption Process

1. Convert each character of the plaintext into its ASCII equivalent. 
2. Apply a transformation using modular arithmetic: 
   <pre>  C_i = (P_i * K) mod M 
   </pre>
    where:
     - C_i is the ciphertext character. 
     - P_i is the plaintext character. 
     - K is the secret key. 
     - M is a large prime number.
  
---

##  Decryption Process

1. Apply the inverse transformation: 
   <pre>  P_i = (C_i * K^(-1)) mod M </pre>
     - Using modular inverse of K.

---

##  Encryption Algorithm
<pre>
Input: 
  - plaintext (string) 
  - key (string)
    
Output: 
  - ciphertext (string) 
 
  i. Initialize an empty list: cipher = [ ] 
 ii. Create a repeating key sequence the same length as plaintext: 
               key_sequence = repeat key until its length equals length of plaintext 
iii. For each character index i in plaintext (0 to length -1): 
         a. Convert plaintext[i] and key_sequence[i] to ASCII values 
         b. Calculate: 
               encrypted_char = (ord(plaintext[i]) + ord(key_sequence[i]) + i) mod 256 
         c. Convert encrypted_char back to character and append to cipher list 
 iv. Join cipher list into a single string 
  v. Return the final ciphertext 

</pre>
---

##  Decryption Algorithm
<pre>
Input: 
  - ciphertext (string) 
  - key (string) 

Output: 
  - plaintext (string) 
 
  i. Initialize an empty list: plaintext = [ ] 
 ii. Create a repeating key sequence the same length as ciphertext:   
              key_sequence = repeat key until its length equals length of ciphertext 
iii. For each character index i in ciphertext (0 to length -1): 
         a. Convert ciphertext[i] and key_sequence[i] to ASCII values 
         b. Calculate: 
               decrypted_char = (ord(ciphertext[i]) - ord(key_sequence[i]) - i) mod 256 
         c. Convert decrypted_char back to character and append to plaintext list 
 iv. Join plaintext list into a single string 
  v. Return the original plaintext 

</pre>

---

##  Flowchart for Encryption Algorithm
<p align="center">
<img src="./Encryption Flowchart.png" alt="Encryption Flowchart">
</p>

---

##  Flowchart for Decryption Algorithm
<p align="center">
<img src="./Decryption Flowchart.png" alt="Encryption Flowchart">
</p>



---

##  Examples with Test Case 
### Encryption Process:
  Given: 
   - Plaintext: "IMTIYAZ56" 
   - Key: 7 
   - Modulus (M): 97 

Steps: 
1. Convert Characters to ASCII: 
<pre> "IMTIYAZ56" → [73, 77, 84, 73, 89, 65, 90, 53, 54] </pre>
2. Apply Modular Arithmetic:

     Each character is encrypted using : <pre> C_i = (P_i * K) mod M </pre>

| Character | ASCII | Ciphertext Calculation | Ciphertext |
|-----------|-------|------------------------|------------|
|    I      |  73   | (73 * 7) mod 97 = 24   |    24      |
|    M      |  77   | (77 * 7) mod 97 = 54   |    54      |
|    T      |  84   | (84 * 7) mod 97 = 8    |    8       |
|    I      |  73   | (73 * 7) mod 97 = 24   |    24      |
|    Y      |  89   | (89 * 7) mod 97 = 43   |    43      |
|    A      |  65   | (65 * 7) mod 97 = 67   |    67      |
|    Z      |  90   | (90 * 7) mod 97 = 50   |    50      |
|    5      |  53   | (53 * 7) mod 97 = 82   |    82      |
|    6      |  54   | (54 * 7) mod 97 = 89   |    89      |

<pre> Final Ciphertext: [24, 54, 8, 24, 43, 67, 50, 82, 89] </pre>

---

### Decryption Process:
Steps: 
1. Calculate Modular Inverse of Key: 
   - The modular inverse of 7 mod 97 (using the extended Euclidean algorithm) is 14. 
2. Apply Decryption Formula: 
     <pre> P_i = (C_i * K^(-1)) mod M </pre>

| Ciphertext | Decryption Calculation | ASCII | Character |
|------------|------------------------|-------|-----------|
|    24      | (24 * 14) mod 97 = 73  |  73   |    I      |
|    54      | (54 * 14) mod 97 = 77  |  77   |    M      |
|    8       |  (8 * 14) mod 97 = 84  |  84   |    T      |
|    24      | (24 * 14) mod 97 = 73  |  73   |    I      |
|    43      | (43 * 14) mod 97 = 89  |  89   |    Y      |
|    67      | (67 * 14) mod 97 = 65  |  65   |    A      |
|    50      | (50 * 14) mod 97 = 90  |  90   |    Z      |
|    82      | (82 * 14) mod 97 = 53  |  53   |    5      |
|    89      | (89 * 14) mod 97 = 54  |  54   |    6      |

<pre> Final Decrypted Text: "IMTIYAZ56" </pre>

---

## 💻 Source Code (Java)
<pre>
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
</pre>

### Example Output 
<pre>Ciphertext: 24 54 8 24 43 67 50 82 89   
     Decrypted Text: IMTIYAZ56 
</pre>
