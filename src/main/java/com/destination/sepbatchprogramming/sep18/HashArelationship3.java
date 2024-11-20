package com.destination.sepbatchprogramming.sep18;
//Composite classes
class Heart {
 public void beat() {
     System.out.println("Heart is beating.");
 }
}

class Brain {
 public void think() {
     System.out.println("Brain is thinking.");
 }
}

//Base class
class Human {
 private Heart heart;
 private Brain brain;

 public Human() {
     this.heart = new Heart();
     this.brain = new Brain();
 }

 public void live() {
     heart.beat();
     brain.think();
     System.out.println("Human is living.");
 }
}

//Aggregated classes
class Car {
 public void drive() {
     System.out.println("Driving the car.");
 }
}

class Mobile {
 public void call() {
     System.out.println("Making a call on the mobile.");
 }
}

//Derived class
class Student extends Human {
 private Car car;
 private Mobile mobile;

 public Student(Car car, Mobile mobile) {
     super();
     this.car = car;
     this.mobile = mobile;
 }

 public void useCar() {
     car.drive();
 }

 public void useMobile() {
     mobile.call();
 }
}

//Main class
public class HashArelationship3 {
 public static void main(String[] args) {
     Car car = new Car();
     Mobile mobile = new Mobile();

     Student student = new Student(car, mobile);

     student.live(); // inherited from Human
     student.useCar(); // aggregation: student can use car
     student.useMobile(); // aggregation: student can use mobile
 }
}
