package com.java.dto;

import com.java.model.Event;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import com.java.facade.EventFacade;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)

public class EventDto implements Serializable {

    @EJB
    private EventFacade eventFacade;

    public List<Event> getAllEvents() {
        return eventFacade.findAll();

    }

    public void createEvent(Event event) {

        eventFacade.create(event);
    }

    public void saveAfterEdit(Event event) {

        eventFacade.edit(event);

    }

    private void remove(Event event) {
        eventFacade.remove(event);

    }

    public void deleteEvent(Event event) {
        eventFacade.remove(event);
    }
}
