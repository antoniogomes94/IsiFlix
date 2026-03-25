package com.isiflix.projetoempresa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity								// para indicar que a classe corresponde a uma entidade que armazena dados
@Table(name = "departamento")		// especificar o nome da tabela (porque não coincide com o nome da classe)
@Getter
@Setter
public class Departamento {

    @Id														// informo que o atributo é chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // informo que é auto-increment
    @Column(name = "numero_id")								// especifico o nome do campo
    private int numeroId;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "andar", nullable = false)
    private int andar;

    @OneToMany(mappedBy="depto", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("depto")
    private List<Funcionario> listaFuncionarios;
}