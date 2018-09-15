// Gaojie Zhang
//CISC 275 LAB 3

public class Dog extends Animal{
	
	Dog(String name , int legs){
		super(name, legs);
	}
	
	@Override
	public String toString(){
		return this.getName() + " " + this.getLegs();
	}
}
