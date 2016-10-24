import javax.swing.JOptionPane;

/**
 * Classe qui contient les SP pour g�rer les boutons d'options
 * de menu.
 * 
 * S'il y a ajout de bouton, il faut modifier cette classe et y ajouter
 * le comportement d�sir�.
 * 
 * @author Pierre B�lisle (copyright A2016)
 *
 */
public class UtilitaireGestionMenu {

	// Extension choisie arbitrairement pour les noms de fichier contenant
	// une bo�te.
	public static final String EXTENSION_BOITE = "bte";
	
	public static final String DESC_EXTENSION =
			"*."+EXTENSION_BOITE;

	/**
	 * L'utilisateur a quitt�, on lui demande si c'est bien ce qu'il veut et 
	 * s'il veut sauvegarder avant de quitter.
	 * 
	 * return Si l'utilisateur poursuit dans sa d�marche de quitter.
	 * @return 
	 */
	public static boolean veutSortir(Boite boite){

		boolean quitter = false;
		
		//***** Mis en attente car il manque les parametres de sauvegarde*****
		//boolean quitter = GestionDisjoncteur.GestionSortie(boite);

		return quitter;    
	}

	/**
	 * Ajoute un disjoncteur � la bo�te.
	 * 	
	 * @param boite
	 */
	public static void ajouterDisjoncteur(Boite boite){

	     GestionDisjoncteur.PositionDisjoncteur(boite);
	     GestionDisjoncteur.InsererDisjoncteur(boite);
	   
	}

	/**
	 * Ajoute une demande � un disjoncteur.  Si la demande est trop grande, 
	 * le disjoncteur est �teint.
	 * 
	 * @param boite  La boite � consid�rer.
	 */
	public static void ajouterDemande(Boite boite){
		
	     JOptionPane.showMessageDialog(null, "Ajouter une demande � �crire");
	   
	}

	/**
	 * Sert � l'interaction avec l'utilisateur pour obtenir le nom du fichier 
	 * de sauvegarde et sa validation.
	 * 
	 * @return La boite r�cup�rer ou null.
	 */
	public static Boite recupererBoite() {

		Boite boite = null;
		
	     JOptionPane.showMessageDialog(null, "R�cup�rer � �crire");
		
		return boite;
	}

	/**
	 * Sert � l'interaction avec l'utilisateur pour obtenir le nom du fichier 
	 * de sauvegarde et sa validation.
	 * 
	 * @param La bo�te � sauvegarder.
	 */
	public static void sauvegarderBoite(Boite boite) {
	     JOptionPane.showMessageDialog(null, "Sauvegarder � �crire");

	}
}