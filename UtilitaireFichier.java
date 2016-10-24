/**
 * Classe utilitaire qui permet de sauvegarder dans un fichier binaire ou texte.
 * Elle petmer aussi de de récupérer une boite.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UtilitaireFichier {

	// Permet d'écrire dans un fichier texte en colonne et l'ouvrir dans Excel.
	// Il suffit d'écrire un TAB pour changer de colonne.
	private static final String TAB = "\t";

	/**
	 * Sauvegarde la boîte dans un fichier texte dont on reçoit le nom.
	 * 
	 */
	public static void sauvegarderDsFichierTexte(Boite boite, String nomFic){

	}

	/**
	 * Sauvegarde la boîte dans le fichier fichier binaire avec le nom reçu.
	 * 
	 * On présume le nom de fichier valide.
	 * 
	 * @param nomFic où sauvegarder la boîte.
	 * @param boite La boîte à sauvegarder.
	 */
	public static void sauvegarderBoite(Boite boite, String nomFic){
	}
	
	/**
	 * Ouvre le fichier dont le nom correspond à celui reçu.
	 * 
	 * Exception : Le fichier doit contenir une boîte sauvegarder par
	 * la méthode sauvegarderBoite.
	 * 
	 * @param nomFic Le nom du fichier à ouvrir
	 * @return La boîte contenu dans le fichier.
	 */
	public static Boite recupererBoite(String nomFic){

		Boite boite = null;
		
		return boite;
	}
}