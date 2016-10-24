import java.util.Arrays;

/**
 * Classe qui implémente une liste
 * avec une position courante.  En tout temps les opérations
 * se font par rapport à la position courante qui fait partie intégrante de la liste.
 *
 * Les méthodes pour déplacer la position courante font partie de la classe.
 *
 * Pour l'insertion, la position courante est toujours sur l'objet ajouté.
 * Les méthodes de suppression ne sont pas implémentées
 *
 * On ne lève aucune exception pour cet exemple.  Seul les exceptions systèmes
 * seront levées s'il y a un problème.
 *
 * @author  <a href="mailto:pierre.belisle@etsmtl.ca">Pierre Bélisle</a>
 * @version A2016
 */
public class Liste {

	/*
	 * STRATÉGIE : On garde une variable pour retenir  la position courante
	 * et une pour le nombre d'éléments qui est mise à jour après chaque
	 * insertion ou supression.
	 *
	 * L'implémentation est dans un tableau statique.
	 *
	 * Les statégie pour chaque méthodes sont décrites dans leur commentaire
	 * de stratégie respectf.
	 */

	//Nombre d'éléments possibles au maximum par défaut
	public static final int MAX_ELEMENTS = 100;

	//La liste avec les objets
	private Object [] liste;

	 //La position où sont effectué les opération.
	 private int positionCourante;

	 //Maintenu à jour après une insertion ou une suppresion.
	 private int nbElements;

	 /**
	  * Crée une liste vide de MAX_ELEMENTS au maximum.
	  */
	 public Liste(){

	    	/**
	    	 * STRATÉGIE : On utilise le constructeur suivant (bonne pratique)
	    	 */

		      this(MAX_ELEMENTS);
	 }

	 /**
	  * Crée une liste vide de la taille fournie au maximum.
	  */
	 public Liste(int taille){

	    	/**
	    	 * STRATÉGIE : On initialise explicitement les valeurs plutôt que d'utiliser
	    	 * l'initialisation automatique de l'environnement Eclipse.
	    	 */

		       liste = new Object[taille];
		       positionCourante = 0;
		       nbElements = 0;
	 }
	 /**
	  * Retourne si la liste est vide.
	  *
	  * Antécédent : Aucun.
	  *
	  * Conséquent : Aucun.
	  *
	  * @return Si true la liste est vide et false autrement
	  */
	 public boolean estVide(){

		 /*
		  * STRATÉGIE : On retourne simplement l'évaluation booléenne de la
		  *  comparaison du nombre d'éléments avec 0.
		  */
	     return nbElements == 0;
	 }
	 //LES MÉTHODES DE DÉPLACEMENT
	 /**
	  * Passe la position courante au suivant dans la liste.
	  *
	  * Antécédent : Aucun.
	  *
	  * Conséquent : La position est déplacée sur l'élément suivant s'il existe.
	  * Sinon position courante est laissée à la fin
 	  *
	  */
	 public void setPosSuivant() {

		 /*
		  * STRATÉGIE : Si c'est la fin, on ne déplace pas, sinon on passe au suivant.
		  */
		 if(positionCourante != liste.length - 1){

    	     positionCourante++;
		 }
	 }
	 /**
	  * Met la position courante au début de la  liste.
	  *
	  */
	 public void setPosDebut() {

         /*
          * STRATÉGIE : On déplace la position courante sur la 1ière case.
          */

        positionCourante = 0;
	 }

	 /**
	  * Met la position courante à la fin de la liste.
	  *
	  *
	  */
	 public void setPosFin() {

		 /*
          * STRATÉGIE : on déplace la position courante au noeud pointé par fin.
          */
		 positionCourante = liste.length-1;
	 }

	 /**
	  * Passe la position courante au précédent dans la liste.
	  *
	  * Antécédent : La liste ne doit pas être vide.
	  *
	  */
	 public void setPosPrecedent(){

		 /*
		  *STRATÉGIE : On place une variable lovale temporaire sur le premier
		  *noeud et on parcrous le chaînege jusqu'à ce que le noeud suivant soit celui
		  *pointé par la position courante.
		  *
		  *On ne fait rien si la position courante est au début
		  *
		  ***********************************************************/

		 //on ne déplace rien si on est au début
		 if(positionCourante > 0)
			 positionCourante--;
	 }
	 /**
	  * Décale les données d'un tableau d'une case vers la droite pour les cases
	  * de début à fin.  Début et fin sont considérés comme valides.
	  */
	 private void decalerDroite(Object[] tab, int debut, int fin){

		 for(int i = fin; i >= debut;i--){
		   tab[i+1] = tab[i];
		 }
	 }
	 /**
	  * Décale les données d'un tableau d'une case vers la gauche pour les cases
	  * de début à fin.  Début et fin sont considérés comme valides.
	  */
	 private void decalerGauche(Object[] tab, int debut, int fin){

		 for(int i = debut; i <= fin;i++){
			   tab[i-1] = tab[i];
		 }
	 }


	 /**
	  * Insère l'élément reçu à la position courante après avoir déplacé
	  * tous les éléments vers la droite d'une case
      *
      * Antédécent : Aucun.
      *
	  * Conséquent : nbElement = nbElement + 1 & liste.getElement() == element.
	  *                       La position courante reste inchangée
	  *
	  * @param element L'Élément à insérer à la position courante.
	  *
	  */
	 public void insererALaPosition(Object element){

		 /*
		  * STRATÉGIE : On utilise le nombre d'éléments pour tester ss'il reste
		  * de  la place. Si c'est le cas, on décale les données à l'aide de la classe
		  * Arrays et on met l'élément à la position courante qui sera déplacée
		  * sur le nouvel élément inséré.
		  */

		 //Si la liste n'est pas pleine seulement
		 if(nbElements < liste.length){

			 decalerDroite(liste, positionCourante, nbElements-1);

			 liste[positionCourante] = element;

		    //un élément de plus
		    nbElements++;
		 }
	 }

	 /**
	  * Insère l'élément reçu avant la position courante
	  *
      * Antédécent : Aucun.
      *
	  * Conséquent : nbElement = nbElement + 1 & liste.getElement() == element.
	  *
	  * @param element L'Élément à insérer dans la liste avant la position courante.
	  */
	 public void insererApres(Object element){

		 /*
		  * STRATÉGIE : On utilise insererApres en utilisant positionCourante -1
		  */

		 setPosSuivant();
		 insererALaPosition(element);
	 }

	 /**
	 * Supprime l'élément à la position courante.
	 */
	 public void supprime(){

	     decalerGauche(liste, positionCourante+1, nbElements -1);
	     nbElements--;
	 }
	 //LES AUTRES MÉTHODES
	 /**
	  * Retourne l'élément à la position courante
	  *
	  * Antécédent : La liste ne doit pas être vide.
	  *
	  * Conséquent : Le contenu de la liste est inchangé et la position courante
	  * reste inchangée.
	  *
	  * @return L'élément à la position courante
	  */
	 public Object getElement(){

		      /*STRATÉGIE : Retourne simplement l'élément à la
		       * position courante.
		       */
			 return liste[positionCourante];
	 }
	 /**
	  * Retourne le nombre d'éléments actuellement dans la liste.
	  *
	  * Antécédent : aucun.
	  * Conséquent : aucun.
	  *
	  * @return Le nombre d'éléments de la liste.
	  */
	 public int getNbElements(){

		 return nbElements;
	 }




}