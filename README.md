 🎯 Java Design Pattern Exercises

This repository contains **Java implementations** of common design patterns as part of a coding exercise.
The goal is to demonstrate understanding of **behavioral, creational, and structural patterns**, as well as good coding practices (SOLID principles, OOP, exception handling, modularity).

---

## 📘 Patterns Implemented

## 🔹 Behavioral

1. **Observer Pattern** – *Weather Station & Displays*
2. **Strategy Pattern** – *Shopping Cart with multiple payment methods*

### 🔹 Creational

3. **Singleton Pattern** – *Logger service (single instance across app)*
4. **Factory Pattern** – *Shape Factory (Circle, Square)*

### 🔹 Structural

5. **Adapter Pattern** – *Media Player supporting MP3 & MP4 through adapter*
6. **Decorator Pattern** – *Coffee Shop with add-ons (Milk, etc.)*

---

## 🗂️ Project Structure

```
.
├── src/
│   └── com/example/patterns/
│       ├── Observer.java
│       ├── WeatherStation.java
│       ├── PhoneDisplay.java
│       ├── Strategy.java
│       ├── CreditCardPayment.java
│       ├── UpiPayment.java
│       ├── ShoppingCart.java
│       ├── Logger.java
│       ├── Shape.java
│       ├── Circle.java
│       ├── Square.java
│       ├── ShapeFactory.java
│       ├── MediaPlayer.java
│       ├── Mp3Player.java
│       ├── AdvancedPlayer.java
│       ├── MediaAdapter.java
│       ├── Coffee.java
│       ├── SimpleCoffee.java
│       ├── MilkDecorator.java
│       └── Main.java   # driver to run demos
│
└── README.md
```

---

## ⚙️ How to Run

### ✅ Compile & Run (without build tools)

```bash
# Compile
javac -d out src/com/example/patterns/*.java

# Run
java -cp out com.example.patterns.Main
```


### ✅ Run in VS Code

1. Install **Extension Pack for Java** in VS Code.
2. Open the repo folder in VS Code.
3. Open `Main.java`.
4. Click **Run ▶️** above the `main` method.

---

### ✅ Run with Maven (if project is Mavenized)

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.patterns.Main"
```

---

## 🎮 Example Outputs

### Observer

```
Phone Display: Temp is 25.0°C
Phone Display: Temp is 30.5°C
```

### Strategy

```
Paid 1000 using Credit Card.
Paid 500 using UPI.
```

### Singleton

```
LOG: This is the first log message.
LOG: This is the second log message.
logger1 == logger2 ? true
```

### Factory

```
Drawing Circle
Drawing Square
```

### Adapter

```
Playing MP3 file: song1.mp3
Playing MP4 file: movie1.mp4
Invalid format. MP3 player supports only MP3 files.
```

### Decorator

```
Simple Coffee → $5.0
Simple Coffee, Milk → $7.0
```

---

## 📖 Notes

* Each class/interface should ideally be in its **own file** (already structured above).
* Follow **SOLID principles**: single responsibility, open/closed, etc.
* Extendable:

  * Add more payment methods (Strategy).
  * Add more shapes (Factory).
  * Add more decorators like *SugarDecorator*, *CreamDecorator* (Decorator).

---

## 📝 Author

Developed as part of **Human Capital Coding Exercises (2025-26)**.

---


