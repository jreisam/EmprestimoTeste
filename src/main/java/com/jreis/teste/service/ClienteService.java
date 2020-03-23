package com.jreis.teste.service;

import com.jreis.teste.domain.Cliente;
import com.jreis.teste.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository bcmsgRepository;

    public List<Cliente> findAll() {
        return bcmsgRepository.findAll();
    }

    public Cliente findById(final Long id) {
        return bcmsgRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(this.getClass().getName() + " not found!"));
    }

    public void save(final Cliente bcmsg) {
        bcmsgRepository.save(bcmsg);
    }

    public void update(Long id, Cliente bcmsg) {
        Cliente clienteOld = findById(id);
        bcmsg.setId(clienteOld.getId());

        bcmsgRepository.save(bcmsg);
    }
}