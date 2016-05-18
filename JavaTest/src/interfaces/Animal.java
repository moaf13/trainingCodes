package interfaces;

public class Animal {
	
	public Animal(){
		this.legs = 0;
		this.Name = "";
		this.Continent = "";
	}
	
	
	public Animal(int leg, String Names, String Continents){
		this.legs = leg;
		this.Name = Names;
		this.Continent = Continents;
	}
	
	
	private int legs;
	private String Name;
	private String Continent;
	
	int getLegs(){
		return this.legs;
	}
	
	String getName(){
		return this.Name;
	}
	
	String getContinent(){
		return this.Continent;
	}
	
	
	void setLegs(int leg){
		this.legs = leg;
	}
	
	void setName(String Names){
		this.Name =Names;
	}
	
	void setContinent(String Continents){
		this.Continent = Continents ;
	}
	
	
	
	
}
