import java.awt.Color;

/**
 * Contient les déclarations de constantes globales pour le projet des 
 * disjoncteurs.
 * 
 * @author Pierre Bélisle (copyright 2016)
 * @version A2016
 */
public class Constantes {
	
	//Constantes initiales pour les couleurs (valeur arbitraires)
	public static final Color COULEUR_FOND = Color.WHITE;
	public static final Color COULEUR_TEXTE = Color.BLACK;
	
	// La position des options dans le menu.
	public static final int AJOUTER_DISJONCTEUR = 0;
	public static final int AJOUTER_APPAREIL = 1;
	public static final int SAUVEGARDER= 2;
	public static final int RECUPERER= 3;
	public static final int QUITTER = 4;

	// Les options de menu possibles.
	public static final String 
		OPT_AJOUTER_DISJONCTEUR ="Ajouter un disjoncteur"  ;
	
	public static final String 
		OPT_AJOUTER_APPAREIL = "Ajouter -Retirer une demande";
	
	public static final String 
		OPT_SAUVEGARDER= "Sauvegarder une boîte";
	
	public static final String OPT_RECUPERER= "Récupérer une boîte";
	
	public static final String OPT_QUITTER = "Quitter";

	//Utilisez pour  l'affichage des options du menu.
	public static final String[] OPTIONS_MENU = 
		{OPT_AJOUTER_DISJONCTEUR,
			OPT_AJOUTER_APPAREIL,
			OPT_SAUVEGARDER,
			OPT_RECUPERER,
			OPT_QUITTER};
	
	// L'extension d'un fichier incluant le point.
	public static final int TAILLE_EXTENSION = 4;
	
}