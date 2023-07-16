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
    private ArrayList<Especimen> equipoPokemon;
    //private ArrayList<String> medals;

    //Constructor por defecto de entrenadores
    public Trainer()
    {
        this.equipoPokemon = new ArrayList<Especimen>();
        init("", "", 0, this.equipoPokemon);
    }
    
    public Trainer(String name)
    {
        this.equipoPokemon = new ArrayList<Especimen>();
        Trainer trainer = this.construirTrainer(name);
        init(trainer);
    }
    
    public Trainer(Trainer trainer)
    {
        init(trainer);
    }

	//Constructor para crear un nuevo entrenador pasándole sus datos iniciales
    public Trainer(String name, String region, int money, Especimen aInitialPokemon)
    {
        this.equipoPokemon = new ArrayList<Especimen>();
        this.setAPokemon(aInitialPokemon);
        init(name, region, money, this.getEquipoPokemon());
    }
    
    //Constructor para instanciar a un entrenador del que poseemos todos sus datos
    public Trainer(String name, String region, int money, ArrayList<Especimen> equipoPokemon)
    {
        this.equipoPokemon = new ArrayList<Especimen>();
        init(name, region, money, equipoPokemon);
    }

    private void init(String name, String region, int money, ArrayList<Especimen> equipoPokemon)
    {
        this.equipoPokemon = new ArrayList<Especimen>();
        this.setId(this.prepareID(++numTrainer));
        this.setName(name);
        this.setRegion(region);
        this.setMoney(money);
        this.setEquipoPokemon(equipoPokemon);
    }

    private void init(Trainer trainer)
    {
        this.equipoPokemon = new ArrayList<Especimen>();
        this.setId(this.prepareID(++numTrainer));
        this.setName(trainer.getName());
        this.setRegion(trainer.getRegion());
        this.setMoney(trainer.getMoney());
        this.setEquipoPokemon(trainer.getEquipoPokemon());
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
    public ArrayList<Especimen> getEquipoPokemon()
    {
        return this.equipoPokemon;
    }

	public void setEquipoPokemon(ArrayList<Especimen> equipoPokemon) {
		this.equipoPokemon = equipoPokemon;
	}
    
    public Especimen getAPokemon(int i)
    {
        return this.getEquipoPokemon().get(i);
    }
    
    public void setAPokemon(Especimen especimen)
    {
        this.getEquipoPokemon().add(especimen);
    }
    
    public boolean removePokemon(int i)
    {
        if (this.getEquipoPokemon().size() > 1)
        {
            this.getEquipoPokemon().remove(i);
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
        for (int i = 0; i < this.getEquipoPokemon().size(); i++)
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

    private Trainer construirTrainer(String name)
    {
		name = name.toLowerCase();
		String region = "";
		
	    switch (name)
	    {
	    	//Kanto
	    	case "gary":
	    		region = "Kanto";
	    		break;
	    	//Johto
	    	case "silver":
	    		region = "johto";
	    		break;
	    	//Hoenn
	    	case "ruby":
	    		region = "hoenn";
	    		break;
	    	//Sinnoh
	    	case "paul":
	    		region = "sinnoh";
	    		break;
	    	//Teselia
	    	case "n":
	    		region = "teselia";
	    		return new Trainer(name.substring(0, 1).toUpperCase(), region, 3000,
	    				this.getEquipoPokemon());
    		//Kalos
	    	case "serena":
	    		region = "kalos";
	    		break;
	    	//Alola
	    	case "gladion":
	    		region = "alola";
	    		break;
	    	//Galar
	    	case "lionel":
	    		region = "galar";
	    		break;
	    	//Paldea
	    	default:
	    		region = "Mencia";
	    		break;
	    }
	
		return new Trainer(name.substring(0, 1).toUpperCase() + name.substring(1, name.length()), region, 3000,
				this.getEquipoPokemon());
	}
}
