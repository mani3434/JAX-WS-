package com.fund.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fund.model.Product;



public class ProductService {

	
	Map<String, String[]> m = new HashMap<>();
	Map<String, List<Product>> m2 = new HashMap<>();
	List<Product> l1 = new ArrayList<>();
	
	public ProductService() {
		m.put("books", new String[]{"MagicOfBigThinking","power of now","know your strength"});
		m.put("movies", new String[]{"vikram veda","dharma durai","premam"});
		m.put("sports", new String[]{"cricket","badminton","carroms"});
		m.put("entertainment", new String[]{"games","movies","talking"});
		
		Product p1 = new Product("java","id232d",854.62);
		Product p2 = new Product("ui","id232d",854.62);
		Product p3 = new Product("db","id232d",854.62);
		
		l1.add(p1); l1.add(p2); l1.add(p3);
		
		m2.put("books", l1);
//		m2.put("movies", new Product("ui","id232d",854.62));
//		m2.put("entertainment", new Product("db","id232d",854.62));
		
	}
	
	
public List<String> getProductCategories (){
		
		List<String> categories = new ArrayList<String>(m.keySet());
		
		return categories;
	}

public String[] getProductByCategory(String s) {
	
	
	if(m.containsKey(s.toLowerCase())) {
		return m.get(s);
	}
	
	return null;
}


public String[] addProduct(String c, String p) {
	
	if(m.containsKey(c)){
		
		String [] f = new String[m.get(c).length+1];
		System.arraycopy(m.get(c), 0, f, 0, m.get(c).length);
		f[f.length-1] = p;
		m.put(c,  f);
	}
	System.out.println(m.get(c));
	System.out.println(m);
	return m.get(c);
}


public List<Product> getProductByCategory2(String s) {
	
	if(m2.containsKey(s)) {
		return m2.get(s);
	}
	
	return null;
}
}
