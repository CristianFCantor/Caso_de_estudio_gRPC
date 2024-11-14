package com.uptc.frw.grpc.jpa.repository;

import com.uptc.frw.grpc.jpa.models.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
}
