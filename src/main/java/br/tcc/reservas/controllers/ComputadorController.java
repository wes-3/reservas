package br.tcc.reservas.controllers;

import br.tcc.reservas.entities.Computador;
import br.tcc.reservas.repositories.ComputadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/computador")
public class ComputadorController {

    @Autowired
    ComputadorRepository computadorRepository;

    @PostMapping()
    public Computador newComputador(@RequestBody Computador newComputador) {
        return computadorRepository.save(newComputador);
    }


}
