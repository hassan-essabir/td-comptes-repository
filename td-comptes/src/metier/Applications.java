package metier;

import java.util.List;

public class Applications {

	public static void main(String[] args) {

		try {
		Compte cp1 = new CompteCourant(1, 8000, 5000);
		Compte cp2 = new CompteEpargne(2, 30000, 5.5);

		cp1.verser(50000);
		cp1.retirer(3000);
		cp1.virement(400, cp2);
		cp1.verser(4000);
		cp1.retirer(7000);
		
		System.out.println("Solde du compte cp1=" +cp1.consulterSolde());
		System.out.println("Solde du compte cp2=" +cp2.consulterSolde());
		System.out.println("....................");
				
		List<Operation> listOperations = cp1.getOperations();
		for (Operation o:listOperations){
			System.out.println(o.getClass().getSimpleName()+"......" + o.getNumero() + ".." + o.getDateOperation() + ".." + o.getMontant());
		}
		
		System.out.println("....................");
		
		System.out.println("Total des versements du compte cp1="+cp1.totalVersement());
		System.out.println("Total des retraits du compte cp1="+cp1.totalRetrait());
		
		//cp1.retirer(8000000);
		
		System.out.println("Mettre a jour le solde");
		cp1.updateSolde();
		cp2.updateSolde();
		
		System.out.println("Solde du compte cp1="+cp1.consulterSolde());
		System.out.println("Solde du compte cp2="+cp2.consulterSolde());
		
		}
		
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
