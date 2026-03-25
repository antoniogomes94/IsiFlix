package com.isiflix.keywords.controller;

import com.isiflix.keywords.model.Keyword;
import com.isiflix.keywords.service.KeywordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KeywordController {

    private KeywordService service;

    public KeywordController(KeywordService service) {
        super();
        this.service = service;
    }

    @PostMapping("/keywords")
    public ResponseEntity<Keyword> addNew(@RequestBody Keyword newKeyword){
        return ResponseEntity.status(201).body(service.create(newKeyword));
    }

    @GetMapping("/keywords")
    public ResponseEntity<List<Keyword>> getAll(){
        return ResponseEntity.ok(service.readAll());
    }

    @GetMapping("/keywords/{id}")
    public ResponseEntity<Keyword> getById(@PathVariable Integer id){
        return ResponseEntity.ok(service.readById(id));
    }
}