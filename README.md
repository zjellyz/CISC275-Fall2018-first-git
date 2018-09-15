# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
	1)A list of Dog
	2)Dog named fido with 4 legs
	3)Dog named fido with 3 legs 
	4)Dog named Alfie with 4 legs
	5)A comparator of Animals

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
	yes, te constructor call is in this lane of code, also knowns as comparator class definition:
	
	Collections.sort(dogs, new Comparator<Animal>(){
			@Override
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}
		})
		
	this part of code create an anonymous class because we cannot make a instance of a interface.