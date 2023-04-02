package com.bilgeadam.service;

import com.bilgeadam.dto.request.SaveColorRequestDto;
import com.bilgeadam.entity.Color;
import com.bilgeadam.mapper.IColorMapper;
import com.bilgeadam.repository.IColorRepository;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class ColorService extends ServiceManager<Color,Long> {

    private final IColorRepository colorRepository;

    public ColorService(IColorRepository colorRepository) {
        super(colorRepository);
        this.colorRepository = colorRepository;
    }
    public Color save(SaveColorRequestDto dto){
        return save(IColorMapper.INSTANCE.toColor(dto));
    }
}
