package com.rosam.product.service.impl;

import com.rosam.product.dataobject.ProductInfo;
import com.rosam.product.enums.ProductStatusEnum;
import com.rosam.product.repository.ProductInfoRepository;
import com.rosam.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
   public List<ProductInfo> findUpAll(){
        System.out.println();
        System.out.println();
        
            return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    public static void main(String[] args) {

    }
}
