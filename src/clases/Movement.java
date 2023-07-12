package clases;

public class Movement
{
    //Atributos de la clase Movement
    private String name;
    private String type;
    private String category;
    private int power; //Potencia
    private int precision;
    private int ppCurrent; //PpActual
	private int ppTotal;
    private int increasePpTotal;

    //Constructor por defecto (Añade el ataque placaje)
    public Movement()
    {
        init();
    }
    
    private void init()
    {
        setName("Placaje");
        setType("Normal");
        setCategory("Físico");
        setPower(35);
        setPrecision(95);
        setPpCurrent(35);
        setPpTotal(35);
        setIncreasePpTotal(0);
    }
    
    public Movement(String aName, String aType, String aCategory, int aPower, int aPrecision,
    		int aPpCurrent, int aPpTotal, int aIncreasePpTotal)
    {
        init(aName, aType, aCategory, aPower, aPrecision, aPpCurrent, aPpTotal, aIncreasePpTotal);
    }
    
    private void init(String aName, String aType, String aCategory, int aPower, int aPrecision,
    		int aPpCurrent, int aPpTotal, int aIncreasePpTotal)
    {
        setName(aName);
        setType(aType);
        setCategory(aCategory);
        setPower(aPower);
        setPrecision(aPrecision);
        setPpCurrent(aPpCurrent);
        setPpTotal(aPpTotal);
        setIncreasePpTotal(aIncreasePpTotal);
    }
    
    public String getName() {
		return name;
	}

    public void setName(String name) {
		this.name = name;
	}
    
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getPrecision() {
		return precision;
	}
	
	public void setPrecision(int precision) {
		this.precision = precision;
	}
	
	public int getPpCurrent() {
		return ppCurrent;
	}
	
	public void setPpCurrent(int ppCurrent) {
		this.ppCurrent = ppCurrent;
	}
	
	public int getPpTotal() {
		return ppTotal;
	}
	
	public void setPpTotal(int ppTotal) {
		this.ppTotal = ppTotal;
	}
	
	public int getIncreasePpTotal() {
		return increasePpTotal;
	}
	
	public void setIncreasePpTotal(int increasePpTotal) {
		this.increasePpTotal = increasePpTotal;
	}


    //Funciones para modificar los Pp
    public boolean lowerPp()
    {
        if (this.ppCurrent > 0)
        {
            this.ppCurrent--;
            return true;
        }
        else
            return false;
    }

    public boolean restaurePp(int i)
    {
        if (this.ppCurrent < this.ppTotal)
        {
            this.ppCurrent += i;
            return true;
        }
        else
            return false;
    }

    public boolean upPpTotal(int i)
    {
        if (this.increasePpTotal < 3)
        {
            this.increasePpTotal++;
            this.ppTotal += i;
            return true;
        }
        else
            return false;
    }

    public String toString(Movement aMovement)
    {
        String cad = "- " + aMovement.getName()
                + "\nPotencia: " + aMovement.getPower()
                + " (PP: " + aMovement.getPpCurrent()
                + " / " + aMovement.getPpTotal() + ")";
        return cad;
    }
}
