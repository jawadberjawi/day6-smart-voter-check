# 🗳️ SmartVoterCheck

This is a beginner-level Java console application that checks if a user is eligible to vote based on their age and whether they have a valid voting ID.

---

## 📌 Features

- Takes user **name**, **age**, and **voting ID status**
- Uses `Scanner` to handle **user input**
- Uses `if / else if / else` statements to decide:
  - ✅ Eligible to vote
  - ⚠️ Old enough but missing ID
  - ❌ Not eligible (underage)

---

## 📄 Code Example

```java
Scanner input = new Scanner(System.in);
System.out.print("Please enter your name: ");
String name = input.next();

System.out.print("Please enter your age: ");
int age = input.nextInt();

System.out.print("Do you have Voting ID? (true or false): ");
boolean hasId = input.nextBoolean();

if (age >= 18 && hasId) {
    System.out.println("Hello " + name + ", you are eligible to vote!");
} else if (age >= 18 && !hasId) {
    System.out.println("Hello " + name + ", you are old enough but need a valid voting ID to vote.");
} else {
    System.out.println("Sorry " + name + ", you are not eligible to vote.");
}
```

---

## 📷 Sample Output

```
Please enter your name: Jawad  
Please enter your age: 22  
Do you have Voting ID? (true or false): true  
Hello Jawad, you are eligible to vote!
```

---

## 💡 What You Learn

- Basic Java syntax  
- Using the `Scanner` class for input  
- Using conditions (`if`, `else`)  
- Working with `String`, `int`, and `boolean` types  
- Clean console interaction

---

## 🛠️ How to Run

1. Open terminal  
2. Navigate to the project folder  
3. Compile:
   ```bash
   javac SmartVoterCheck.java
   ```
4. Run:
   ```bash
   java SmartVoterCheck
   ```

---

## 📁 File Structure

```
day5-smart-voter-check/
├── SmartVoterCheck.java
└── README.md
```

---

## 🧠 Author

**Jawad** — Java Developer in training 💻  
Building skills day by day 💪

---

## ✅ Status

✅ **Completed** — This is a small project for learning and practice purposes.
