package com.isiflix.keywords.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_keyword")
@Getter
@Setter
public class Keyword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_keyword")
    private Integer id;

    @Column(name = "keyword_value", nullable = false, unique = true)
    private String keyword;
}