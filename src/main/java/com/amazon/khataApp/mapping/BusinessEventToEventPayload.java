package com.amazon.khataApp.mapping;

import com.amazon.khataApp.model.BusinessEvent;
import com.amazon.khataApp.model.EventPayload;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BusinessEventToEventPayload {
    /**
     * Converting business event to EventPayload
     */
    EventPayload toEventPayload(BusinessEvent businessEvent);

    /**
     * converting Eventpayload to BusinessEvent
     */
    //BusinessEvent toBusinessEvent(EventPayload eventPayload);
}
