package queue;

import java.util.Comparator;

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
 
}
