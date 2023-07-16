package clases;

import java.util.Objects;

public class Movement
{
    //Atributos de la clase Movement
    private String name;
    private String type;
    private String category;
    private int power; //Potencia
    private int precision;
	private int ppTotal;

    //Constructor por defecto (Añade el ataque placaje)
    public Movement()
    {
        this.init("Placaje", "Normal", "Físico", 35, 95, 35);
    }
    
    public Movement(String name, String type, String category, int power, int precision, int ppTotal)
    {
        this.init(name, type, category, power, precision, ppTotal);
    }

    //Constructor por defecto (Añade el ataque placaje)
    public Movement(Movement movement)
    {
        this.init(movement.getName(), movement.getType(), movement.getCategory(),
        		movement.getPower(), movement.getPrecision(), movement.getPpTotal());
    }
    
    private void init(String name, String type, String category, int power, int precision, int ppTotal)
    {
        this.setName(name);
        this.setType(type);
        this.setCategory(category);
        this.setPower(power);
        this.setPrecision(precision);
        this.setPpTotal(ppTotal);
    }
    
    public String getName() {
		return this.name;
	}

    public void setName(String name) {
		this.name = name;
	}
    
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getPrecision() {
		return this.precision;
	}
	
	public void setPrecision(int precision) {
		this.precision = precision;
	}
	
	public int getPpTotal() {
		return this.ppTotal;
	}
	
	public void setPpTotal(int ppTotal) {
		this.ppTotal = ppTotal;
	}

    public String toString()
    {
    	String patron = "- %s\n\t%-9s | %-8s | %3d | %3d %% | %2d";
        String cad = String.format(patron, this.getName(), this.getType(), this.getCategory(),
        		this.getPower(), this.getPrecision(), this.getPpTotal());
        return cad;
    }

	@Override
	public int hashCode() {
		return Objects.hash(this.getName());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movement other = (Movement) obj;
		return Objects.equals(this.getName(), other.getName());
	}
}
