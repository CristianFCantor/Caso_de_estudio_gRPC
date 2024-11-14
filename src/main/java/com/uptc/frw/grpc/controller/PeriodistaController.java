package com.uptc.frw.grpc.controller;

import com.uptc.frw.grpc.jpa.models.Periodista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("periodista")
public class PeriodistaController {
    @Autowired
    private com.uptc.frw.grpc.sevice.PeriodistaService periodistaService;

    @GetMapping
    public List<Periodista> obtenerPeriodistas() {
        return periodistaService.obtenerPeriodistas();
    }

    @GetMapping("{id}")
    public Periodista obtenerPeriodistaPorId(@PathVariable long id) {
        return periodistaService.obtenerPeriodistaId(id);
    }
    @PostMapping
    public Periodista salvarPeriodista(@RequestBody Periodista periodista) {return periodistaService.guardarPeriodista(periodista);}
    @PutMapping
    public Periodista actualizarNoticia(@RequestBody Periodista periodista) {return periodistaService.actualizarPeriodista(periodista);}
    @DeleteMapping
    public void eliminarNoticia(@RequestParam long id) {periodistaService.eliminarPeriodista(id);}
}
