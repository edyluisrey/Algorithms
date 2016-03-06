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
	
	@Override
	public String toString(){
		return "price:"+price+ " name:"+name;
	}
	
}

public class BubbleSort {
   
	public static  void sort(Vector v){
	   int j;
	   boolean flag=true;
	   Object temp;
	   while ( flag )
	   {
	       flag= false;    
	       for( j=0;  j < v.size() -1;  j++ )
	       {    
	    	    VegetarianDish vd= (VegetarianDish)v.elementAt(j); 
	    	    if(vd.greaterThan(v.elementAt(j+1))){
					   flag=true;
					   temp= v.elementAt(j);
					   v.setElementAt(v.elementAt(j+1), j);
					   v.setElementAt(temp, j+1);
				   }
	        }
	   }
	}
	
	public static void main(String[] args) {
		VegetarianDish vd1= new VegetarianDish(3,"Lettuce sandwich");
		VegetarianDish vd2= new VegetarianDish(1,"Broccoli slaw");
		VegetarianDish vd3= new VegetarianDish(2,"Green papaya salad");
		Vector<VegetarianDish> v = new Vector<VegetarianDish>();
		v.add(vd1);
		v.add(vd2);
		v.add(vd3);
		sort(v);
		for (Object o : v) {
		    System.out.print(o + " ");
		}
		
	
	}
}
