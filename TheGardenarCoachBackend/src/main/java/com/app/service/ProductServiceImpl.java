package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.Dao.ProductDao;
import com.app.pojos.Product;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductDao pdao;
	
	@Autowired
	private ISellerService  sService;
	
	@Override
	public void addProduct(Product p, MultipartFile pic) 
	{
		//remain to write code
		
	}

	@Override
	public List<Product> findProducts(int sellerId) {
		
		return pdao.findBySeller(sService.findById(sellerId),Sort.by(Sort.Direction.DESC,"prodid"));
	}

	@Override
	public void updateProduct(Product p) 
	{
		Product prod = pdao.getById(p.getProdid());
		p.setSeller(prod.getSeller());
		pdao.save(prod);
				
		
		
	}

	@Override
	public void deleteProduct(int prodid) {
		Product prod = pdao.getById(prodid);
		pdao.delete(prod);
		
	}

	@Override
	public List<Product> allProducts() {
		
		return pdao.findAll(Sort.by(Sort.Direction.DESC,"prodid"));
	}

	@Override
	public List<Product> categoryProducts(String pcat, String subcat) {
	
		return pdao.findByPcat(pcat, Sort.by(Sort.Direction.DESC,"prodid"));
	}

	@Override
	public Product findProductById(int prodid) {
		
		return pdao.getById(prodid);
	}

	@Override
	public Page<Product> allProductsPaginated(int page, int pagesize) {
		Page<Product> prods=pdao.findAll(PageRequest.of(page, pagesize,Sort.by(Direction.DESC, "prodid")));
		System.err.println(prods.getSize());
		return prods;
	
	}

}
