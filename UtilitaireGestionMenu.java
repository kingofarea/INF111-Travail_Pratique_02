import javax.swing.JOptionPane;

/**
 * Classe qui contient les SP pour gérer les boutons d'options
 * de menu.
 * 
 * S'il y a ajout de bouton, il faut modifier cette classe et y ajouter
 * le comportement désiré.
 * 
 * @author Pierre Bélisle (copyright A2016)
 *
 */
public class UtilitaireGestionMenu {

	// Extension choisie arbitrairement pour les noms de fichier contenant
	// une boîte.
	public static final String EXTENSION_BOITE = "bte";
	
	public static final String DESC_EXTENSION =
			"*."+EXTENSION_BOITE;

	/**
	 * L'utilisateur a quitté, on lui demande si c'est bien ce qu'il veut et 
	 * s'il veut sauvegarder avant de quitter.
	 * 
	 * return Si l'utilisateur poursuit dans sa démarche de quitter.
	 * @return 
	 */
	public static boolean veutSortir(Boite boite){

		boolean quitter = false;
		
		//***** Mis en attente car il manque les parametres de sauvegarde*****
		//boolean quitter = GestionDisjoncteur.GestionSortie(boite);

		return quitter;    
	}

	/**
	 * Ajoute un disjoncteur à la boîte.
	 * 	
	 * @param boite
	 */
	public static void ajouterDisjoncteur(Boite boite){

	     GestionDisjoncteur.PositionDisjoncteur(boite);
	     GestionDisjoncteur.InsererDisjoncteur(boite);
	   
	}

	/**
	 * Ajoute une demande à un disjoncteur.  Si la demande est trop grande, 
	 * le disjoncteur est éteint.
	 * 
	 * @param boite  La boite à considérer.
	 */
	public static void ajouterDemande(Boite boite){
		
	     JOptionPane.showMessageDialog(null, "Ajouter une demande à écrire");
	   
	}

	/**
	 * Sert à l'interaction avec l'utilisateur pour obtenir le nom du fichier 
	 * de sauvegarde et sa validation.
	 * 
	 * @return La boite récupérer ou null.
	 */
	public static Boite recupererBoite() {

		Boite boite = null;
		
	     JOptionPane.showMessageDialog(null, "Récupérer à écrire");
		
		return boite;
	}

	/**
	 * Sert à l'interaction avec l'utilisateur pour obtenir le nom du fichier 
	 * de sauvegarde et sa validation.
	 * 
	 * @param La boîte à sauvegarder.
	 */
	public static void sauvegarderBoite(Boite boite) {
	     JOptionPane.showMessageDialog(null, "Sauvegarder à écrire");

	}
}