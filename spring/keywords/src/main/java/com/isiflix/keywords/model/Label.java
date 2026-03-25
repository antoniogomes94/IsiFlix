package com.isiflix.keywords.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tbl_labels")
@Getter
@Setter
public class Label {
    @Id
    @Column(name = "id_label")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "label_value", unique = true, nullable = false)
    private String  value;

    @ManyToMany
    @JoinTable(name = "tb_labels_keywords",
            joinColumns = @JoinColumn(name = "tb_label_id_label"),
            inverseJoinColumns = @JoinColumn(name = "tb_keyword_id_keyword"))
    private  List<Keyword> keywords;
}
