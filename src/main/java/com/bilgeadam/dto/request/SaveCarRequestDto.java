package com.bilgeadam.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveCarRequestDto {

    private String name;
    private String modelYear;
    private String dailyPrice;
    private String description;

    private Integer brandId;

    private Integer colorId;
}
