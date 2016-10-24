import javax.swing.JOptionPane;

public class UtilitaireEntreeSortie {

	/*
	 * Fonction  pour saisir et valider la tension d'un disjoncteur. 
	 */
	public static int tensionValide() {

		/*
		 * Stratégie : On utilise JOptionPane pour la saisie et les constantes 
		 * prévues.
		 */

		// JOptionPane retourne un String.
		String tension;

		// Utilisé pour la validation avec les String.
		String tensionEntree =  String.valueOf(Disjoncteur.TENSION_ENTREE) ;
		String tensionPhase =  String.valueOf(Disjoncteur.TENSION_PHASE) ;

		do{
			tension = 
					JOptionPane.showInputDialog("Entrez une tension valide " + 
							Disjoncteur.CHAINE_TENSION_PERMISE);

		}while(tension != null && 
				!tension.equals(tensionEntree) &&
				!tension.equals(tensionPhase));

		return (tension == null)?0:Integer.parseInt(tension) ;
	}
	
	/*
	 * Fonction locale pour saisir et valider l'ampérage d'un disjoncteur. 
	 */
	public static int ampereValide() {

		String ampere;

		String ampereMIN = String.valueOf(Disjoncteur.MIN_AMPERAGE);
		String ampereMAX = String.valueOf(Disjoncteur.MAX_AMPERAGE);

		do{
			ampere = 
					JOptionPane.showInputDialog("Entrez un amperage valide " + 
							Disjoncteur.CHAINE_AMPERAGE_PERMIS);

		}while(ampere != null && 
				!ampere.equals(ampereMIN) && 
				!ampere.equals(ampereMAX));

		return (ampere == null)?0:Integer.parseInt(ampere) ;
	}

	/**
	 * Saisit et valide un entier entre min et max.  La fonction retourne min - 1
	 * si l'utilisateur annule.
	 * 
	 * 
	 * @param msgSollic Le message affiché.
	 * @param min La plus petite valeur permise.
	 * @param max La plus grande valeur permise.
	 * 
	 * @return L'entier saisit ou min-1 si l'utilisateur annule.
	 */
	public static int entierValide(String msgSollic, int min, int max) {

		String entier = null;

		// Version String des valeurs reçues.
		String minString =  String.valueOf(min) ;
		String maxString =  String.valueOf(max) ;

		do{
			entier = 
					JOptionPane.showInputDialog(msgSollic + 
							" entre " + minString + " et " + maxString);

			// Vérifier si c'est convertissable en entier.
			try{

				if(entier != null){
					int x = Integer.parseInt(entier);
				}
			}
			catch(Exception e){

				// Dans le cas d'une exception, on remet un entier invalide. 
				entier =  String.valueOf(min-1) ;
			}

		}while(entier != null && 
				(Integer.parseInt(entier) < min ||
						Integer.parseInt(entier) > max));

		return (entier== null)?min-1:Integer.parseInt(entier) ;
	}

	/**
	 * Saisit et valide un réel entre min et max.  
	 * La fonction retourne Double.NaN si l'utilisateur annule.
	 * 
	 * 
	 * @param msgSollic Le message affiché.
	 * @param min La plus petite valeur permise.
	 * @param max La plus grande valeur permise.
	 * 
	 * @return L'entier saisit ou min-1 si l'utilisateur annule.
	 */
	public static double reelValide(String msgSollic) {

		String reel = null;

		reel = JOptionPane.showInputDialog(msgSollic);

		// Vérifier si c'est convertissable en réel.
		try{

			if(reel != null){
				// Tentative de conversion.
				double x = Double.parseDouble(reel);
			}
		}
		catch(Exception e){

			// Dans le cas d'une exception, reel == null. 
			reel =  null;
		}
		return (reel== null)?Double.NaN:Double.parseDouble(reel) ;
	}

}