package com.bilgeadam.service;

import com.bilgeadam.dto.request.SaveCarRequestDto;
import com.bilgeadam.entity.Car;
import com.bilgeadam.mapper.ICarMapper;
import com.bilgeadam.repository.ICarRepository;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CarService extends ServiceManager<Car,Long> {

    private final ICarRepository carRepository;

    public CarService(ICarRepository carRepository) {
        super(carRepository);
        this.carRepository = carRepository;
    }
    public Car save(SaveCarRequestDto dto){
        return save(ICarMapper.INSTANCE.toCar(dto));
    }
}
