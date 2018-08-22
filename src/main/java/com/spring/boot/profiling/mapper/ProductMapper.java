package com.spring.boot.profiling.mapper;

import com.spring.boot.profiling.dto.ProductDTO;
import com.spring.boot.profiling.dto.SpecificationDTO;
import com.spring.boot.profiling.entity.Product;
import com.spring.boot.profiling.entity.Specification;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    //ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

    @Mappings({
            @Mapping(source = "name",target="productName"),
            @Mapping(source = "id",target = "productId"),
            @Mapping(source = "manufacturingDate",target = "manufacturingDate",dateFormat = "dd-MM-yyyy HH:mm:ss"),
            @Mapping(source = "product.order.id",target = "orderId"),
            @Mapping(source = "product.order.value",target = "orderValue"),
            @Mapping(source = "product.order.date",target = "orderDate")
    })
    ProductDTO productToProductDTO(Product product);

    @Mappings({
            @Mapping(target = "name",source="productName"),
            @Mapping(target = "id",source = "productId"),
            @Mapping(source = "manufacturingDate",target = "manufacturingDate",dateFormat = "dd-MM-yyyy HH:mm:ss"),
            @Mapping(target = "order.id",source = "orderId"),
            @Mapping(target = "order.value",source = "orderValue",numberFormat = "#.0000"),
            @Mapping(target = "order.date",source = "orderDate",dateFormat = "dd-MM-yyyy HH:mm:ss"),
    })
    Product productDTOToProduct(ProductDTO productDTO);

    SpecificationDTO specificationDTOToSpecification(Specification specification);

    Specification specificationToSpecificationDTO(SpecificationDTO specificationDTO);

}
