package ru.clevertec.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.clevertec.dto.ProductDTO;
import ru.clevertec.mapper.ProductMapper;
import ru.clevertec.repository.ProductRepository;
import ru.clevertec.service.ProductService;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public Page<ProductDTO> getAll(Pageable pageable) {
        System.gc();
        return productRepository.findAll(pageable)
                .map(productMapper::toProductDTO);
    }
}
