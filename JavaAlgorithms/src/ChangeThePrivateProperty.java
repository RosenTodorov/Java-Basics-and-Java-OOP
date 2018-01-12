import java.security.InvalidParameterException;
import java.util.Arrays;

public class ChangeThePrivateProperty {
	// we have super class Superhero is not ChangeThePrivateProperty
	private String name;
	private String[] powers;
	
	public ChangeThePrivateProperty(String name, String... powers) {
		setName(name);
		setPowers(powers);
	}
	
	public ChangeThePrivateProperty(String name) {
		this(name, null);
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String newName) {
		if (newName == null) {
			throw new InvalidParameterException("Name cannot be null");
		}
		
		name = newName;
	}
	
	public String[] getPowers() {
		String[] copyPowers = new String[powers.length];
	/*	for (int i = 0; i < powers.length; i++) {
			copyPowers[i] = powers[i];
		} OR */
		System.arraycopy(powers, 0, copyPowers, 0, powers.length);
		return copyPowers;
	}
	
	private void setPowers(String[] newPowers) {
		powers = newPowers;
	//	powers = new String[newPowers.length];
	//	System.arraycopy(newPowers, 0, powers, 0, newPowers.length);
	}
	
	public void fightsWith(ChangeThePrivateProperty opponent) { // Superhero opponent
		System.out.printf("%s fights with %s%n", getName(), opponent.getName());
	}
	
	public void usePowers() {
		StringBuilder powersBuilder = new StringBuilder();
		powersBuilder.append(powers[0]);
		
		Arrays.stream(powers)
		.skip(1)
		.forEach(power -> powersBuilder.append(", " + power));
		
		System.out.printf("%s has powers: %s", name, powersBuilder.toString());
		System.out.println();	
	}
	
	public static void main(final String[] args) {
		String[] batmanPowers = {"Rich", "Intelligence"};
		ChangeThePrivateProperty batman1 = new ChangeThePrivateProperty("Batman", batmanPowers);
		ChangeThePrivateProperty batman2 = new ChangeThePrivateProperty("Batman", "Rich", "Intelligence");
	//	
	    String[] powers = batman1.getPowers();
	//	powers[1] = "Cries"; // Exception in thread "main" java.lang.NullPointerException at ChangeThePrivateProperty.main(ChangeThePrivateProperty.java:45)
	    batman1.usePowers();
	    batmanPowers[1] = "Cries";
		batman1.usePowers();
	}
	
	

}
