package br.com.mastertech.usuario.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;

@FeignClient(name = "cep", url="http://localhost:9000/cep")
public interface CepClient {
    @GetMapping("/{cep}")
    public HashMap<String, Object> getCep(@PathVariable String cep);
}
