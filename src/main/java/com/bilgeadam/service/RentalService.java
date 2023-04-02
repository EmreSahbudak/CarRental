package com.bilgeadam.service;

import com.bilgeadam.dto.request.SaveRentalRequestDto;
import com.bilgeadam.entity.Rental;
import com.bilgeadam.mapper.IRentalMapper;
import com.bilgeadam.repository.IRentalRepository;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class RentalService extends ServiceManager<Rental,Long> {

    private final IRentalRepository rentalRepository;

    private final RentalCarService rentalCarService;

    public RentalService(IRentalRepository rentalRepository, RentalCarService rentalCarService) {
        super(rentalRepository);
        this.rentalRepository = rentalRepository;
        this.rentalCarService = rentalCarService;
    }
    public Rental save(SaveRentalRequestDto dto){
        Rental rental=save(IRentalMapper.INSTANCE.toRental(dto));

        dto.getCarId().forEach(carId ->{
            rentalCarService.save(carId, rental.getId());
        });
        return  rental;
    }
}
