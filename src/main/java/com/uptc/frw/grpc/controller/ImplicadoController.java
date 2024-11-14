package com.uptc.frw.grpc.controller;

import com.uptc.frw.grpc.jpa.models.Implicado;
import com.uptc.frw.grpc.sevice.ImplicadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("implicados")
public class ImplicadoController {
    @Autowired
    private ImplicadoService implicadoService;

    @GetMapping
    public List<Implicado> obtenerImplicado() {
        return implicadoService.obtenerImpliados();
    }

    @GetMapping("{id}")
    public Implicado obtenerImplicad0PorId(@PathVariable long id) {
        return implicadoService.obtenerImplicadoId(id);
    }
    @PostMapping
    public Implicado salvarImplicado(@RequestBody Implicado implicado) {return implicadoService.guardarImplicado(implicado);}
    @PutMapping
    public Implicado actualizarImplicado(@RequestBody Implicado implicado) {return implicadoService.actualizarImplicado(implicado);}
    @DeleteMapping
    public void eliminarAgencia(@RequestParam long id) {implicadoService.eliminarImplicado(id);}
}
