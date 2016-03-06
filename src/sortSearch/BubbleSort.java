package sortSearch;

import java.util.Vector;

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
		VegetarianDish vd2= (VegetarianDish) o;
		return price > vd2.price;
	}
	
}

public class BubbleSort {
   
	public static  void sort(Vector<Object> v){
	   int pass,j;
	   boolean flag=true;
	   for(pass=0;pass< (v.size()-1) && flag; pass++){
		   flag=false;
		   for(j=0;j< v.size()-(pass-1);j++){
			   VegetarianDish vd= (VegetarianDish)v.elementAt(j);
			   if(vd.greaterThan(v.elementAt(j+1))){
				   flag=true;
				   Object temp= v.elementAt(j);
				   v.setElementAt(v.elementAt(j+1), j);
				   v.setElementAt(temp, j+1);
			   }
					   
		   }
	   }
	}
}
