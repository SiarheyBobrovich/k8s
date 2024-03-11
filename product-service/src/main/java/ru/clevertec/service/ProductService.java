package ru.clevertec.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.clevertec.dto.ProductDTO;

public interface ProductService {

    Page<ProductDTO> getAll(Pageable pageable);
}
