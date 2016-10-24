
import java.io.Serializable;

public class GestionDisjoncteur {

	/*****************************************************
	 * 					  CONSTANTES					 *
	 *****************************************************/
	public static Coord coord = new Coord();
	
	private static String CHOIX_COLONNE = "Veuillez choisir une colonne";
	private static String CHOIX_LIGNE = "Veuillez choisir une ligne";

	private static int COLONNE, LIGNE, TENSION, AMPERE;
	

	/*****************************************************
	 * 			 			Quitter		  				 *
	 *  		    Manque la Sauvegarde				 *
	 *****************************************************/

	public static boolean GestionSortie(Boite boite){

		String option = UtilitaireAffichageBoite.getOptionMenuClique();

		boolean quitter = UtilitaireGestionMenu.veutSortir(boite);

		if(option.equals(Constantes.OPT_QUITTER)){
			
			quitter = UtilitaireGestionMenu.veutSortir(boite);
		
		}while( !quitter ){

			System.exit(0);
		}
		return quitter;	
	}

	/*****************************************************
	 * 			 		Position Disjoncteur		     *
	 *****************************************************/

	public static void PositionDisjoncteur(Boite boite){

		//L'utilisateur entre la colonne du nouveau disjoncteur
		COLONNE = UtilitaireEntreeSortie.entierValide(CHOIX_COLONNE, 1, Boite.NB_COLONNES);

		//Permet de verifier si la colonne est disponible (Boite.getEmplacementDisponible)
		coord.setColonne(COLONNE);

		//L'utilisateur entre la ligne du nouveau disjoncteur
		LIGNE = UtilitaireEntreeSortie.entierValide(CHOIX_LIGNE, 1, Boite.NB_LIGNES_MAX);

		//Permet de verifier si la ligne est disponible (Boite.getEmplacementDisponible)
		coord.setLigne(LIGNE);

		
		//******** Partie Test ********
		boite.getEmplacementEstVide(COLONNE,LIGNE);
		
		boite.getDisjoncteur(COLONNE, LIGNE);
	}

	/*****************************************************
	 * 				Tension/Ampere  Disjoncteur	 		 *
	 *****************************************************/

	public static void InsererDisjoncteur(Boite boite){
		
		//Disjoncteur disjoncteur = new Disjoncteur();
				
		//L'utilisateur entre la tension du nouveau disjoncteur
		TENSION = UtilitaireEntreeSortie.tensionValide();

		//L'utilisateur entre l'amperage du nouveau disjoncteur
		AMPERE = UtilitaireEntreeSortie.ampereValide(); 

		
		//******** Partie Test ********
		UtilitaireAffichageBoite.afficherBoite(boite);
		boite.getDisjoncteur(TENSION,AMPERE);
		
		
		}
	}




