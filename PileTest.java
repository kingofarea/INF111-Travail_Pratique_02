
public class PileTest {
	
	/**************************
	 * Constantes de la pile
	 **************************/
	
	public static final int vide = -1;
	public static final int maxElement = 100;
	private int sommet;
	
	//Tableau constituant la pile
	private Object[] pile;

	/*****************************
	 * Constructeurs de la pile 
	 *****************************/
	
	public PileTest(){
		
		pile = new Object[maxElement];
		sommet = vide;
	}
	
	public PileTest(int taille){
		
		pile = new Object[taille];
		sommet = vide;
	}
	
	public void Empiler(Object element) throws Exception{
		
		if(sommet == pile.length -1){
			throw new Exception("Pile est pleine");
		}
		
		pile[++sommet] = element;
	}
	
	public Object Desempile() throws Exception{
		
		if(sommet == vide){
			throw new Exception("La pile est vide"); 
		}
		
		return pile[sommet--];
	}
	
}
