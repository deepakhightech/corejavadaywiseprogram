package com.destination.sepbatchprogramming.sep18;

class Heart4 {
	 public void beat() {
	     System.out.println("Heart is beating.");
	 }
}
class Brain4 {
	 public void think() {
	     System.out.println("Brain is thinking.");
	 }
}
class Human {
	 private Heart4 heart;
	 private Brain4 brain;

	 public Human() {
	     this.heart = new Heart4();
	     this.brain = new Brain4();
	 }

	 public void live() {
	     heart.beat();
	     brain.think();
	     System.out.println("Human is living.");
	 }
}
class Car {
	 public void drive() {
	     System.out.println("Driving the car.");
	 }
}

class Mobile4 {
	 public void call() {
	     System.out.println("Making a call on the mobile.");
	 }
}
class Student extends Human {
	 private Car car;
	 private Mobile4 mobile;

public Student(Car car, Mobile4 mobile) {
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
public class hasrelation123 {
 public static void main(String[] args) {
	 Car car = new Car();
     Mobile4 mobile = new Mobile4();

     Student student = new Student(car, mobile);
     student.live(); // inherited from Human
     student.useCar(); // aggregation: student can use car
     student.useMobile(); // aggregation: student can use mobile
 }
}
