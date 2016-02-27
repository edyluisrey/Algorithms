package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Customer {
	    private int id;
	    private String name;
	     
	    public Customer(int i, String n){
	        this.id=i;
	        this.name=n;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	 	    
}

public class PriorityCustomer{
	
	static class PQsort implements Comparator<Customer> {		 
		@Override
		public int compare(Customer one, Customer two) {
			return two.getId() - one.getId();
		}
	}
	
	public static void main(String[] args) {
		 PQsort pqs = new PQsort();
		 Queue<Customer> PriorityCustomer = new PriorityQueue<>(2,pqs);
		 Customer  c1= new Customer(4,"Juan");
		 Customer  c2= new Customer(1,"Manuel");
		 Customer  c3= new Customer(2,"Edy");
		 
		 PriorityCustomer.add(c1);
		 PriorityCustomer.add(c2);
		 PriorityCustomer.add(c3);
		 
		 Customer ctm1 = PriorityCustomer.poll();
		 Customer ctm2 = PriorityCustomer.poll();
		 Customer ctm3 = PriorityCustomer.poll();
		 System.out.println(ctm1.getId()+ " : "+ ctm1.getName());
		 System.out.println(ctm2.getId()+ " : "+ ctm2.getName());
		 System.out.println(ctm3.getId()+ " : "+ ctm3.getName());
	      
	}
 
}
