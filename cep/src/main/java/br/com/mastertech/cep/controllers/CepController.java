package br.com.mastertech.cep.controllers;

import br.com.mastertech.cep.client.CepClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class CepController {

    @Autowired
    private CepClient cepClient;

    @GetMapping("/{cep}")
    public HashMap<String, Object> getCep(@PathVariable String cep) {
        return cepClient.getByCep(cep);
    }
}
