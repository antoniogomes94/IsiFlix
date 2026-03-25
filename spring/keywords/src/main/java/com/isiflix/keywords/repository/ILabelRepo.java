package com.isiflix.keywords.repository;

import com.isiflix.keywords.model.Label;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ILabelRepo extends ListCrudRepository<Label, Integer> {
    public Label findByValue(String value);
    public List<Label> findByKeywordsKeyword(String keyword);
}