package com.fund.product;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.fund.model.Product;
import com.fund.service.ProductService;

@WebService(endpointInterface="com.fund.product.ProdCatLogIn")
public class ProductCatalog implements ProdCatLogIn  {

	ProductService ps = new ProductService();

	/* (non-Javadoc)
	 * @see com.fund.product.ProdCatLogIn#getProductCategories()
	 */
	@Override
		public List<String> getProductCategories(){
		
		return ps.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see com.fund.product.ProdCatLogIn#getProductByCategory(java.lang.String)
	 */
	@Override
	@WebMethod //(exclude=true)
	public String[] getProductByCategory(String s){
		
		return ps.getProductByCategory(s);
	}
	
	/* (non-Javadoc)
	 * @see com.fund.product.ProdCatLogIn#getProductByCategory2(java.lang.String)
	 */
	@Override
	@WebMethod 
	public List<Product> getProductByCategory2(String s){
		
		return ps.getProductByCategory2(s);
	}

	/* (non-Javadoc)
	 * @see com.fund.product.ProdCatLogIn#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	@WebMethod //(exclude=true)
	public String[] addProduct(String c, String p) {
		
		return ps.addProduct(c,p);
	}
	
}
