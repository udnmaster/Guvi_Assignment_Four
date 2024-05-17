package com.demo.AssignmentFour;

//VoterAgeException class (custom checked exception)
class VoterAgeException extends Exception {
 public VoterAgeException(String message) {
     super(message);
 }
}

//Voter class
class Voter {
 private int voterId;
 private String name;
 private int age;

 // Constructor
 public Voter(int voterId, String name, int age) throws VoterAgeException {
     if (age < 18) {
         throw new VoterAgeException("Invalid age for voter");
     }
     this.voterId = voterId;
     this.name = name;
     this.age = age;
 }

 // Getter methods
 public int getVoterId() {
     return voterId;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }
}

public class MainVoter {
 public static void main(String[] args) {
     try {
         // Creating a Voter object with valid age
         Voter voter1 = new Voter(101, "John Doe", 25);
         System.out.println("Voter created: " + voter1.getName() + ", Age: " + voter1.getAge());

         // Trying to create a Voter object with invalid age
         // Voter voter2 = new Voter(102, "Alice", 17);

     } catch (VoterAgeException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
