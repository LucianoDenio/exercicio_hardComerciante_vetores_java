package entities;

public class Product {
	private String name;
	private double buy;
	private double sell;
	
	
	public Product(String name, double buy, double sell) {
		this.name = name;
		this.buy = buy;
		this.sell = sell;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBuy() {
		return buy;
	}


	public void setBuy(double buy) {
		this.buy = buy;
	}


	public double getSell() {
		return sell;
	}


	public void setSell(double sell) {
		this.sell = sell;
	}
	
	public  double percent(double buy, double sell) {
		return 100/buy * (sell - buy);
		
	}
	
	
	public static double allBuy(Product [] other) {
		double allBuy = 0.0;
		for (int i=0;i<other.length;i++) {
			allBuy += other[i].buy;
		}
		return allBuy;
	}
	
	public static double allSee(Product[] other) {
		double allSell = 0.0;
		for (int i=0;i<other.length;i++) {
			allSell += other[i].sell;
		}
		return allSell;
	}
	
	public static double gain(Product [] other) {
		double allBuy = 0.0;
		double allSell = 0.0;
		for (int i=0;i<other.length;i++) {
			allBuy += other[i].buy;
			allSell += other[i].sell;
		}
		return allSell - allBuy;
	}
	
	
	
}
