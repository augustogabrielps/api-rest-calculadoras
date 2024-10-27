package br.com.gotastec.api_rest_calculadoras.service;

import br.com.gotastec.api_rest_calculadoras.model.imc2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.gotastec.api_rest_calculadoras.repository.imc2Repository;

import java.util.List;


@Service
public class imc2Service {
    @Autowired
    private imc2Repository imc2Repository;

    public void registerImc2(imc2 imc2) {
        imc2Repository.save(imc2);
    }
    public List<imc2> findAll(){
        return imc2Repository.findAll();
    }
}
