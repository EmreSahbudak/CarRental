package com.bilgeadam.mapper;

import com.bilgeadam.dto.request.SaveBrandRequestDto;
import com.bilgeadam.entity.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IBrandMapper {

    IBrandMapper INSTANCE= Mappers.getMapper(IBrandMapper.class);

    Brand toBrand(SaveBrandRequestDto dto);
}
