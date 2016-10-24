
/**
*    Dans le cadre du tp2 inf111 A 2016, il s'agit de simuler la gestion d'une 
*    boîte électrique avec des disjoncteurs.
*    
*    Il est possible d'ajouter des disjoncteurs, des appareils sur un circuit, de
*    sauvegarder et de récupérer des boîtes décrites dans la classe du même 
*    nom. 
*
*  Le projet ne contient qu'une seule boîte à la fois.
*
* (voir énoncé du travail pour les détails).
* 
 *@author pbelisle
 * @version A2016
 *
 */

public class DemarrerBoiteDisjoncteur {

	/*
	 * Stratégie globale : On utilise les SP des différents modules pour obtenir  
	 * une boite electrique. 
	 * 
	 * C'est ici qu'on gère la boucle principale qui se termine si l'utilisateur 
	 * quitte ou s'il réussit.
	 * 
	 * De plus, on obtient s'il y a eu un clique sur une option de menu, alors
	 *  on délègue au module UtilitaireGestionMenu pour la distribution des 
	 *  tâches.
	 */
	public static void main(String[] args) {
						
		// Obtenir un ampérage pour la boîte.
		int max_amperes = 
				UtilitaireEntreeSortie.entierValide("Entrez l'ampérage de la boîte",
						Boite.AMPERAGE_MIN,
						Boite.AMPERAGE_MAX);

		// Si l'utilisateur n'a pas annulé.
		if(max_amperes != Boite.AMPERAGE_MIN - 1){
			
			// Récupérer une boîte neuve.
			Boite boite = new Boite(max_amperes);

			// is à vrai si l'utilisateur quitte.
			boolean quitter = false;


			// Sert à obtenir une option sélectionnée.
			String option;				

			//Remplit la boîte avec des disjoncteurs au hasard. 
			//NOTE : Peut être demandé à l'utilisateur éventuellement sert
			// pour simplifier le travail.
			boite.remplirAlea();

			// Le programme se termine si l'utilisateur appuie sur le bouton
			// QUITTER ou sur le X. 
			do
			{
				UtilitaireAffichageBoite.afficherBoite(boite);

				// Boucle qui attend que l'utilisateur appuie sur un des boutons.
				while(!UtilitaireAffichageBoite.optionMenuEstCliquee()){
					
					//Laisse le temps d'intercepter le clic.
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				};

				// Récupération de l'option sélectionnée pouréviter pls appels 
				// à l'accesseur.
				option = UtilitaireAffichageBoite.getOptionMenuClique();

				// Gestion des options du menu.

				// Démarrer le bon SP selon l'option
				/***/// Selon la version de Java, il est possible d'utiliser switch-case.
				if(option.equals(Constantes.OPTIONS_MENU
						[Constantes.AJOUTER_DISJONCTEUR])){

					UtilitaireGestionMenu.ajouterDisjoncteur(boite);
				}

				else if(option.equals(Constantes.OPTIONS_MENU
						[Constantes.AJOUTER_APPAREIL])){
					UtilitaireGestionMenu.ajouterDemande(boite);
				}

				else if(option.equals(Constantes.OPTIONS_MENU
						[Constantes.RECUPERER])){

					// On essaie dans une autre boite car si null, on veut garder la
					// boite qui est ouverte.
					Boite boiteTmp = UtilitaireGestionMenu.recupererBoite();

					if(boiteTmp != null){
						boite = boiteTmp;
					}
				}

				else if(option.equals(Constantes.OPTIONS_MENU
						[Constantes.SAUVEGARDER])){

					UtilitaireGestionMenu.sauvegarderBoite(boite);

				}

				if(option.equals(Constantes.OPT_QUITTER)){
					quitter = UtilitaireGestionMenu.veutSortir(boite);
				}

			}while(!quitter );
		}
		System.exit(0);


	}
}