package sortSearch;

interface ComparePrices{
	boolean lessThan(Object o);
    boolean greaterThan(Object o);
}

class VegetarianDish implements ComparePrices{
    private int price;
    private String name;
    
    VegetarianDish(int price,String name){
    	this.price=price;
    	this.name=name;
    }
    
	@Override
	public boolean lessThan(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean greaterThan(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

public class BubbleSort {

}
