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
	
    public static Region createBasicsData(String elecRegion)
    {
    	elecRegion = elecRegion.toLowerCase();
    	return new Region (elecRegion);
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
			region = "kanto";
		if (region.equals("2"))
			region = "jhoto";
		if (region.equals("3"))
			region = "hoenn";
		if (region.equals("4"))
			region = "sinnoh";
		if (region.equals("5"))
			region = "teselia";
		if (region.equals("6"))
			region = "kalos";
		if (region.equals("7"))
			region = "alola";
		if (region.equals("8"))
			region = "galar";
		if (region.equals("9"))
			region = "paldea";
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
