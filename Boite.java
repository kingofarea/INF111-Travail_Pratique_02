import java.io.Serializable;

/*
	* Module qui permet la gestion d'une bo�te �lectrique
	* avec disjoncteurs.
	*
	* La boite doit d'abord �tre initialis�e au nombre d'amp�res voulus 
	* ainsi que son nombre de disjoncteurs maximum possibles.
	*
	* Impl�mente l'interface Serializable pour la sauvegarde
	* dans un fichier binaire. 
	*/
public class Boite implements Serializable{
	
	/**
	 * Enl�ve un "warning". On ne g�re pas les versions.
	 */
	private static final long serialVersionUID = 1L;
	
	/*********************************
	 *  LES CONSTANTES DE LA BOITE
	 *********************************/
	// La modification a un effet direct sur l'affichage.
	public static final int MAX_DISJONCTEURS  = 60;
	public static final int NB_COLONNES  = 2;
	
	public static final int NB_LIGNES_MAX  = 
			MAX_DISJONCTEURS/NB_COLONNES;
	
	// Pour le remplissage de d�part.
    public static final double POURC_REMPLI = 0.6;
	public static final double POURC_TENSION_ENTREE = .3;
	
	public static final int AMPERAGE_MIN= 100;
	public static final int AMPERAGE_MAX = 400;
	
	/*********************************
	 *  LES ATTRIBUTS DE LA BOITE
	 *********************************/
	private int maxAmperes;
	
	// Le tableau est 2D mais il est � l'envers de la r�alit� (ligne-colonne).
	// Toutes les m�thodes qui n�cessitent la position, re�oivent (colonne-ligne).  
	private Disjoncteur[][] tabDisjoncteurs;	
	private int nbDisjoncteurs;
	
	// On d�duit les disjoncteurs TENSION_ENTREE par
	// nbDisjoncteurs - nbDisjoncteursPhase  
	private int nbDisjoncteursPhase;
	
	
	// Vous devez �crire les m�thodes manquantes.
	
	public Boite(int max_amperes) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return La consommation totale en Watts de la bo�te.
	 */
	public double getConsommationTotalEnWatt(){

	    double  total = 0;
	    return total;

	}

	/**
	 * @return la puissance totale consomm�e sur les disjoncteurs. 
	 */
	public double puissance_total_boite(){
		
	    double total = 0;

	    return total;

	}

	/*
	 * 
	 * @return  Le temps de support de la charge.
	 */
	public double temps_ups(){

	    return 0;
	}

	public boolean getEmplacementEncoreDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	public Disjoncteur getDisjoncteur(int j, int i) {
		// TODO Auto-generated method stub
		return new Disjoncteur();
	}


	public int getMaxAmperes() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void remplirAlea() {
		// TODO Auto-generated method stub
		
	}


	public Coord getEmplacementDisponible() {
		// TODO Auto-generated method stub
		return null;
	}

	public void ajouterDisjoncteur(int colonne, int ligne, Disjoncteur d) {
		// TODO Auto-generated method stub
		
	}

	public void ajouterDemande(int i, int j, double demande) {
		// TODO Auto-generated method stub
		
	}

	public void retirerPuissance(int i, int j, double demande) {
		// TODO Auto-generated method stub
		
	}

	public int getNbDisjoncteurs() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getNbDisjoncteursPhase() {
		// TODO Auto-generated method stub
		
		return 0;
	}

	public int getNbDisjoncteursEntree() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean getEmplacementEstVide(int colonne, int ligne) {
		// TODO Auto-generated method stub
		return false;
	}
}
