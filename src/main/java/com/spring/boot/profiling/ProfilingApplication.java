package com.spring.boot.profiling;

import com.spring.boot.profiling.dto.ProductDTO;
import com.spring.boot.profiling.entity.Order;
import com.spring.boot.profiling.entity.Product;
import com.spring.boot.profiling.entity.Specification;
import com.spring.boot.profiling.enums.ProductCategory;
import com.spring.boot.profiling.mapper.ProductMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class ProfilingApplication {

	private static ProductMapper mapper;

	@Autowired
	public ProfilingApplication(ProductMapper mapper) {
		this.mapper = mapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProfilingApplication.class, args);

		ProfilingApplication.testProductMapper();
	}

	public static void testProductMapper(){

		Product mobile=new Product("Nokia", ProductCategory.ELECTRONICS,20000L, new Date());
		mobile.setId(1);
		mobile.setSpecification(new Specification("4GB","2.2GHZ","64GB"));
		mobile.setOrder(new Order(new Date().toString(),String.valueOf(System.currentTimeMillis()),new BigDecimal(20000)));

		ProductDTO productDTO=mapper.productToProductDTO(mobile);

		System.out.println("PRODUCT TO PRODUCT DTO ::: "+productDTO);

		System.out.println("PRODUCT DTO TO PRODUCT ::: "+mapper.productDTOToProduct(productDTO));

	}
}
