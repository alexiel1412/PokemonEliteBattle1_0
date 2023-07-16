package clases;

import java.util.ArrayList;

public class Especimen extends Pokemon
{ //Atributos de la clase Pokemon
    private String nameTrainer;
    private String mote;
    private String sex;
    private Ability ability;
    private int lv;
    private int exp;
    private int expNextLv;
    private String object;
    //private GregorianCalendar dateCapture;

    private int phCurrent;
    private int phTotal;
    private int at;
    private int def;
    private int spAt;
    private int spDef;
    private int vel;

    private ArrayList <MovementInUse> movements; //Lista de movimientos aprendidos por el pokemon

	//Constructor por defecto
    public Especimen()
    {
        //this.dateCapture = new GregorianCalendar ();
    	super();
        this.movements = new ArrayList<MovementInUse>();
        this.setAMovement(new MovementInUse());
        init("", "", "", new Ability (), 1, 0, 0, "", 1, 1, 0, 0, 0, 0, 0, movements);
    }

    public Especimen(Pokemon pokemon, String nameTrainer, String mote, String sex, Ability ability, int lv, int exp,
			int expNextLevel, String object, int phCurrent, int phTotal, int at, int def, int spAt,
			int spDef, int vel, ArrayList<MovementInUse> movements) {
		super(pokemon);
        init(nameTrainer, mote, sex, ability, lv, exp, expNextLevel, object,
        		phCurrent, phTotal, at, def, spAt, spDef, vel, movements);
	}

    public Especimen(String numPokedex, String name, String type1, String type2,
			Ability ability1, Ability ability2,	Ability abilityHidden, ArrayList<Movement> movementsPorNivel,
			
			String nameTrainer, String mote, String sex, Ability ability, int lv, int exp,
			int expNextLv, String object, int phCurrent, int phTotal, int at, int def, int spAt,
			int spDef, int vel, ArrayList<MovementInUse> movements)
    {
		super(numPokedex, name, type1, type2, ability1, ability2, abilityHidden, movementsPorNivel);
        init(nameTrainer, mote, sex, ability, lv, exp, expNextLv, object,
        		phCurrent, phTotal, at, def, spAt, spDef, vel, movements);
	}
   
    private void init(String nameTrainer, String mote, String sex, Ability ability, int lv, int experience,
			int expNextLv, String object, int phCurrent, int phTotal, int at, int def, int spAt,
			int spDef, int vel, ArrayList<MovementInUse> movements)
    {
        this.setNameTrainer(nameTrainer);
        this.setMote(mote);
        this.setSex(sex);
        this.setAbility(ability);
        this.setLv(lv);
        this.setExp(exp);
        this.setExpNextLevel(expNextLv);
        this.setObject(object);

        this.setPhCurrent(phCurrent);
        this.setPhTotal(phTotal);
        this.setAt(at);
        this.setDef(def);
        this.setSpAt(spAt);
        this.setSpDef(spDef);
        this.setVel(vel);
        
        this.setMovements(movements);
    }

    public String getNameTrainer() {
		return nameTrainer;
	}

	public void setNameTrainer(String nameTrainer) {
		this.nameTrainer = nameTrainer;
	}

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Ability getAbility() {
		return this.ability;
	}

	public void setAbility(Ability ability) {
		this.ability = ability;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getExpNextLevel() {
		return expNextLv;
	}

	public void setExpNextLevel(int expNextLv) {
		this.expNextLv = expNextLv;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
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

	public int getAt() {
		return at;
	}

	public void setAt(int at) {
		this.at = at;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getSpAt() {
		return spAt;
	}

	public void setSpAt(int spAt) {
		this.spAt = spAt;
	}

	public int getSpDef() {
		return spDef;
	}

	public void setSpDef(int spDef) {
		this.spDef = spDef;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public ArrayList<MovementInUse> getMovements() {
		return this.movements;
	}

	public void setMovements(ArrayList<MovementInUse> movements) {
		this.movements = movements;
	}

	public MovementInUse getAMovement(int i) {
		return movements.get(i);
	}
    
    public void setAMovement(MovementInUse movement)
    {
        this.getMovements().add(movement);
    }
    
    public boolean removeMovement(int i)
    {
        if (this.getMovements().size() > 1)
        {
            this.getMovements().remove(i);
            return true;
        }
        else
            return false;
    }

    public String toString()
    {
        String cad = "Especimen: " + this.getMote() + "(" + this.getName() + ")"
            + "\nEntrenador: " + this.getNameTrainer()
            + "\nSexo: " + this.getSex()
            + "\nHabilidad: " + this.getAbility()
            + "\nNivel: " + this.getLv()
            + "\nExp: " + this.getExp()
            + "\tExp sig. nivel: " + this.getExpNextLevel()
            + "\nObjeto: " + this.getObject()
            + this.mostrarParametros()
            + "\nMovimientos: ";
        for (int i = 0; i < this.getMovements().size(); i++)
        {
        	cad = cad + this.getAMovement(i) + "\n";
        }
        return cad;
    }

    public String mostrarParametros()
    {
        return "\n\tParámetros:"
            + "\nPH: " + this.getPhCurrent() + "/" + this.getPhTotal()
            + "\nAt: " + this.getAt()
            + "\tDef: " + this.getDef()
            + "\nSp At: " + this.getSpAt()
            + "\tSp Def: " + this.getSpDef()
            + "\nVel: " + this.getVel();
    }
}
