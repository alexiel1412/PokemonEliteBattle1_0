package clases;

import java.util.ArrayList;

import clases.Pokemon;
import funciones.Funciones;

public class Region
{
	//Variables miembro o de instancia
	private String name;
	private Trainer rival;
	private Pokemon inicial1;
	private Pokemon inicial2;
	private Pokemon inicial3;
	
	//Constructor por defecto
	public Region()
	{
		this.init("", new Trainer(), new Pokemon(), new Pokemon(), new Pokemon());
	}

	public Region(String name)/////////////////////////////////
	{
        //this.dateCapture = new GregorianCalendar ();
    	Region region = this.construirRegion(name);
        init(region);
	}

	public Region(Region region)
	{
		init(region);
	}

	public Region(String name, Trainer rival, Pokemon inicial1, Pokemon inicial2, Pokemon inicial3)
	{
		this.init(name, rival, inicial1, inicial2, inicial3);
	}

	private void init(String name, Trainer rival, Pokemon inicial1, Pokemon inicial2, Pokemon inicial3)
	{
		this.setName(name);
		this.setRival(rival);
		this.setInicial1(inicial1);
		this.setInicial2(inicial2);
		this.setInicial3(inicial3);
	}

	private void init(Region region)
	{
		this.setName(region.getName());
		this.setRival(region.getRival());
		this.setInicial1(region.getInicial1());
		this.setInicial2(region.getInicial2());
		this.setInicial3(region.getInicial3());
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Trainer getRival() {
		return this.rival;
	}

	public void setRival(Trainer rival) {
		this.rival = rival;
	}

	public Pokemon getInicial1() {
		return this.inicial1;
	}

	public void setInicial1(Pokemon inicial1) {
		this.inicial1 = inicial1;
	}

	public Pokemon getInicial2() {
		return this.inicial2;
	}

	public void setInicial2(Pokemon inicial2) {
		this.inicial2 = inicial2;
	}

	public Pokemon getInicial3() {
		return this.inicial3;
	}

	public void setInicial3(Pokemon inicial3) {
		this.inicial3 = inicial3;
	}

    public String toString()
    {
        String cad = "Datos de la región:"
                + "\nNombre: " + this.getName() + "."
                + "\nRival: " + this.getRival().getName() + "."
                + "\n---------------------------------------------------\nInicial 1:\n" + this.getInicial1() + "."
                + "\n---------------------------------------------------\nInicial 2:\n" + this.getInicial2() + "."
                + "\n---------------------------------------------------\nInicial 3:\n" + this.getInicial3() + ".";
        return cad;
    }

	private Region construirRegion(String name)
	{
		name = name.toLowerCase();
		String nameRival = "";
		String nameInicial1 = "";
		String nameInicial2 = "";
		String nameInicial3 = "";

		name = (Funciones.convertirRegion(name)).toLowerCase();
		
	    switch (name)
	    {
	    	//Kanto
	    	case "kanto":
	    		nameRival = "Gary";
	    		nameInicial1 = "Bulbasaur"; nameInicial2 = "Charmander"; nameInicial3 = "Bulbasaur";
	    		break;
	    	//Johto
	    	case "johto":
	    		nameRival = "Silver";
	    		nameInicial1 = "Chikorita"; nameInicial2 = "Cyndaquil"; nameInicial3 = "Totodile";
	    		break;
	    	//Hoenn
	    	case "hoenn":
	    		nameRival = "Ruby";
	    		nameInicial1 = "Treecko"; nameInicial2 = "Torchic"; nameInicial3 = "Mudkip";
	    		break;
	    	//Sinnoh
	    	case "sinnoh":
	    		nameRival = "Paul";
	    		nameInicial1 = "Tortuig"; nameInicial2 = "Chimchar"; nameInicial3 = "Piplup";
	    		break;
	    	//Teselia
	    	case "teselia":
	    		nameRival = "N";
	    		nameInicial1 = "Snivy"; nameInicial2 = "Tepig"; nameInicial3 = "Oshawott";
	    		break;
    		//Kalos
	    	case "kalos":
	    		nameRival = "Serena";
	    		nameInicial1 = "Chespin"; nameInicial2 = "Fennekin"; nameInicial3 = "Froakie";
	    		break;
	    	//Alola
	    	case "alola":
	    		nameRival = "Gladion";
	    		nameInicial1 = "Rowlet"; nameInicial2 = "Litten"; nameInicial3 = "Popplio";
	    		break;
	    	//Galar
	    	case "galar":
	    		nameRival = "Lionel";
	    		nameInicial1 = "Grookey"; nameInicial2 = "Scorbunny"; nameInicial3 = "Sobble";
	    		break;
	    	//Paldea
	    	default:
	    		nameRival = "Mencia";
	    		nameInicial1 = "Sprigatito"; nameInicial2 = "Fuecoco"; nameInicial3 = "Quaxly";
	    		break;
	    }
	    Pokemon inicial1 = new Pokemon (nameInicial1);
	    Pokemon inicial2 = new Pokemon (nameInicial2);
	    Pokemon inicial3 = new Pokemon (nameInicial3);
		return new Region(name.substring(0, 1).toUpperCase() + name.substring(1, name.length()), new Trainer (nameRival),
				inicial1, inicial2, inicial3);
	}
}
