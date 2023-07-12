package clases;

import clases.Pokemon;

public class Region
{
	//Variables miembro o de instancia
	private String nombre;
	private Trainer rival;
	private Pokemon inicial1;
	private Pokemon inicial2;
	private Pokemon inicial3;
	
	//Constructor por defecto
	public Region() //Mismo nombre que la clase
	{
		this.nombre = "Kanto";
		this.rival = new Trainer ();
		this.inicial1 = new Pokemon(1, "Bulbasaur", "Planta", "Veneno");
		this.inicial2 = new Pokemon(4, "Charmander", "Fuego", "");
		this.inicial3 = new Pokemon(7, "Squirtle", "Agua", "");
	}

	public Region(String nombre, Trainer rival, Pokemon inicial1, Pokemon inicial2, Pokemon inicial3)
	{
		//super();
		this.nombre = nombre;
		this.rival = rival;
		this.inicial1 = inicial1;
		this.inicial2 = inicial2;
		this.inicial3 = inicial3;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Trainer getRival() {
		return rival;
	}

	public void setRival(Trainer rival) {
		this.rival = rival;
	}

	public Pokemon getInicial1() {
		return inicial1;
	}

	public void setInicial1(Pokemon inicial1) {
		this.inicial1 = inicial1;
	}

	public Pokemon getInicial2() {
		return inicial2;
	}

	public void setInicial2(Pokemon inicial2) {
		this.inicial2 = inicial2;
	}

	public Pokemon getInicial3() {
		return inicial3;
	}

	public void setInicial3(Pokemon inicial3) {
		this.inicial3 = inicial3;
	}

    public String toString()
    {
        String cad = "Datos de la región:"
                + "\nNombre: " + this.getNombre() + "."
                + "\nRival: " + this.getRival().getName() + "."
                + "\n---------------------------------------------------\nInicial 1:\n" + this.getInicial1() + "."
                + "\n---------------------------------------------------\nInicial 2:\n" + this.getInicial2() + "."
                + "\n---------------------------------------------------\nInicial 3:\n" + this.getInicial3() + ".";
        return cad;
    }
}
