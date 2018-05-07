
public class Main {

	public static void main(String[] args) {
		Operation o1 = new Operation("Cocou");
		Operation o2 = new Operation("Vendredi");
		Operation o3 = new Operation("Sylvain");
		Operation o4 = new Operation("Perdu");
		Operation o5 = new Operation("Dead Cells");
		
		Operation[] listeOp1 = new Operation[3];
		listeOp1[0] = o1;
		listeOp1[1] = o2;
		listeOp1[2] = o3;
		
		Operation[] listeOp2 = new Operation[2];
		listeOp2[0] = o4;
		listeOp2[1] = o5;
		
		Blockchain bc = new Blockchain();
		bc.ajoutBloc(bc.nouveauBloc(listeOp1));
		bc.ajoutBloc(bc.nouveauBloc(listeOp2));
		
		bc.afficheBlockchain();
		
	}
}
