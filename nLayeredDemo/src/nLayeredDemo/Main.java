package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
			
		ProductService productservice = new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter());
		Product product = new Product(1,2,"Apple",12,50);
		productservice.add(product);
		// No items are accepting in category 1! So, output will be:
		//Currently, no items are accepting in this category!
	}

}
 