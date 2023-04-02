package com.bilgeadam.controller;

import com.bilgeadam.dto.request.SaveRentalRequestDto;
import com.bilgeadam.entity.Rental;
import com.bilgeadam.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static  com.bilgeadam.constants.EndPointList.*;

@RestController
@RequestMapping(RENTAL)
@RequiredArgsConstructor
public class RentalController {

    private final RentalService rentalService;

    @PostMapping(SAVE)
    public ResponseEntity<Rental> save(@RequestBody SaveRentalRequestDto dto){
        return ResponseEntity.ok(rentalService.save(dto));
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Rental>> findAll(){
        return ResponseEntity.ok(rentalService.findAll());
    }
}
