package com.Eventoapplication.Eventoapp.repository;

import com.Eventoapplication.Eventoapp.models.Convidado;
import com.Eventoapplication.Eventoapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
    Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByRg(String rg);
}
