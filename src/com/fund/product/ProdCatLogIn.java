package com.fund.product;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.fund.model.Product;

@WebService(name="mani", portName="mani_soap", serviceName="mani_jax_ws",targetNamespace="mani_product")
public interface ProdCatLogIn {

	@WebMethod(operationName="categories", action="products")
	List<String> getProductCategories();

	@WebMethod
	String[] getProductByCategory(String s);

	@WebMethod
	@WebResult(name="products")
	List<Product> getProductByCategory2(String s);

	@WebMethod
	String[] addProduct(String c, String p);

}