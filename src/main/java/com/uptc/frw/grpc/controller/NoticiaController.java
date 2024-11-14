package com.uptc.frw.grpc.controller;


import com.uptc.frw.grpc.jpa.models.Noticia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("noticias")
public class NoticiaController {
    @Autowired
    private com.uptc.frw.grpc.sevice.NoticiaService noticiaService;

    @GetMapping
    public List<Noticia> obtenerNoticias() {
        return noticiaService.obtenerNoticias();
    }

    @GetMapping("{id}")
    public Noticia obtenerNoticiaPorId(@PathVariable long id) {
        return noticiaService.obtenerNoticiaId(id);
    }
    @PostMapping
    public Noticia salvarNoticia(@RequestBody Noticia noticia) {return noticiaService.guardarNoticia(noticia);}
    @PutMapping
    public Noticia actualizarNoticia(@RequestBody Noticia noticia) {return noticiaService.actualizarNoticia(noticia);}
    @DeleteMapping
    public void eliminarNoticia(@RequestParam long id) {noticiaService.eliminarNoticia(id);}
}
