package fernando;

public class Main {
	public static void main(String[] args) {

		Fernando brujo = new Fernando();
		brujo.setName("Geralt de Rivia");
		brujo.setHealth(15);
		brujo.setHasSoul(true);
		if (brujo.isDeath()) {
			System.out.println(brujo.getName() + " está muerto");
		} else
			System.out.println(brujo.getName() + " está vivo");

	}
}
