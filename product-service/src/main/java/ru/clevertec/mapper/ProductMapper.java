package ru.clevertec.mapper;

import org.mapstruct.Mapper;
import ru.clevertec.dto.ProductDTO;
import ru.clevertec.entity.Product;

@Mapper
public interface ProductMapper {

    ProductDTO toProductDTO(Product product);
}
