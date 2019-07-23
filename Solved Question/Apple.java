package main;

public enum Apple {
	Jonathan(10), GoldenDel, RedDel(12), Winesap(15);
	private int price;
	Apple(int p){ price = p;}
	Apple(){ price = -1;}
	int getPrice(){ return price;}
	
	public static void main(String[] args){
        for (Apple s : Apple.values()) { 
            System.out.println(s); 
        }
    }
}
