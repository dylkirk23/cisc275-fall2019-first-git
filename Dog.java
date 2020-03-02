public class Dog extends Animal{
	public Dog(String name, int numLegs){
		super(name, numLegs);
	}

	public int getLegs(){ return numLegs; }

	public String toString(){
		return name + " " + numLegs;
	}
}