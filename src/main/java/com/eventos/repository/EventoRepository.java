package com.eventos.repository;

import com.eventos.model.EventoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventoRepository extends JpaRepository<EventoModel, Integer> {

    @Autowired
    List<EventoModel> findByUsrEvt(String nomeUsr);

    @Autowired
    Optional<EventoModel> findById(int idEvt);

}
