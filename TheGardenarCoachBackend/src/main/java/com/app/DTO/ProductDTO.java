package com.app.DTO;

import org.springframework.beans.BeanUtils;
import org.springframework.web.multipart.MultipartFile;

import com.app.pojos.Product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO 
{
	private int prodid;
	private String pname;
	private String pcat;
	private String subcat;
	private int price;
	private int sellerId;
	private String brand;
	private MultipartFile pic;
	
	public static Product toProductEntity(ProductDTO pdto) {
		Product pEntity=new Product();
		BeanUtils.copyProperties(pdto, pEntity, "pic");		
		return pEntity;
	
	}

}
