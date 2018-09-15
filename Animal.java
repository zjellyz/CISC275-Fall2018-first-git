// Gaojie Zhang
//CISC 275 LAB 3
 
 public abstract class Animal implements Comparable<Animal>{
	 public String name;
	 public int legs;
	 
	 Animal(String name, int legs){
		 this.name = name;
		 this.legs = legs;
	 }
	 
	 public String getName(){
		 return name;
	 }
	 
	 public int getLegs(){
		 return legs;
	 }
	 
	 @Override
	 public int compareTo(Animal a){
		 return this.getLegs() -a.getLegs();
	 }
 }
	 