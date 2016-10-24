/**
 * Classe qui offre des foncitons math�matiques utilitaire qui n'existe pas 
 * int�gralement en Java.
 * 
 * @version H2016
 */
public class UtilitaireMath {

    /**
     * Retourne un nombre entier al�atoire dans un intervalle entier donn�.
     * 
     * @param min La plus petite valeur possible
     * @param max La plus grande valeur possible
     * @return Un nombre entier entre min et max (inclusivement)
     */
    public static int entierAlea(int min, int max) {
    	
        //Strat�gie, on utilise le g�n�rateur de Java qui retourne une valeur r�elle
        //entre 0 et 1  ensuite, on le ram�ne dans l'intervalle min..max et on 
        //le transforme en entier.
        return (int) (Math.random() / 1.000001 * (max - min + 1) + min);
    }

    /**
     * Retourne un nombre r�el al�atoire dans un intervalle r�el donn�.
     * 
     * @param min La plus petite valeur possible
     * @param max La plus grande valeur possible
     * @return Un nombre r�el entre min et max (inclusivement)
     */
    public static double reelAlea(double min, double max) {
    	
        //Strat�gie, on utilise le g�n�rateur de Java qui retourne une valeur r�elle
        //entre 0 et 1  ensuite, on le ram�ne dans l'intervalle min..max et on 
        //le transforme en entier.
        return Math.random() / 1.000001 * (max - min + 1) + min;
    }


}
