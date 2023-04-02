package com.bilgeadam.service;

import com.bilgeadam.dto.request.SaveRentalRequestDto;
import com.bilgeadam.entity.Rental;
import com.bilgeadam.entity.RentalCar;
import com.bilgeadam.mapper.IRentalMapper;
import com.bilgeadam.repository.IRentalCarRepository;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class RentalCarService extends ServiceManager<RentalCar,Long> {

    private final IRentalCarRepository carCustomerRepository;

    public RentalCarService(IRentalCarRepository carCustomerRepository) {
        super(carCustomerRepository);
        this.carCustomerRepository = carCustomerRepository;
    }
   public void save(Long carId,Long rentalId){
        save(RentalCar.builder()
                .carId(carId)
                .rentalId(rentalId)
                .build());
   }
}
