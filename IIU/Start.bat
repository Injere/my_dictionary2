echo off
javac -version
rd /s /q classes
mkdir classes
javac -d ./classes Main.java
cd classes
java -cp . Main

pause





