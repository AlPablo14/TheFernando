package witcher;

public class Main {

	public static void main(String[] args) {

		Witcher brujo = new Witcher();
		
		brujo.setName("Geralt de Rivia");
		brujo.setHealth(15);
		brujo.setHasSoul(true);
		
			if (brujo.isDead()) {
				System.out.println(brujo.getName() + " est� muerto.");
			}
			else {
				System.out.println(brujo.getName() + " est� vivo.");
			}
	}
}
