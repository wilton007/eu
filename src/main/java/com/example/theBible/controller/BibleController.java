package com.example.theBible.controller;

import com.example.theBible.dtos.BibliaDto;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/home")
public class BibleController {

    @GetMapping
    public BibliaDto home(){
        BibliaDto bibliaDto = new BibliaDto("wilton", 25, "belo Horizonte");
        return bibliaDto;
    }

    @PostMapping
    public BibliaDto criar(@RequestBody BibliaDto bibliaDto){
        return new BibliaDto(bibliaDto.getNome(), bibliaDto.getIdade(), bibliaDto.getCidade());
    }


}
