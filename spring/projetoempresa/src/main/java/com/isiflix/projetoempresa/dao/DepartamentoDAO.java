package com.isiflix.projetoempresa.dao;

import java.util.List;

import com.isiflix.projetoempresa.model.Departamento;
import org.springframework.data.repository.CrudRepository;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer>{

    //Consultas customizadas
    public List<Departamento> findByOrderByNome();
    public List<Departamento> findByAndar(int andar);
    public List<Departamento> findByOrderByNumeroIdDesc();
    public List<Departamento> findByNumeroIdOrAndar(int id, int andar);

}