package com.uptc.frw.grpc.controller;

import com.uptc.frw.grpc.jpa.models.NoticiaAgencia;
import com.uptc.frw.grpc.sevice.NoticiaAgenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("noticiaAgencia")
public class NoticiaAgenciaContoller {
    @Autowired
    private NoticiaAgenciaService notiAgenciaService;

    public List<NoticiaAgencia> obtenernotiAgencia() {
        return notiAgenciaService.obtenerNotiAgencia();
    }

    @GetMapping("{fechaAgencia}")
    public NoticiaAgencia obtNotiAgenciaId(@PathVariable long id) {
        return notiAgenciaService.obtenerNotiAgenciaId(id);
    }
    @PostMapping
    public NoticiaAgencia guardarNotiAgencia(@RequestBody NoticiaAgencia notiAgencia) {return notiAgenciaService.guardarNotiAgencia(notiAgencia);}
    @PutMapping
    public NoticiaAgencia actualizarNotiAgencia(@RequestBody NoticiaAgencia notiAgencia) {return notiAgenciaService.actualizaNotiAgencia(notiAgencia);}
    @DeleteMapping
    public void eliminarNotiAgencia(@RequestParam long id) {notiAgenciaService.borraAgencia(id);}
}