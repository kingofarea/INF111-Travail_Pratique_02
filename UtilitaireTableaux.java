
/**
 * Solution du laboratoire 2 sur les tableaux 
 * 
 * @author Pierre B?lisle (@copyright 2016)
 * @version h2016
 */
public class UtilitaireTableaux {
	
	//Ordre possible pour les tris sur tableau
	public static final int CROISSANT = 0;
	public static final int DECROISSANT = 1;
	
	
	/*****************************************************
	 * PRODUIT
	 *****************************************************  
	 * Fait le produit de toutes les cases d'un tableau de double entres elles.
	 * 
	 * @param tab Le tableau ? consid?rer
	 * @return Le produit des valeurs du tableau multipli?es entre elles
	 */	
	public static double produitTableauReels(double[] tab,int nb){
		
		/*
		 * Strat?gie : On met 1 dans une variable qui sert ? retenir le produit
		 *                  , avec une boucle for, de tous les ?l?ments du tableau.
		 */
		//?l?ment neutre de la multiplication
		double produit = 1;
		
		//Multiplier une ? une, retenu dans produit 
		for(int i  = 0; i < nb; i++)
			produit = produit * tab[i];
		
		return produit;
	}
	
	/*****************************************************
	 * SOUS TABLEAU
	 *****************************************************  
	 * Retourne un sous tableau compos? des cases allant de indice_min 
	 * ? indice_max dans le tableau re?u.
	 * @param tab Le tableau ? consid?rer
	 * @param debut Le d?but du sous tableau
	 * @param fin La dfin du sous tableau
	 * @return Un tableau de (indice_max - indice_min + 1) cases contenu dans tab
	 */
	public static double[] sousTableau(double[] tab, int debut, int fin){
		
		/*
		 * Strat?gie : On calcule la taille du sous tableau avec fin-debut+1.
		 *                  Ensuite, on copie, avec une boucle for, les cases de debut ? fin 
		 *                  dans les cases de 0 ? fin-debut du sous-tableau.
		 */
		//On cr?e le sous tableau de la bonne taille
		double[] sousTab = new double[fin - debut + 1];
		
		//Indice pour se d?placer dans le sous tableau		
		int j = 0;
		
		//Pour les cases du tableau principal allant de indice_min ? indice_max
		for(int i  = debut; i <= fin; i++){
			
			//On copie les valeurs dans le sous tableau
			sousTab[j] = tab[i];
			
			//on aurait pu mettre le j++ apr?s le i++ dans l'en-t?te 
                  //du for s?par? par une virgule mais cela enl?eve de la clart?.
		    j++;                                          
		    
		}
		
		
		return sousTab;
		
	}
	
	/**
	 * D?cale les donn?es entre debut et fin d'une case vers la gauche.
	 * 
	 * Aucune validation des indices
	 * @param tabReels Le tableau de nombre r?els
	 * @param debut et fin : indice ? consid?rer
	 */
	public static void decalerGauche(double[] tabReels, 
			int nbElements, int debut, int fin){
		
		/*
		 * STRAT?GIE : On utilise une boucle for et on met les valeurs de d?but ? fin
		 *                          dans les cases de d?but-1 ? fin -1
		 */
		
		/*
		 * Pas besoin de valider mais si on le faisait on ajouterait :
		 * 
		 * if(nbElements <= tab.length && debut >= 0 && fin <= nbElements - 1)
		 */
		
		for(int i= debut; i <= fin; i++)
			tabReels[i-1] = tabReels[i];
	}
	
	/**
	 * D?cale les donn?es entre debut et fin d'une case vers la droite.
	 * 
	 * Aucune validation des indices
	 * @param tabReels Le tableau de nombre r?els
	 * @param debut et fin : indice ? consid?rer
	 */
	public static void decalerDroite(double[] tabReels,  
			int nbElements, int debut, int fin){
		
		/*
		 * STRAT?GIE : On utilise une boucle for et on met les valeurs de d?but ? fin
		 *                          dans les cases de d?but+1 ? fin +1.
		 *                          
		 *                          Pour ne pas ?craser de donn?es, nous partons de la fin
		 */
		
		/*
		 * Pas besoin de valider mais si on le faisait on ajouterait :
		 * 
		 * if(nbElements <= tab.length && debut >= 0 && fin <= nbElements - 1)
		 */
		for(int i= fin; i >= debut; i--)
			tabReels[i+1] = tabReels[i];
	}
	
     /**
      * Ajoute un nombre ? la position fournie
      * 
      * Rien n'est ajout? si le tableau est plein mais aucune validation de la position
      * @param tabReels Le tableau dans lequel s'effectue l'ajout
      * @param nbElements Le nombre d'?l?ments significatifs
      * @param position La position d'ajout
      *@param valeur La valeur ? ajouter
      */
	public static void ajouterNombreDsTableau(double[] tabReels, 
			int nbElements,  int position, int valeur){
		
		/*
		 * STRAT?GIE : On utilise la proc?dure locale de d?calage ? 
		 *                          droite avant l'insertion.
		 *                          
         *                          On enl?ve 1 au nombre ? cause des indices de tableau
		 */

		if(nbElements <= tabReels.length ){
			
			if(position <= tabReels.length -1)
				decalerDroite(tabReels, nbElements, position, nbElements-1);
			
			tabReels[position] = valeur;
		}
		
	}
	
    /**
     * Retire le nombre ? la position fournie.
     * 
     * L'utilisateur doit s'assurer de d?cr?menter son nombre d'?l?ments
     *  significatifs
     * 
     * Rien n'est retir? si le tableau est vide mais aucune validation de la position
     * @param tabReels Le tableau dans lequel s'effectue l'ajout
     * @param nbElements Le nombre d'?l?ments significatifs
     * @param position La position de retrait
     */
	public static void retirerNombreDsTableau(double[] tabReels, 
			int nbElements,  int position){
		
		/*
		 * STRAT?GIE : On utilise la proc?dure locale de d?calage ? 
		 *                          gauche pour d?truire.  
		 *                          
		 *                          On enl?ve 1 au nombre ? cause des indices de tableau
		 *                          .
		 */

		if(nbElements > 0 ){
			
			//Si la position est sur le dernier indice, il n'y a rien ? faire
			//le retrait aura lieu lorsque l'utilisateur d?cr?mente le nombre d'?l?ments
			if(position != tabReels.length -1)
				decalerGauche(tabReels, nbElements, position + 1, nbElements - 1);
		}
		
	}
	

	/******************************************************
	 * POSITION VALEUR MINIMUM
	 * ****************************************************
	 * Retourne la position dans le tableau de la plus 
	 * petite valeur ? partir de la position de d?part.
	 * 
	 * @param unTablo Le tableau dans le quel il faut trouver la plus petite valeur
	 * @param positionDepart L'indice de la case de d?part pour la recherche
	 * 
	 */
	private static int positionValeurMinimum(double[] unTablo, 
			int positionDepart){
		
		//Retient l'indice de d?part comme ?tant celle de la case contenant le 
		//la plus petite valeur vue ? date
		int posMinJusquaMaintenant = positionDepart;
		
		// ? la recherche d'une case dont le contenu est plus petit que celle 
		//point?e par l'indice de la valeur la plus petite jusqu'? maintenant.
		
		//Pour toutes les case du tableau ? partir de la position de d?part
		for(int position = positionDepart;position <unTablo.length;position++)
			
			//Si la case point?e par position est plus petite que celle jusqu'? maintenant
		    if(unTablo[posMinJusquaMaintenant] > unTablo[position])
		    	
		    	//On retient cette position comme ?tant celle contenant la valeur 
		    	//la plus petite jusqu'? maintenant
		    	posMinJusquaMaintenant = position;
		    		
		
		//On retourne l'indice trouv?e
		return posMinJusquaMaintenant;
		
	}

	/******************************************************
	 * POSITION VALEUR MAXIMUM
	 * ****************************************************
	 * Retourne la position dans le tableau de la plus 
	 * petite valeur ? partir de la position de d?part.
	 * 
	 * @param unTablo Le tableau dans le quel il faut trouver la plus petite valeur
	 * @param positionDepart L'indice de la case de d?part pour la recherche
	 * 
	 */
	private static int positionValeurMaximum(double[] unTablo, 
			int positionDepart){
		
		//Retient l'indice de d?part comme ?tant celle de la case contenant le 
		//la plus grande valeur vue ? date
		int posMaxJusquaMaintenant = positionDepart;
		
		// ? la recherche d'une case dont le contenu est plus grand que celle 
		//point?e par l'indice de la valeur la plus grande jusqu'? maintenant.
		
		//Pour toutes les case du tableau ? partir de la position de d?part
		for(int position = positionDepart;position <unTablo.length;position++)
			
			//Si la case point?e par position est plus petite que celle jusqu'? maintenant
		    if(unTablo[posMaxJusquaMaintenant] < unTablo[position])
		    	
		    	//On retient cette position comme ?tant celle contenant la valeur 
		    	//la plus petite jusqu'? maintenant
		    	posMaxJusquaMaintenant = position;
		    		
		
		//On retourne l'indice trouv?e
		return posMaxJusquaMaintenant;
		
	}

	
	/*******************************************************
	 * ECHANGER VALEURS TABLEAU
	 * *****************************************************
	 * Permet l'?change entre deux valeurs d'un tableau
	 * 
	 * @param unTablo Le tableau dans le quel il faut effectuer l'?change
	 * @param pos1 L'indice d'une des cases ? ?changer le contenu
	 * @param pos2 L'indice de l'autre case ? ?changer le contenu
	 */
	private static void echangerValeursTableau(double[] unTablo, 
			int pos1, int pos2){
		
		    //Variable temporaire n?cessaire pour intervertir deux valeurs en m?moire
			double tmp;
			
			//Intervertit le contenu des deux cases (?change ? trois)
			tmp = unTablo[pos1];
			unTablo[pos1] = unTablo[pos2];
			unTablo[pos2] = tmp;
	}
	
	
	/*******************************************************
	 * TRI S?LECTION
	 * *****************************************************
	 * Impl?mentation de l'algorithme du tri par s?lection tel que 
	 * d?crit ? : http://fr.wikipedia.org/wiki/Tri_par_selection
	 * 
	 * @param unTablo Tableau dans lequel sera effectu? le tri
	 */
	public static void trierReelsParSelection(double[] unTablo, int ordre){
		
		
		//Pour toutes les cases du tableau ? l'exception de la derni?re(inutile).
		for(int i = 0; i < unTablo.length - 1;i++)
			
			
			/*On minimise le nombre de lignes de code en utilisant la fonction
			 *comme param?tre effectif.  Autrement, on aurait ?crit :
			 *
			 *int indice = positionValeurMinimum(unTablo,i);
			 *echangerValeursTableau(unTablo,i,indice);
			 * 
			 */
			
			//On peut ?vite le if par tour de boucle en ?crivant deux SP diff?rents
			//qui inclut la boucle
			//(voir autres tris)
	    	if(ordre == CROISSANT)	    		
	    		echangerValeursTableau(unTablo,i,positionValeurMinimum(unTablo,i));
		
	    	else
	    		echangerValeursTableau(unTablo,i,positionValeurMaximum(unTablo,i));
	}



	/*******************************************************
	 * INSERER VALEUR A POSITION DECROISSANT
	 * *****************************************************
	 *D?cale les valeurs vers la droite de la  position re?ue jusqu'? la premi?re case
	 *? moins de trouver une valeur du tableau plus grande ou ?gale.  La valeur
	 *est donc ins?r?e ? la position d'arr?t du d?calage.
	 * @param unTablo Tableau dans lequel sera effectu? la recherche
	 * @param position L'indice de d?part du d?calage
	 * @param valeur La valeur ? ins?rer
	 */
	public static int insererValeurAPositionDecroissant(double[] unTablo, 
			int position, double valeur){		

        //Tant qu'il y aura des ?l?ments du tableau plus petit 
        //que la valeur cherch?e, on d?cale vers la droite.
        while (position >= 0 && unTablo[position] < valeur){ 
        	unTablo[position+1] = unTablo[position] ;
        	position--;
        }
 
        //Incr?mente la position avant d'ins?rer la valeur
        unTablo[++position] = valeur;
        
        return position;		
	}
	
	/*******************************************************
	 * INSERER VALEUR A POSITION CROISSANT
	 * *****************************************************
	 *D?cale les valeurs vers la droite de la  position re?ue jusqu'? la premi?re case
	 *? moins de trouver une valeur du tableau plus petite ou ?gale.  La valeur
	 *est donc ins?r?e ? la position d'arr?t du d?calage.
	 * @param unTablo Tableau dans lequel sera effectu? la recherche
	 * @param position L'indice de d?part du d?calage
	 * @param valeur La valeur ? ins?rer
	 */
	public static int insererValeurAPositionCroissant(double[] unTablo, 
			int position, double valeur){		

        //Tant qu'il y aura des ?l?ments du tableau plus grand 
        //que la valeur cherch?e, on d?cale vers la droite.
        while (position >= 0 && unTablo[position] > valeur){ 
        	unTablo[position+1] = unTablo[position] ;
        	position--;
        }
 
        //Incr?mente la position avant d'ins?rer la valeur
        unTablo[++position] = valeur;
        
        return position;		
	}
	
	
	
	/*******************************************************
	 * TRI INSERTION
	 * *****************************************************
	 * Impl?mentation de l'algorithme du tri par insertion tel que 
	 * d?crit ? : http://fr.wikipedia.org/wiki/Tri_par_insertion
	 * 
	 * @param unTablo Tableau dans lequel sera effectu? le tri
	 */
	public static void trierReelsParInsertion(double[] unTablo, int ordre){
		
		
		/*STRAT?GIE : C'est la meilleure version du tri par insertion
		 *            car elle d?cale et non ?change les valeurs.
		 */
		
	    	//Pour ?viter un if par tour de boucle en divisant en deux SP.  Seul le
		    //signe de comparaison change.
	    	//(voir: trierParSelection)
	    	if(ordre == CROISSANT)	    		
	    		trierInsertionCroissant(unTablo);
	    	
	    	else
	    		trierInsertionDecroissant(unTablo);	   	   
	    
	}
	
	//Utilitaire local
	private static void trierInsertionCroissant(double[] unTablo){
			
	    //Pour toutes les cases du tableau sauf la premi?re (d?j? tri?e)
	    for (int i = 1; i < unTablo.length; i++)
	    		    	    
    		//On trouve la position o? il faut ins?rer en ordre croissant
    		insererValeurAPositionCroissant(unTablo,i-1,unTablo[i]);
		
	}
	
	//Utilitaire local
	private static void trierInsertionDecroissant(double[] unTablo){
		
	    //Pour toutes les cases du tableau sauf la premi?re (d?j? tri?e)
	    for (int i = 1; i < unTablo.length; i++)
	    		    	    
    		//On trouve la position o? il faut ins?rer en ordre d?croissant
    		insererValeurAPositionDecroissant(unTablo,i-1,unTablo[i]);
	    
	}

	
	/*******************************************************
	 * TRIER BULLE
	 * *****************************************************
	 * Impl?mentation de l'algorithme du tri ? bulles tel que 
	 * d?crit ? : http://fr.wikipedia.org/wiki/Tri_a_bulles
	 * 
	 * @param unTablo Tableau dans lequel sera effectu? le tri
	 */
		public static void trierReelsParBulle(double[] unTablo, int ordre){
		
			/*
			 * Strat?gie : On a divis? en deux SP locaux pour optimiser le temps
			 *                  d'ex?cution (?vite un if par tour de boucle).  Seul le
			 *                  signe de comparaison change.
			 */
			if(ordre == CROISSANT)
				trierBulleCroissant(unTablo);
			else
				trierBulleDecroissant(unTablo);
		
	}
	

	//Utilitaire local
	private static void trierBulleCroissant(double[] unTablo){
		
		/*
		 * Strat?gie : On imagine un tableau vertical ayant la case 0 au bas.
		 *                  Les grandes valeurs descendent vers leur position finale 
		 *                  en poussant comme une bulle sur les plus grandes valeurs
		 *                  qui s'en vont vers leur place finale.
		 *                  
		 *                  Deux boucles for, un if et un appel ? la proc?dure d'?change
		 *                  si les valeurs sont en d?sordre.
		 */
		
	    //Pour toutes les cases de la fin vers la case 1 (premier inutile)
		for(int i = unTablo.length - 1; i > 0 ;i--)
			
		    //Pour toutes les cases du d?but jusqu'? i + 1 (important)
			for(int j =0; j < i; j++)
									
					//Si la case du haut est plus grande que celle du bas
					if(unTablo[j] > unTablo[j+1])
					
						//On les ?change
						echangerValeursTableau(unTablo,j,j+1);

			
	}

	//Utilitaire local
	private static void trierBulleDecroissant(double[] unTablo){
		
		/*
		 * Strat?gie : On imagine un tableau vertical ayant la case 0 au bas.
		 *                  Les grandes valeurs descendent vers leur position finale 
		 *                  en poussant comme une bulle sur les plus grandes valeurs
		 *                  qui s'en vont vers leur place finale.
		 *                  
		 *                  Deux boucles for, un if et un appel ? la proc?dure d'?change
		 *                  si les valeurs sont en d?sordre.
		 */
		
	    //Pour toutes les cases de la fin vers la case 1 (premier inutile)
		for(int i = unTablo.length - 1; i > 0 ;i--)
			
		    //Pour toutes les cases de la fin vers le d?but - 1(important)
			for(int j =0; j < i; j++)
									
				//Si la case du bas est plus petite que celle du haut
				if(unTablo[j] < unTablo[j+1])
					
					//On les ?change
					echangerValeursTableau(unTablo,j,j+1);

			
	}
	
	
	/*
	 * Il y a aussi l'algorithme pr?sent? en classe qui est un tableau 
	 * verticale avec la case 0 en haut.   En ordre croissant, les petites valeurs
	 * remontent vers la case 0.
	 * 
     * Pour toutes les cases de la case 0 vers la fin - 1 (dernier inutile)
     * for(int i = 0; i < unTablo.length - 1 ;i++)
     * 
     *     //Pour toutes les cases de la fin vers le d?but - 1(important)
	 *		for(int j =unTablo.length - 1; j > i; j--)
	 *								
	 *			//Si la case du bas est plus petite que celle du haut
	 *			if(unTablo[j] < unTablo[j-1])
	 *				
	 *				//On les ?change
	 *				echangerValeursTableau(unTablo,j,j-1);	 
	 *	
	 */		
		
	/******************************************************
	 * FOUILLE
	 * ****************************************************
	 * Sert ? retourner si une valeur est pr?sente ou non dans le tableau.  
	 * Si elle s'y trouve, la valeur retourn?e sera sa position dans le tableau.
	 * Autrement, la valeur n?gative (VALEUR_ABSENTE) est retourn?e.   
	 * @param unTablo Tableau dans lequel sera effectu? la fouille
	 * @param valeur La valeur cherch?e
	 * @return La position de la valeur trouv?e ou un nombre n?gatif.
	 */
	public static int fouilleBinaire(double[] unTablo, double valeur){
	
	    // Fouille dichotomique dans le tableau.
	    // Au debut, l'espace de recherche va de la case 0 a tab.length -1.
	    int debut = 0;
	    int fin = unTablo.length -1;
	    int milieu = 0;
	    
	    
	    boolean trouvee = false;
	    
	    //tanque les indices ne se sont pas crois?s et qu'on n'a pas trouv? la valeur
	    while (!trouvee && debut <= fin){
	    	
	        // On trouve le milieu de l'espace de recherche. 
	        milieu =(debut + fin) / 2;
	        
	        if(valeur == unTablo[milieu])
	        	trouvee = true;
	        
	        //On conserve la moiti? de droite ou de gauche de l'espace de
	        // recherche en d?pla?ant les indice de d?but ou de fin
	        else if (valeur < unTablo[milieu])
	            fin = milieu - 1;
	            
	        else
	            debut = milieu + 1;
	        
	    }
	    
	    //On v?rifie si la valeur n'a pas ?t? trouv?e (!trouvee)
	    //On doit d?cr?menter l'indice de d?but et la mettre  n?gative.
	   
	    //On retourne donc la position (op?rateur ternaire: norme recommand?e Java)
        return (!trouvee) ?-debut-1:milieu;
	}
	
	

}