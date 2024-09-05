package com.inventoryservice.service;

import com.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private  final InventoryRepository inventoryRepository;
    public boolean isInStock( String skuCode){

        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }
}
