package com.sistema_apostila.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_apostila.app.models.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, String>{

    Tarefa findByIdTarefa(long idTarefa);
}
