package com.uptc.frw.grpc.controller;

import com.uptc.frw.grpc.jpa.models.Agencia;
import com.uptc.frw.grpc.sevice.AgenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("agencias")
public class AgenciaController {
    @Autowired
    private AgenciaService agenciaService;

    @GetMapping
    public List<Agencia> obtenerAgencias() {
        return agenciaService.obtenerAgencia();
    }

    @GetMapping("{id}")
    public Agencia obtenerAgenciaPorId(@PathVariable long id) {
        return agenciaService.obtenerAgenciaId(id);
    }
    @PostMapping
    public Agencia salvarAgencia(@RequestBody Agencia agencia) {return agenciaService.guardarAgencia(agencia);}
    @PutMapping
    public Agencia actualizarAgencia(@RequestBody Agencia agencia) {return agenciaService.actualizaAgencia(agencia);}
    @DeleteMapping
    public void eliminarAgencia(@RequestParam long id) {agenciaService.borraAgencia(id);}
}
