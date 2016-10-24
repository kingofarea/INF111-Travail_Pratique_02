import java.io.Serializable;

//utiliser Deserializable pour qu'un autre programme comprenne les valeurs partagees. 

/*
* Classe qui regroupe tout qui concerne un
* disjoncteur dans le projet.
*
* On y retrouve les constantes et les  sous-programmes
* lié à un disjoncteur.
* 
* Implémente l'interface Serializable pour la sauvegarde
* dans un fichier binaire. 
*/
public class Disjoncteur implements Serializable{

	/**
	 * Enlève un "warning". On ne gère pas les versions.
	 */
	private static final long serialVersionUID = 1L;
	

	
    // État possible d'un disjoncteur.
	public static final int ALLUME = 1;
	public static final int ETEINT = 0;
	
	// Choix d'ampérages possibles.
	public static final int MIN_AMPERAGE = 15;
	public static final int MAX_AMPERAGE = 60;
	

	// Tous les ampérages permis dans un tableau.  
	public static final int AMPERAGES_PERMIS[] =
		                         {MIN_AMPERAGE, 20, 40, 50, MAX_AMPERAGE};

	// Construction d'une chaîne avec les ampérages permis. Sert à valider.
	public static final  String CHAINE_AMPERAGE_PERMIS = 
			"15/20/40/50/60";
	
	// Les tensions possibles.
	public static final int TENSION_ENTREE = 240;
	public static final int TENSION_PHASE = 120;

	// Construction d'une chaîne avec les tensions permises. Sert à valider.
	public static final  String CHAINE_TENSION_PERMISE = 
			"120/240";
	
	
	/******************************
	 * * Les attributs d'un disjoncteur
	 ********************************/
	
	private double ampere;
    private double tension;

	// Une liste qui contient les demandes (charge) sur le circuit.
	private Liste demandeDuCircuit;
	
	// ALLUME ou ETEINT.	
    private int etat;

	public Disjoncteur() {
		// TODO Auto-generated constructor stub
	}

	public double getAmpere() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getTension() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getPuissanceEnWatt() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getEtat() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getRatio() {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
    
