package com.bilgeadam.controller;

import com.bilgeadam.dto.request.SaveColorRequestDto;
import com.bilgeadam.entity.Color;
import com.bilgeadam.service.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.bilgeadam.constants.EndPointList.*;

@RestController
@RequestMapping(COLOR)
@RequiredArgsConstructor
public class ColorController {

    private final ColorService colorService;

    @PostMapping(SAVE)
    public ResponseEntity<Color> save(@RequestBody SaveColorRequestDto dto){
        return ResponseEntity.ok(colorService.save(dto));
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Color>> findAll(){
        return ResponseEntity.ok(colorService.findAll());
    }
}
