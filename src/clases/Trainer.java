package clases;

import java.util.ArrayList;

public class Trainer
{
	//Atributos de la clase Trainer
    private static int numTrainer = 0;
    private String id;
    private String name;
    private String region;
    private int money;
    private ArrayList<Pokemon> equipoPokemon;
    //private ArrayList<String> medals;

    //Constructor por defecto de entrenadores
    public Trainer()
    {
        this.equipoPokemon = new ArrayList<Pokemon>();
        this.equipoPokemon.add(new Pokemon());
        init();
    }
    
    private void init()
    {
        this.setId(this.prepareID(++numTrainer));
        this.setName("Entrenador " + numTrainer);
        this.setRegion("");
        this.setMoney(0);
    }
    
    public Trainer(String name)
    {
        this.equipoPokemon = new ArrayList<Pokemon>();
        init(name);
    }
    
    private void init(String name)
    {
        this.setId(this.prepareID(++numTrainer));
        this.setName(name);
        this.setRegion("Kanto");
        this.setMoney(0);
        this.setAPokemon(new Pokemon());
    }

    //Constructor para crear un nuevo entrenador pasándole sus datos iniciales
    public Trainer(String aName, String aRegion, Pokemon aInitialPokemon)
    {
        this.equipoPokemon = new ArrayList<Pokemon>();
        init(aName, aRegion, aInitialPokemon);
    }
    
    private void init(String aName, String aRegion, Pokemon aInitialPokemon)
    {
        this.setId(this.prepareID(++numTrainer));
        this.setName(aName);
        this.setRegion(aRegion);
        this.setMoney(3000);
        this.setAPokemon(aInitialPokemon);
    }
    
    //Constructor para instanciar a un entrenador del que poseemos todos sus datos
    public Trainer(String aName, String aRegion, int aMoney, ArrayList<Pokemon> aPokemonsList)
    {
        this.equipoPokemon = new ArrayList<Pokemon>();
        init(aName, aRegion, aMoney, aPokemonsList);
    }

    private void init(String aName, String aRegion, int aMoney, ArrayList<Pokemon> aPokemonsList)
    {
        this.setId(this.prepareID(++numTrainer));
        this.setName(aName);
        this.setRegion(aRegion);
        this.setMoney(aMoney);
        for (int i = 0; i < aPokemonsList.size(); i++)
            this.getEquipoPokemons().add(aPokemonsList.get(i));
    }

	public static int getNumTrainer() {
		return numTrainer;
	}

	public static void setNumTrainer(int aNumTrainer) {
		numTrainer = aNumTrainer;
	}

	public String getId(){
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

    //Funciones para modificar los datos de los pokemons que posee
    public ArrayList<Pokemon> getEquipoPokemons()
    {
        return this.equipoPokemon;
    }

	public void setEquipoPokemon(ArrayList<Pokemon> equipoPokemon) {
		this.equipoPokemon = equipoPokemon;
	}
    
    public Pokemon getAPokemon(int i)
    {
        return this.getEquipoPokemons().get(i);
    }
    
    public void setAPokemon(Pokemon pokemon)
    {
        this.getEquipoPokemons().add(pokemon);
    }
    
    public boolean removePokemon(int i)
    {
        if (this.getEquipoPokemons().size() > 1)
        {
            this.getEquipoPokemons().remove(i);
            return true;
        }
        else
            return false;
    }

    public String toString()
    {
        String cad = "Datos de entrenador:"
                + "\nID: " + this.getId() + "."
                + "\nNombre: " + this.getName() + "."
                + "\nRegion: " + this.getRegion() + "."  /////////////////////////////////////
                + "\nDinero: " + this.getMoney() + "."
                + "\nPokemons:";
        for (int i = 0; i < this.getEquipoPokemons().size(); i++)
        {
        	cad = cad + "\nPokemon " + (i+1) + ": " + this.getAPokemon(i).getName() + ".";
        }
        return cad;
    }
    
    //Funcion para añadir ceros al id hasta que se vea como 5 digitos
    public String prepareID(int aID)
    {
        String cad = String.valueOf(aID);
        while (cad.length() < 5)
        {
        	cad = 0 + cad;
        }
        return cad;
    }

    public String showStatePokemon(int i)
    {
        String cad = this.getAPokemon(i).getName()
                + "\nPV: " + this.getAPokemon(i).getPhCurrent()
                + " / " + this.getAPokemon(i).getPhTotal() + ".";
        return cad;
    }
}
