package com.isiflix.keywords.controller;

import com.isiflix.keywords.model.Label;
import com.isiflix.keywords.service.LabelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LabelController {

    private LabelService service;

    public LabelController(LabelService service) {
        super();
        this.service = service;
    }

    @PostMapping("/labels")
    public ResponseEntity<Label> addNew(@RequestBody Label label){
        return ResponseEntity.status(201).body(service.createNew(label));
    }

    @GetMapping("/labels")
    public ResponseEntity<List<Label>> getAll(){
        return ResponseEntity.ok(service.readAll());
    }

    @GetMapping("/labels/{keyword}")
    public ResponseEntity<List<Label>> getFromKeyword(@PathVariable String keyword){
        return ResponseEntity.ok(service.readByKeyword(keyword));
    }
}