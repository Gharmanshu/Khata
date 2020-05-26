package com.amazon.khataApp.mapping;

import com.amazon.khataApp.model.BusinessEvent;
import com.amazon.khataApp.model.EventPayload;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-26T15:19:32+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@Component
public class BusinessEventToEventPayloadImpl implements BusinessEventToEventPayload {

    @Override
    public EventPayload toEventPayload(BusinessEvent businessEvent) {
        if ( businessEvent == null ) {
            return null;
        }

        EventPayload eventPayload = new EventPayload();

        eventPayload.setBusinessEvent( businessEvent );

        return eventPayload;
    }
}
