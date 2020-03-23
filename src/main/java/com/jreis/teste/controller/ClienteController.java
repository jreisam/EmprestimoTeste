package com.jreis.teste.controller;

import com.jreis.teste.domain.Cliente;
import com.jreis.teste.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping({"/cliente"})
@Slf4j
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        log.info("findAll cliente");
        List<Cliente> response = clienteService.findAll();
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody Cliente cliente) {
        clienteService.save(cliente);

        return ResponseEntity.status(HttpStatus.CREATED)
                .build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> save(@PathVariable("Id") Long id, @Valid @RequestBody Cliente cliente) {
        clienteService.update(id, cliente);

        return ResponseEntity.status(HttpStatus.CREATED)
                .build();
    }

}