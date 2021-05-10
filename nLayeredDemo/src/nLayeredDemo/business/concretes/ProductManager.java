package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId()==1) {
			System.out.println("Currently, no items are accepting in this category!");
			return;
		}	
		this.productDao.add(product);	
		this.loggerService.logToSystem("Product is added:" + product.getName());
	}
	
	@Override
	public List<Product> getAll() {
		return null;
	}

}
