package com.isiflix.projetoempresa.dao;

import com.isiflix.projetoempresa.model.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioDAO extends CrudRepository<Funcionario, Integer>{

}