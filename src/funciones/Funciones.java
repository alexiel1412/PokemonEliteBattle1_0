package funciones;

import java.util.Scanner;

import clases.Pokemon;
import clases.Region;
import clases.Trainer;

public class Funciones
{

	public static void pausa()
	{
		Scanner sc = new Scanner (System.in);
        String separador = "\n  ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  ";
        System.out.println(separador);
        sc.nextLine();
	}
	
    public static Region createBasicsData(String cad)
    {
    	cad = cad.toLowerCase();
    	
    	if (cad.equals("kanto") || cad.equals("1"))
            return new Region("Kanto",
				   new Trainer("Gary"),
				   new Pokemon(1, "Bulbasaur", "Planta", "Veneno"),
				   new Pokemon(4, "Charmander", "Fuego", ""),
				   new Pokemon(7, "Squirtle", "Agua", ""));
    	
		else if (cad.equals("jhoto") || cad.equals("2"))
	        return new Region("Jhoto",
				   new Trainer("Silver"),
				   new Pokemon(152, "Chikorita", "Planta", ""),
				   new Pokemon(155, "Cyndaquil", "Fuego", ""),
				   new Pokemon(158, "Totodile", "Agua", ""));
    	
		else if (cad.equals("hoenn") || cad.equals("3"))
			return new Region("Hoenn",
				   new Trainer("Ruby"),
				   new Pokemon(252, "Treecko", "Planta", ""),
				   new Pokemon(255, "Torchic", "Fuego", ""),
				   new Pokemon(258, "Mudkip", "Agua", ""));
    	
		else if (cad.equals("shinno") || cad.equals("4"))
			return new Region("Shinno",
				   new Trainer("Paul"),
				   new Pokemon(387, "Tortuig", "Planta", ""),
				   new Pokemon(390, "Chimchar", "Fuego", ""),
				   new Pokemon(383, "Piplup", "Agua", ""));
    	
		else if (cad.equals("teselia") || cad.equals("5"))
			return new Region("Teselia",
				   new Trainer("N"),
				   new Pokemon(495, "Snivy", "Planta", ""),
				   new Pokemon(498, "Tepig", "Fuego", ""),
				   new Pokemon(501, "Oshawott", "Agua", ""));
    	
		else if (cad.equals("kalos") || cad.equals("6"))
			return new Region("Kalos",
				   new Trainer("Serena"),
				   new Pokemon(650, "Chespin", "Planta", ""),
				   new Pokemon(653, "Fennekin", "Fuego", ""),
				   new Pokemon(656, "Froakie", "Agua", ""));
    	
		else if (cad.equals("alola") || cad.equals("7"))
			return new Region("Alola",
				   new Trainer("Gladion"),
				   new Pokemon(722, "Rowlet", "Planta", "Volador"),
				   new Pokemon(725, "Litten", "Fuego", ""),
				   new Pokemon(728, "Popplio", "Agua", ""));
    	
		else if (cad.equals("galar") || cad.equals("8"))
			return new Region("Galar",
				   new Trainer("Lionel"),
				   new Pokemon(810, "Grookey", "Planta", ""),
				   new Pokemon(812, "Scorbunny", "Fuego", ""),
				   new Pokemon(815, "Sobble", "Agua", ""));

		// else if (cad.equals("paldea") || cad.equals("9"))
		return new Region("Paldea",
			   new Trainer("Mencia"),
			   new Pokemon(906, "Sprigatito", "Planta", ""),
			   new Pokemon(989, "Fuecoco", "Fuego", ""),
			   new Pokemon(992, "Quaxly", "Agua", ""));
    }

	public static String pedirNombre()
	{
		Scanner sc = new Scanner (System.in);
		String nameProt = "";
        System.out.println("¿Cómo te llamas?");
        nameProt = sc.nextLine();
        while (nameProt.equals(""))
        {
            System.out.println("Introduzca su nombre:");
            nameProt = sc.nextLine();
        }
		return nameProt;
	}

	//Solicita la región, por número o nombre, valida que sea correcta y la devuelve como String
	public static String pedirRegión()
	{
		Scanner sc = new Scanner (System.in);
		String region = "";
    	System.out.println("\n¿Podrías decirme a qué región perteneces?");
    	mostrarRegiones();
    	boolean validado = validarRegion(region = sc.nextLine());
    	
        while (validado == false)
        {
        	System.out.println("Debe introducir una región de la lista (por número o nombre.)");
        	mostrarRegiones();
        	validado = validarRegion(region = sc.nextLine());
        }
		return convertirRegion(region);
	}
    
	//Muestra la lista de regiones entre las que elegir
    public static void mostrarRegiones()
    {
    	System.out.println("1 - Kanto"
    	   + "\n2 - Jhoto"
    	   + "\n3 - Hoenn"
    	   + "\n4 - Shinno"
    	   + "\n5 - Teselia"
    	   + "\n6 - Kalos"
    	   + "\n7 - Alola"
    	   + "\n8 - Galar"
    	   + "\n9 - Paldea");
    }

    //Valida que la región introducida exista, de no ser así, devuelve false
	public static boolean validarRegion(String opcion)
	{
		if (opcion == "")
			return false;
		opcion = opcion.toLowerCase();
		if (opcion.equals("1") || opcion.equals("2") || opcion.equals("3") || opcion.equals("4") || opcion.equals("5")
		 || opcion.equals("6") || opcion.equals("7") || opcion.equals("8") || opcion.equals("9")
		 || opcion.equals("kanto") || opcion.equals("jhoto") || opcion.equals("hoenn") || opcion.equals("shinno") || opcion.equals("teselia")
		 || opcion.equals("kalos") || opcion.equals("alola") || opcion.equals("galar") || opcion.equals("paldea"))
			return true;
		return false;
	}

	//Si se introdujo la región como número, la pasa a texto
	public static String convertirRegion(String region)
	{
		if (region.equals("1"))
			region = "Kanto";
		if (region.equals("2"))
			region = "Jhoto";
		if (region.equals("3"))
			region = "Hoenn";
		if (region.equals("4"))
			region = "Shinno";
		if (region.equals("5"))
			region = "Teselia";
		if (region.equals("6"))
			region = "Kalos";
		if (region.equals("7"))
			region = "Alola";
		if (region.equals("8"))
			region = "Galar";
		if (region.equals("9"))
			region = "Paldea";
		return region;
	}

	//Solicita el inicial según la región a la que perteneces y lo devuelve como String
	public static Pokemon pedirInicial(Region region)
	{
		Scanner sc = new Scanner (System.in);
		String inicial = "";
        System.out.println("Ahora, elige que pokemon inicial quieres tener:");
    	Funciones.mostrarIniciales(region);
    	boolean validado = validarInicial(inicial = sc.nextLine(), region);
    	
        while (validado == false)
        {
        	System.out.println("Debe introducir un inicial de la lista (por número o nombre.)");
        	mostrarIniciales(region);
        	validado = validarInicial(inicial = sc.nextLine(), region);
        }
        return crearInicial(convertirInicial(inicial, region), region);
        
	}

	private static Pokemon crearInicial(String inicial, Region region)
	{
		if (inicial.equals(region.getInicial1().getName()))
			return region.getInicial1();
		else if (inicial.equals(region.getInicial2().getName()))
			return region.getInicial2();
		else
			return region.getInicial3();
	}

	public static void mostrarIniciales(Region region)
	{
    	System.out.println("1 - " + region.getInicial1().getName()
    	   + "\n2 - " + region.getInicial2().getName()
    	   + "\n3 - " + region.getInicial3().getName());
	}

	private static boolean validarInicial(String opcion, Region region)
	{
		if (opcion == "")
			return false;
		opcion = opcion.toLowerCase();
		if (opcion.equals("1") || opcion.equals("2") || opcion.equals("3")
		 || opcion.compareToIgnoreCase(region.getInicial1().getName()) == 0
		 || opcion.compareToIgnoreCase(region.getInicial2().getName()) == 0
		 || opcion.compareToIgnoreCase(region.getInicial3().getName()) == 0)
			return true;
		// compareToIgnoreCase == 0 comprueba que sean iguales sin comparar mayusculas
		return false;
	}

	public static String convertirInicial(String inicial, Region basicsData)
	{
		if (inicial.equals("1"))
			inicial = basicsData.getInicial1().getName();
		if (inicial.equals("2"))
			inicial = basicsData.getInicial2().getName();
		if (inicial.equals("3"))
			inicial = basicsData.getInicial3().getName();
		return inicial;
	}
    

}
