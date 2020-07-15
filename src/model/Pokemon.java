package model;

//PROGRESSION - 1 
//Go to JAVA Resouces - src/model and create a parent class called Pokemon inside the model package - with the following arguments
//String pokemonName
//Int pokemonNumber
//
//Generate appropriate getters and setters.
//Generate a two-argument constructor in the Pokemon class

public class Pokemon{
	private String pokemonName;
	private String pokemonNumber;
	public String getPokemonName() {
		return pokemonName;
	}
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	public String getPokemonNumber() {
		return pokemonNumber;
	}
	public void setPokemonNumber(String pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}
	public Pokemon(String pokemonName, String pokemonNumber) {
		this.pokemonName = pokemonName;
		this.pokemonNumber = pokemonNumber;
	}
	
}