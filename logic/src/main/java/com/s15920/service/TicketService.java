package com.s15920.service;

import com.s15920.model.Ticket;

import java.util.List;

public class TicketService implements ITicketService {

    private IDataBroker db;


    public TicketService() {
        this.db = new DataBroker();
    }


    @Override
    public List<Ticket> getTicketsByConcertId(int id) {
        return db.getTicketsByConcertId(id);
    }


    @Override
    public void saveOrUpdate(Ticket ticket) {
        db.saveOrUpdate(ticket);
    }

    @Override
    public void delete(Ticket ticket) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void purchase() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void showDetails() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
