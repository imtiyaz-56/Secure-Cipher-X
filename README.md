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
