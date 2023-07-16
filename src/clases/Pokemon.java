package clases;

import java.util.ArrayList;
import java.util.Objects;

public class Pokemon
{
    //Atributos de la clase Pokemon
    private String numPokedex;
    private String name;
    private String type1;
    private String type2;
    private Ability ability1;
    private Ability ability2;
    private Ability abilityHidden;
    
    private ArrayList <Movement> movementsPorNivel;

    //Constructor por defecto
    public Pokemon()
    {
        //this.dateCapture = new GregorianCalendar ();
        this.movementsPorNivel = new ArrayList<Movement>();
        init("", "", "", "", new Ability(), new Ability(), new Ability(), this.getAllMovementsPorNivel());
    }
    
    public Pokemon(String name)
    {
        //this.dateCapture = new GregorianCalendar ();
    	Pokemon pokemon = this.construirIniciales(name);
        this.movementsPorNivel = new ArrayList<Movement>();
        init(pokemon);
    }

	public Pokemon(String numPokedex, String name, String type1, String type2,
			Ability ability1, Ability ability2, Ability abilityHidden)
	{
        this.movementsPorNivel = new ArrayList<Movement>();
        init(numPokedex, name, type1, type2, ability1, ability2, abilityHidden, this.movementsPorNivel);
	}
    
	public Pokemon(String numPokedex, String name, String type1, String type2,
			Ability ability1, Ability ability2, Ability abilityHidden, ArrayList<Movement> movementsPorNivel)
	{
        this.movementsPorNivel = new ArrayList<Movement>();
        this.init(numPokedex, name, type1, type2, ability1, ability2, abilityHidden, movementsPorNivel);
	}
    
	public Pokemon(Pokemon pokemon)
	{
        this.movementsPorNivel = new ArrayList<Movement>();
        this.init(pokemon);
	}
    
    private void init(String numPokedex, String name, String type1, String type2,
    		Ability ability1, Ability ability2, Ability abilityHidden, ArrayList<Movement> movementsPorNivel)
    {
    	this.setNumPokedex(numPokedex);
        this.setName(name);
        this.setType1(type1);
        this.setType2(type2);
        this.setAbility1(ability1);
        this.setAbility2(ability2);
        this.setAbilityHidden(abilityHidden);
        
        this.setAllMovementsPorNivel(movementsPorNivel);
    }
    
    private void init(Pokemon pokemon)
    {
    	this.setNumPokedex(pokemon.getNumPokedex());
        this.setName(pokemon.getName());
        this.setType1(pokemon.getType1());
        this.setType2(pokemon.getType2());
        this.setAbility1(pokemon.getAbility1());
        this.setAbility2(pokemon.getAbility2());
        this.setAbilityHidden(pokemon.getAbilityHidden());
        
        this.setAllMovementsPorNivel(pokemon.getAllMovementsPorNivel());
    }

	public String getNumPokedex() {
		return this.numPokedex;
	}

	public void setNumPokedex(String numPokedex) {
		this.numPokedex = numPokedex;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType1() {
		return this.type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return this.type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public Ability getAbility1() {
		return this.ability1;
	}

	public void setAbility1(Ability ability1) {
		this.ability1 = ability1;
	}

	public Ability getAbility2() {
		return this.ability2;
	}

	public void setAbility2(Ability ability2) {
		this.ability2 = ability2;
	}

	public Ability getAbilityHidden() {
		return this.abilityHidden;
	}

	public void setAbilityHidden(Ability abilityHidden) {
		this.abilityHidden = abilityHidden;
	}

	public ArrayList<Movement> getAllMovementsPorNivel() {
		return this.movementsPorNivel;
	}

	public void setAllMovementsPorNivel(ArrayList<Movement> movementsPorNivel) {
		this.movementsPorNivel = movementsPorNivel;
	}

	public Movement getAMovementPorNivel(int i) {
		return this.movementsPorNivel.get(i);
	}
    
    public void setAMovementPorNivel(Movement movement)
    {
        this.getAllMovementsPorNivel().add(movement);
    }
    
    public boolean removeAMovementPorNivel(int i)
    {
        if (this.getAllMovementsPorNivel().size() > 1)
        {
            this.getAllMovementsPorNivel().remove(i);
            return true;
        }
        else
            return false;
    }

	@Override
	public String toString()
	{
		return "Pokedex: " + this.getNumPokedex()
	            + "\nNombre: " + this.getName()
	            + "\nTipo 1: " + this.getType1()
	            + " | Tipo 2: " + this.getType2()
	            + "\nHab 1: " + this.getAbility1()
	            + " | Hab 2: " + this.getAbility2()
	            + " | Hab oculta: " + this.getAbilityHidden();
	}

    public String mostrarMovimientosPorNivel() //ToString para los movimientos por nivel
    {
        String cad = "";

        cad = "\nMovimientos por nivel: ";
	    for (int i = 0; i < this.getAllMovementsPorNivel().size(); i++)
	    {
	    	cad = cad + this.getAMovementPorNivel(i) + "\n";
	    }
	    return cad;
    }
    
    @Override
	public int hashCode()
    {
		return Objects.hash(this.getNumPokedex());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return Objects.equals(this.getNumPokedex(), other.getNumPokedex());
	}

	//Funcion para añadir ceros al id hasta que se vea como 5 digitos
    public String prepareNumPokedex()
    {
        String cad = String.valueOf(this.getNumPokedex());
        while (cad.length() < 4)
        {
        	cad = 0 + cad;
        }
        return cad;
    }
    
	private Pokemon construirIniciales(String name)
	{
		name = name.toLowerCase();
		String numPokedex = "";
		String type1 = "";
		String type2 = "";
		String ability1 = "";
		String abilityHidden = "";
		if (name == "bulbasaur" || name == "chikorita" || name == "treecko" || name == "turtwig" || name == "snivy" ||
				name == "chespin" || name == "rowlet" || name == "grookey" || name == "sprigatito")
		{
			type1 = "Planta";
			ability1 = "Espesura";
		}
		else if (name == "charmander" || name == "cyndaquil" || name == "torchic" || name == "chimchar" || name == "tepig" ||
				name == "fennekin" || name == "litten" || name == "scorbunny" || name == "fuecoco")
		{
			type1 = "Fuego";
			ability1 = "Mar llamas";
		}
		else
		{
			type1 = "Agua";
			ability1 = "Torrente";
		}
	    switch (name)
	    {
	    	//Kanto
	    	case "bulbasaur":
	    		numPokedex = "1";
	    		type2 = "Veneno";
	    		abilityHidden = "Clorofila";
	    		break;
	    	case "charmander":
	    		numPokedex = "4";
	    		abilityHidden = "Poder solar";
	    		break;
	    	case "squirtle":
	    		numPokedex = "7";
	    		abilityHidden = "Cura lluvia";
	    		break;
	    	//Johto
	    	case "chikorita":
	    		numPokedex = "152";
	    		abilityHidden = "Defensa hoja";
	    		break;
	    	case "cyndaquil":
	    		numPokedex = "155";
	    		abilityHidden = "Absorve fuego";
	    		break;
	    	case "totodile":
	    		numPokedex = "158";
	    		abilityHidden = "Potencia bruta";
	    		break;
	    	//Hoenn
	    	case "treecko":
	    		numPokedex = "252";
	    		abilityHidden = "Liviano";
	    		break;
	    	case "torchic":
	    		numPokedex = "255";
	    		abilityHidden = "Impulso";
	    		break;
	    	case "mudkip":
	    		numPokedex = "258";
	    		abilityHidden = "Humedad";
	    		break;
	    	//Sinnoh
	    	case "turtwig":
	    		numPokedex = "387";
	    		abilityHidden = "Caparazón";
	    		break;
	    	case "chimchar":
	    		numPokedex = "390";
	    		abilityHidden = "Puño férreo";
	    		break;
	    	case "piplup":
	    		numPokedex = "393";
	    		abilityHidden = "Competitivo";
	    		break;
	    	//Teselia
	    	case "snivy":
	    		numPokedex = "495";
	    		abilityHidden = "Respondón";
	    		break;
	    	case "tepig":
	    		numPokedex = "498";
	    		abilityHidden = "Sebo";
	    		break;
	    	case "oshawott":
	    		numPokedex = "501";
	    		abilityHidden = "Caparazón";
	    		break;
    		//Kalos
	    	case "chespin":
	    		numPokedex = "650";
	    		abilityHidden = "Antibalas";
	    		break;
	    	case "fennekin":
	    		numPokedex = "653";
	    		abilityHidden = "Prestidigitador";
	    		break;
	    	case "froakie":
	    		numPokedex = "656";
	    		abilityHidden = "Mutatipo";
	    		break;
	    	//Alola
	    	case "rowlet":
	    		numPokedex = "722";
	    		type2 = "Volador";
	    		abilityHidden = "Remoto";
	    		break;
	    	case "litten":
	    		numPokedex = "725";
	    		abilityHidden = "Intimidación";
	    		break;
	    	case "popplio":
	    		numPokedex = "728";
	    		abilityHidden = "Voz fluida";
	    		break;
	    	//Galar
	    	case "grookey":
	    		numPokedex = "810";
	    		abilityHidden = "Herbogénesis";
	    		break;
	    	case "scorbunny":
	    		numPokedex = "813";
	    		abilityHidden = "Líbero";
	    		break;
	    	case "sobble":
	    		numPokedex = "816";
	    		abilityHidden = "Francotirador";
	    		break;
	    	//Paldea
	    	case "Sprigatito":
	    		numPokedex = "906";
	    		abilityHidden = "Mutatipo";
	    		break;
	    	case "Fuecoco":
	    		numPokedex = "909";
	    		abilityHidden = "Ignorante";
	    		break;
	    	default:
	    		numPokedex = "912";
	    		abilityHidden = "Autoestima";
	    		break;
	    }
    	return (new Pokemon(numPokedex, name.substring(0, 1).toUpperCase() + name.substring(1, name.length()), type1, type2,
				new Ability (ability1, ""), new Ability ("", ""), new Ability (abilityHidden, "")));
	}
}
