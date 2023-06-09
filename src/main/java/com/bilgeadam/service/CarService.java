package com.bilgeadam.service;

import com.bilgeadam.dto.request.SaveCarRequestDto;
import com.bilgeadam.entity.Car;
import com.bilgeadam.mapper.ICarMapper;
import com.bilgeadam.repository.ICarRepository;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Car> findAllByNameContainingIgnoreCase(String name){
        return carRepository.findAllByNameContainingIgnoreCase(name);
    }
    public List<Car> findAllByBrandIdIs(int id){
        return carRepository.findAllByBrandIdIs(id);
    }
    public List<Car> findAllByColorIdIs(int id){
        return carRepository.findAllByColorIdIs(id);
    }
    public List<Car> filterCarOnlyColorAndBrand(){
        return carRepository.filterCarOnlyColorAndBrand();
    }
    public List<Car> findAllByDailyPriceLessThanEqual(int price){
        return carRepository.findAllByDailyPriceLessThanEqual(price);
    }




























}
