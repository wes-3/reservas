package br.tcc.reservas.controllers;

import br.tcc.reservas.entities.Curso;
import br.tcc.reservas.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    CursoRepository cursoRepository;

    @PostMapping()
    public Curso newCurso(@RequestBody Curso curso){

        System.out.println(curso.getNomeCurso());

        return cursoRepository.save(curso);
    }

    @GetMapping("/all")
    public List<Curso> getCursoLista() {
        return (List<Curso>) cursoRepository.findAll();
    }
}
