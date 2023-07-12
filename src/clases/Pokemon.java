package clases;

import java.util.ArrayList;

public class Pokemon
{
    //Atributos de la clase Pokemon
    private String numPokedex;
    private String name;
    private int level;
    private String sex;
    private String type1;
    private String type2;
    private String nameTrainer;
    private int experience;
    private int expNextLevel;
    private String object;
    //private GregorianCalendar dateCapture;
    private String hability;

	//Puntos de salud actual y total
    private int phCurrent;
    private int phTotal;
    private int attack;
    private int defense;
    private int spAttack;
    private int spDefense;
    private int velocity;

    private ArrayList <Movement> movements;



    //Constructor por defecto
    public Pokemon()
    {
        //this.dateCapture = new GregorianCalendar ();
        this.movements = new ArrayList<Movement>();
        movements.add(new Movement());
        init();
    }
    
    private void init()
    {
    	this.setNumPokedex(1);
        this.setName("");
        this.setLevel(5);
        this.setSex("");
        this.setType1("Normal");
        this.setType2("");
        this.setNameTrainer("");
        this.setExperience(125);
        this.setExpNextLevel(91);
        this.setObject("");
        this.setHability("");

        this.setPhCurrent(24);
        this.setPhTotal(24);
        this.setAttack(7);
        this.setDefense(8);
        this.setSpAttack(7);
        this.setSpDefense(8);
        this.setVelocity(7);
    }
    //Constructor por defecto
    public Pokemon(String name)
    {
        //this.dateCapture = new GregorianCalendar ();
        this.movements = new ArrayList<Movement>();
        movements.add(new Movement());
        init(name);
    }
    
    private void init(String name)
    {
    	this.setNumPokedex(1);
        this.setName(name);
        this.setLevel(5);
        this.setSex("");
        this.setType1("Normal");
        this.setType2("");
        this.setNameTrainer("");
        this.setExperience(125);
        this.setExpNextLevel(91);
        this.setObject("");
        this.setHability("");

        this.setPhCurrent(24);
        this.setPhTotal(24);
        this.setAttack(7);
        this.setDefense(8);
        this.setSpAttack(7);
        this.setSpDefense(8);
        this.setVelocity(7);
    }

    //Constructor de un pokemon básico, dando solo su nombre y sus tipos (para pruebas)
    public Pokemon(int numPokedex, String aName, String type1, String type2)
    {
       // this.dateCapture = new GregorianCalendar ();
        this.movements = new ArrayList<Movement>();
        movements.add(new Movement());
        init(numPokedex, aName, type1, type2);
    }
    
    private void init(int numPokedex, String aName, String type1, String type2)
    {
    	System.out.println("Hola");
    	this.setNumPokedex(numPokedex);
        this.setName(aName);
        this.setLevel(5);
        this.setSex("");
        this.setType1(type1);
        this.setType2(type2);
        this.setNameTrainer("Trainer");
        this.setExperience(125);
        this.setExpNextLevel(91);
        this.setObject("");
        this.setHability("");

        this.setPhCurrent(24);
        this.setPhTotal(24);
        this.setAttack(7);
        this.setDefense(8);
        this.setSpAttack(7);
        this.setSpDefense(8);
        this.setVelocity(7);
        this.setAMovement(new Movement());
    }

    //Constructor de un pokemon pasando todos sus datos)
    public Pokemon(int numPokedex, String aName, int level, String sex, String type1, String type2, String nameTrainer,
    		int experience, int expNextLevel, String object, String hability, int phCurrent, int phTotal,
    		int attack, int defense, int spAttack, int spDefense, int velocity, ArrayList<Movement> movements)
    {
       // this.dateCapture = new GregorianCalendar ();
        this.movements = new ArrayList<Movement>();
        movements.add(new Movement());
        init(numPokedex, aName, level, sex, type1, type2, nameTrainer, experience, expNextLevel, object, hability, phCurrent, phTotal,
        		attack, defense, spAttack, spDefense, velocity, movements);
    }
    
    private void init(int numPokedex, String aName, int level, String sex, String type1, String type2, String nameTrainer,
    		int experience, int expNextLevel, String object, String hability, int phCurrent, int phTotal,
    		int attack, int defense, int spAttack, int spDefense, int velocity, ArrayList<Movement> movements)
    {
    	this.setNumPokedex(numPokedex);
        this.setName(aName);
        this.setLevel(level);
        this.setSex(sex);
        this.setType1(type1);
        this.setType2(type2);
        this.setNameTrainer(nameTrainer);
        this.setExperience(experience);
        this.setExpNextLevel(expNextLevel);
        this.setObject(object);
        this.setHability(hability);

        this.setPhCurrent(phCurrent);
        this.setPhTotal(phTotal);
        this.setAttack(attack);
        this.setDefense(defense);
        this.setSpAttack(spAttack);
        this.setSpDefense(spDefense);
        this.setVelocity(velocity);
        this.setAllMovements(movements);
    }
	
	public String getNumPokedex() {
		return numPokedex;
	}

	public void setNumPokedex(int numPokedex) {
		this.numPokedex = this.prepareNumPokedex(numPokedex);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public String getNameTrainer() {
		return nameTrainer;
	}

	public void setNameTrainer(String nameTrainer) {
		this.nameTrainer = nameTrainer;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getExpNextLevel() {
		return expNextLevel;
	}

	public void setExpNextLevel(int expNextLevel) {
		this.expNextLevel = expNextLevel;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getHability() {
		return hability;
	}

	public void setHability(String hability) {
		this.hability = hability;
	}

	public int getPhCurrent() {
		return phCurrent;
	}

	public void setPhCurrent(int phCurrent) {
		this.phCurrent = phCurrent;
	}

	public int getPhTotal() {
		return phTotal;
	}

	public void setPhTotal(int phTotal) {
		this.phTotal = phTotal;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getSpAttack() {
		return spAttack;
	}

	public void setSpAttack(int spAttack) {
		this.spAttack = spAttack;
	}

	public int getSpDefense() {
		return spDefense;
	}

	public void setSpDefense(int spDefense) {
		this.spDefense = spDefense;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public ArrayList<Movement> getAllMovements() {
		return movements;
	}

	public Movement getAMovement(int i) {
		return movements.get(i);
	}

	public void setAllMovements(ArrayList<Movement> movements) {
		this.movements = movements;
	}
    
    public void setAMovement(Movement aMovement)
    {
        this.getAllMovements().add(aMovement);
    }
    
    public boolean removeMovement(int i)
    {
        if (this.getAllMovements().size() > 1)
        {
            this.getAllMovements().remove(i);
            return true;
        }
        else
            return false;
    }

    public String toString()
    {
        String cad = "Datos del Pokémon:"
            + "\nPokedex: " + this.getNumPokedex()
            + "\nNombre: " + this.getName()
            + "\nNivel: " + this.getLevel()
            + "\nSexo: " + this.getSex()
            + "\nTipo 1: " + this.getType1()
            + "\tTipo 2: " + this.getType2()
            + "\nEntrenador: " + this.getNameTrainer()
            + "\nObjeto: " + this.getObject()
            + "\n\nPH: " + this.getPhCurrent() + "/" + this.getPhTotal()
            + "\nAtaque: " + this.getAttack()
            + "\tAtaque especial: " + this.getSpAttack()
            + "\nDefensa: " + this.getDefense()
            + "\tDefensa especial: " + this.getSpDefense()
            + "\nVelocidad: " + this.getVelocity()
            + "\nMovimientos: ";
        for (int i = 0; i < this.getAllMovements().size(); i++)
        {
        	cad = cad + "\n- " + this.getAMovement(i).getName()
        			+" (" + this.getAMovement(i).getPpCurrent() + "/" + this.getAMovement(i).getPpTotal() + ")";
        }
        return cad;
    }
    
    //Funcion para añadir ceros al id hasta que se vea como 5 digitos
    public String prepareNumPokedex(int aNumPokedex)
    {
        String cad = String.valueOf(aNumPokedex);
        while (cad.length() < 3)
        {
        	cad = 0 + cad;
        }
        return cad;
    }
}
