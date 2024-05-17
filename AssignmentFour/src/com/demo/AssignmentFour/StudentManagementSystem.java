package com.demo.AssignmentFour;

//AgeNotWithinRangeException class (custom checked exception)
class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
     super(message);
 }
}

//NameNotValidException class (custom checked exception)
class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}

//Student class
class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 // Constructor with exception handling
 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     // Check age validity
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
     }
     // Check name validity
     if (!name.matches("[a-zA-Z ]+")) {
         throw new NameNotValidException("Name should only contain alphabets and spaces.");
     }
     // Assign values
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }

 // Getter methods
 public int getRollNo() {
     return rollNo;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public String getCourse() {
     return course;
 }
}

//Main class
public class StudentManagementSystem {
 public static void main(String[] args) {
     try {
         // Create a student with valid attributes
         Student student1 = new Student(101, "John Doe", 20, "Computer Science");
         System.out.println("Student created: " + student1.getName() + ", Age: " + student1.getAge());

         // Attempt to create a student with invalid age
         // Student student2 = new Student(102, "Alice", 14, "Mathematics");

         // Attempt to create a student with invalid name
         // Student student3 = new Student(103, "Bob123", 18, "Physics");

     } catch (AgeNotWithinRangeException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (NameNotValidException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
