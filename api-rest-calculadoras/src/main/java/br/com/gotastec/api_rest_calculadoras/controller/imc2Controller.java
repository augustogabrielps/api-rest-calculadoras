package br.com.gotastec.api_rest_calculadoras.controller;

import br.com.gotastec.api_rest_calculadoras.model.imc2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.gotastec.api_rest_calculadoras.service.imc2Service;

import java.util.List;

@RestController
@RequestMapping({"/api/v1/imc2"})

public class imc2Controller {

    @Autowired
    private imc2Service imc2Service;

    @PostMapping
    public ResponseEntity<imc2> registerImc2(@RequestBody imc2 registerImc2) {
        imc2Service.registerImc2(registerImc2);
        return ResponseEntity.badRequest().body(registerImc2);
    }
    @GetMapping
    public ResponseEntity<List<imc2>> getImcList(){
        return ResponseEntity.ok().body(imc2Service.findAll());


    }
}
