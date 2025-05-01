
# Java Assignment Test Case

**Name**    : Dimas Adit Thalia Putra  
**Class**   : SIB - 1B  
**NIM**     : 244107060037  
**Date**    : 01Mei2025

## Description
Repositori ini berisi test case dan implementasi berbagai algoritma struktur data dalam Java. Kode yang disediakan mencakup algoritma seperti pencarian sekuensial dan teknik pengurutan seperti quick sort, shell sort, dan lainnya.

## Programming Language
![Java](https://img.shields.io/badge/Language-Java%2022.0.2-blue.svg)

## How to Compile and Run the Code

### Compilation Command:
Untuk mengkompilasi kode Java, gunakan perintah berikut:

```bash
javac -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" "src/dataStructure/*.java"
```

### Running the Tests:
Untuk menjalankan test case dengan JUnit, gunakan perintah berikut:

```bash
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar;src" org.junit.runner.JUnitCore dataStructure.{class}
```

### Example:
Ganti {class} dengan nama class yang ingin diuji. Misalnya, jika Anda ingin menjalankan test untuk SequentialSearch, gunakan:

```bash
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar;src" org.junit.runner.JUnitCore dataStructure.SequentialSearchTest
```

## Libraries Required:
1. **JUnit**: Version 4.13.2
2. **Hamcrest**: Version 1.3
