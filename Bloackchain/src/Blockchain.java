import java.util.ArrayList;
import java.util.List;

public class Blockchain {

	private List<Bloc> blocs;
	
	public Blockchain() {
		blocs = new ArrayList<>();
	}
	
	public Bloc dernierBloc() {
		if(blocs.isEmpty()) {
			return null;
		}
		else {
			return blocs.get(blocs.size() - 1);
		}
	}
	
	public Bloc nouveauBloc(Operation[] listeOps) {
		Bloc latestBloc = dernierBloc();
		Bloc add;
		//Si le bloc ajout� est le premier du blockchain
		if(latestBloc == null) {
			add = new Bloc(0, listeOps, null);
		}
		else {
			add = new Bloc(latestBloc.getIdB() + 1, listeOps, latestBloc.getHash());
		}
		return add; 
	}
	
	public void ajoutBloc(Bloc b) {
		blocs.add(b);
	}
	
	public void afficheBlockchain() {
		for(int i = 0; i < blocs.size(); i++) {
			System.out.println("Bloc " + blocs.get(i).idB + " :");
			System.out.println("	Hash : " + blocs.get(i).getHash());
			System.out.println("	Previous Hash : " + blocs.get(i).getPreviousHash());
			Operation[] listeOp = blocs.get(i).getOp();
			for(int j = 0; j < listeOp.length; j++) {
				System.out.println("		Op�ration " + j + " :" + listeOp[j].op);

			}
		}
	}
}
