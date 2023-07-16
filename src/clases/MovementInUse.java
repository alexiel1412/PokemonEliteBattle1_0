package clases;

public class MovementInUse extends Movement
{
    private int ppCurrent; //PpActual
    private int increasePpTotal;

    //Constructor por defecto (Añade el ataque placaje)
    public MovementInUse()
    {
    	super();
        this.init(35, 0);
    }
    
    public MovementInUse(String name, String type, String category, int power, int precision,
    		int ppTotal, int ppCurrent, int increasePpTotal)
    {
    	super(name, type, category, power, precision, ppTotal);
        this.init(ppCurrent, increasePpTotal);
    }

    //Constructor por defecto (Añade el ataque placaje)
    public MovementInUse(Movement movement, int ppCurrent, int increasePpTotal)
    {
    	super(movement);
        this.init(ppCurrent, increasePpTotal);
    }
    
    private void init(int ppCurrent, int increasePpTotal)
    {
        this.setPpCurrent(ppCurrent);
        this.setIncreasePpTotal(increasePpTotal);
    }

    public int getPpCurrent() {
		return ppCurrent;
	}

	public void setPpCurrent(int ppCurrent) {
		this.ppCurrent = ppCurrent;
	}

	public int getIncreasePpTotal() {
		return increasePpTotal;
	}

	public void setIncreasePpTotal(int increasePpTotal) {
		this.increasePpTotal = increasePpTotal;
	}
	
	@Override
	public String toString()
	{
        return this.getName() + " (" + this.getPpTotal() + "/" + this.getPpCurrent() + ")";
	}

	//Funciones para modificar los Pp
    public int reduceCurrentPp(int i)
    {
    	int decr = 0;
    	if (this.getPpCurrent() > 0)
    	{
    		decr = i;
    		if (this.getPpCurrent() - i < 0)
    			decr = this.getPpCurrent();
    		this.setPpCurrent(this.getPpCurrent() - decr);
    	}
    	return decr;
    }

    public int restaureCurrentPp(int i)
    {
    	int incr = 0;
    	if (this.getPpCurrent() < this.getPpTotal())
    	{
    		incr = i;
    		if (this.getPpCurrent() + i > this.getPpTotal())
    			incr = i - (this.getPpCurrent() - this.getPpTotal());
    		this.setPpCurrent(this.getPpCurrent() + incr);
    	}
    	return incr;
    }

    public int upIncreasePpTotal(int i) //aumente increasePPTotal si es menor a 3 y devuelve true, si es 3, devuelve false
    {
    	int incr = 0;
        if (this.getIncreasePpTotal() < 3)
        {
        	incr = i;
            if (this.getIncreasePpTotal() + i > 3)
            	incr = 3 - i;
            this.setIncreasePpTotal(incr);
        }
        return incr;
    }

	public int getPpTotalReal()
	{
		return this.getPpTotal() + (this.getPpTotal() / 5 * this.getIncreasePpTotal());
	}
}
