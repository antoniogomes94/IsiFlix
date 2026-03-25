package com.isiflix.keywords.repository;

import com.isiflix.keywords.model.Keyword;
import org.springframework.data.repository.ListCrudRepository;

public interface IKeywordRepo extends ListCrudRepository<Keyword, Integer> {
    public Keyword findByKeyword(String keyword);
}