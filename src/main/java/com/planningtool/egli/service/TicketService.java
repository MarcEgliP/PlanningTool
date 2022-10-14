package com.planningtool.egli.service;

import com.planningtool.egli.exceptions.NotFoundException;
import com.planningtool.egli.models.database.Ticket;
import com.planningtool.egli.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAll() {
        return this.ticketRepository.findAll();
    }

    public Ticket getSingle(Integer id) {
        return this.ticketRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void delete(Integer id) {
        this.ticketRepository.deleteById(id);
    }

    public Ticket save(Ticket ticket) {
        return this.ticketRepository.save(ticket);
    }
}
