package sofkachallange.model;

public class Round {

	private int award;
	
	private int number;
	
	private Category category;

	public Round(int award, int number, Category category) {
		super();
		this.award = award;
		this.number = number;
		this.category = category;
	}

	public int getAward() {
		return award;
	}

	public void setAward(int award) {
		this.award = award;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
