package eStoreProduct.DAO;

import java.util.List;

import eStoreProduct.model.Order;
import eStoreProduct.utility.ProductStockPrice;

public interface orderDAO {
	public void insertIntoOrders(Order or, List<ProductStockPrice> al);
}
