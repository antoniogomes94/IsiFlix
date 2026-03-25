package com.isiflix.projetoempresa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "funcionario")
@Getter
@Setter
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_funcional")
    private int numFuncional;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "salario")
    private double salario;

    @ManyToOne
    @JoinColumn(name = "numero_id")
    @JsonIgnoreProperties("listaFuncionarios")
    private Departamento depto;
}
