public class Animal extends MyCompare3{
	String name;
	int numLegs;

	public Animal(String name, int numLegs){
		this.name = name;
		this.numLegs = numLegs;
	}

	public int getLegs(){ return numLegs; }
}
