package com.bilgeadam.controller;

import com.bilgeadam.dto.request.SaveCarRequestDto;
import com.bilgeadam.entity.Car;
import com.bilgeadam.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.bilgeadam.constants.EndPointList.*;

@RestController
@RequestMapping(CAR)
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @PostMapping(SAVE)
    public ResponseEntity<Car> save(@RequestBody SaveCarRequestDto dto){
        return ResponseEntity.ok(carService.save(dto));
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Car>> findAll(){
        return ResponseEntity.ok(carService.findAll());
    }
    @GetMapping("/find-all-contains-name")
    public ResponseEntity<List<Car>> findAllByNameContainingIgnoreCase(String name){
        return ResponseEntity.ok(carService.findAllByNameContainingIgnoreCase(name));
    }

}
