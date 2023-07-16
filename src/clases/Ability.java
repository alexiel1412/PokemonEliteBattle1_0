package clases;

import java.util.Objects;

public class Ability
{
    //Atributos de la clase Movement
    private String name;
    private String effect;
    
    public Ability()
    {
    	this.init("", "");
    }
    
    public Ability(String name, String effect)
    {
    	this.init(name, effect);
    }
    
    public Ability(Ability ability)
    {
    	this.init(ability.getName(), ability.getEffect());
    }

	private void init(String name, String effect)
	{
		this.setName(name);
		this.setEffect(effect);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	@Override
	public String toString()
	{
		return "Habilidad: " + this.getName();
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		Ability other = (Ability) obj;
		return Objects.equals(name, other.name);
	}
}
