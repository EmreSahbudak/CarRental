package com.bilgeadam.service;

import com.bilgeadam.dto.request.SaveBrandRequestDto;
import com.bilgeadam.entity.Brand;
import com.bilgeadam.mapper.IBrandMapper;
import com.bilgeadam.repository.IBrandRepostiroy;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class BrandService extends ServiceManager<Brand,Long> {

    private final IBrandRepostiroy brandRepostiroy;

    public BrandService(IBrandRepostiroy brandRepostiroy) {
        super(brandRepostiroy);
        this.brandRepostiroy = brandRepostiroy;
    }
    public Brand save(SaveBrandRequestDto dto){
        return save(IBrandMapper.INSTANCE.toBrand(dto));
    }
}
