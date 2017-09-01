# examples-kotlin

Simple examples that compile to .avm (currently using the neoj compiler) so you need to compile Kotlin to Java bytecode.

Steps to use:
1. Download neo-compiler project from neo-project
2. Compile neoj (the Java compiler) and publish it to give you neoj.exe (or equivalent executable)
3. From neoj folder, take the AntShares.SmartContract.Framework.jar
4. Create a Kotlin project (using an IDE or other) and add the JAR as an external library
5. Build the examples in this folder which produces a .class file
6. Run > neoj.exe <example>.class
7. Compiler runs and outputs <example>.avm
8. You can use the Testnet to deploy the smart contract

Notes:
- The current neoj compiler is functional but is not complete (so doesn't handle all types of Java bytecode).
- In particular, for Kotlin, the compiler doesn't currently understand Kotlin's extra internal null parameter check and will error.
- To get around this use ? with args and return values (see Hello World example) which removes Kotlin's check.

Enjoy!
~wy
