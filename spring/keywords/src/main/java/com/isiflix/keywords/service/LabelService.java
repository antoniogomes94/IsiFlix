package com.isiflix.keywords.service;

import com.isiflix.keywords.exception.ConflictException;
import com.isiflix.keywords.exception.NotFoundException;
import com.isiflix.keywords.model.Label;
import com.isiflix.keywords.repository.ILabelRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelService {

    private ILabelRepo repo;

    public LabelService(ILabelRepo repo) {
        super();
        this.repo = repo;
    }

    public Label createNew(Label label) {
        Label res = repo.findByValue(label.getValue());
        if (res != null) {
            throw new ConflictException("Label already exists");
        }
        return repo.save(label);
    }

    public List<Label> readAll(){
        return repo.findAll();
    }

    public Label readById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new NotFoundException("Label not found"));
    }

    public List<Label> readByKeyword(String keyword){
        return repo.findByKeywordsKeyword(keyword);
    }
}