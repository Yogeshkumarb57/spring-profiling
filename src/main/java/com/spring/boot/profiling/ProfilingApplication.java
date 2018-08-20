package com.spring.boot.profiling;

import com.spring.boot.profiling.dto.ProductDTO;
import com.spring.boot.profiling.entity.Product;
import com.spring.boot.profiling.enums.ProductCategory;
import com.spring.boot.profiling.mapper.ProductMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import java.util.Date;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class ProfilingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfilingApplication.class, args);

		//ProfilingApplication.testProductMapper();
	}

	public static void testProductMapper(){

		Product mobile=new Product("Nokia", ProductCategory.ELECTRONICS,20000L, new Date());
		mobile.setId(1);

		ProductDTO productDTO=ProductMapper.mapper.productToProductDTO(mobile);

		System.out.println("PRODUCT TO PRODUCT DTO ::: "+productDTO);

		System.out.println("PRODUCT DTO TO PRODUCT ::: "+ProductMapper.mapper.productDTOToProduct(productDTO));

	}
}
