package com.isiflix.keywords.service;

import com.isiflix.keywords.exception.ConflictException;
import com.isiflix.keywords.exception.NotFoundException;
import com.isiflix.keywords.model.Keyword;
import com.isiflix.keywords.repository.IKeywordRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeywordService {

    private IKeywordRepo repo;

    public KeywordService(IKeywordRepo repo) {
        this.repo = repo;
    }

    public Keyword create(Keyword keyword) {
        Keyword res = repo.findByKeyword(keyword.getKeyword());
        if (res != null) {
            throw new ConflictException("Keyword already exists");
        }
        return repo.save(keyword);
    }

    public List<Keyword> readAll(){
        return repo.findAll();
    }

    public Keyword readById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new NotFoundException("Keyword not found"));
    }
}