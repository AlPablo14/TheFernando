package fernando;

public class Fernando {
	private String name;
	private int health;
	private boolean hasSoul;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isHasSoul() {
		return hasSoul;
	}

	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}

	public static void main(String[] args) {

		Fernando brujo = new Fernando();
		brujo.setName("Geralt de Rivia");
		brujo.setHealth(15);
		brujo.setHasSoul(true);
		if (brujo.isDeath()) {
			System.out.println(brujo.getName() + " está muerto");
		}else
			System.out.println(brujo.getName() + " está vivo");
		
	}

	public  boolean isDeath() {
		if(health == 0){
			return true;
		}else if (!hasSoul) {
			return true;
		}else {
			return false;
		}
	}
}
