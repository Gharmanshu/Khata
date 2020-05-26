package com.amazon.khataApp.model;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-22T15:00:10+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@Component
public class BusinessEventToPayloadTranslatorImpl implements BusinessEventToPayloadTranslator {

    @Override
    public EventPayload toBusinessEventDTO(BusinessEvent businessEvent) {
        if ( businessEvent == null ) {
            return null;
        }

        EventPayload eventPayloadDTO = new EventPayload();

        eventPayloadDTO.setSourceId( businessEvent.getSourceId() );
        eventPayloadDTO.setEventType( businessEvent.getEventType() );
        eventPayloadDTO.setCurrency( businessEvent.getCurrency() );
        eventPayloadDTO.setAmount( businessEvent.getAmount() );
        eventPayloadDTO.setMarketplace( businessEvent.getMarketplace() );
        eventPayloadDTO.setAdvertiserId( businessEvent.getAdvertiserId() );
        eventPayloadDTO.setInvoiceId( businessEvent.getInvoiceId() );
        eventPayloadDTO.setProgramId( businessEvent.getProgramId() );
        eventPayloadDTO.setChannel( businessEvent.getChannel() );

        return eventPayloadDTO;
    }

    @Override
    public BusinessEvent toBusinessEvent(EventPayload eventPayloadDTO) {
        if ( eventPayloadDTO == null ) {
            return null;
        }

        BusinessEvent businessEvent = new BusinessEvent();

        businessEvent.setSourceId( eventPayloadDTO.getSourceId() );
        businessEvent.setEventType( eventPayloadDTO.getEventType() );
        businessEvent.setCurrency( eventPayloadDTO.getCurrency() );
        businessEvent.setAmount( eventPayloadDTO.getAmount() );
        businessEvent.setMarketplace( eventPayloadDTO.getMarketplace() );
        businessEvent.setAdvertiserId( eventPayloadDTO.getAdvertiserId() );
        businessEvent.setInvoiceId( eventPayloadDTO.getInvoiceId() );
        businessEvent.setProgramId( eventPayloadDTO.getProgramId() );
        businessEvent.setChannel( eventPayloadDTO.getChannel() );

        return businessEvent;
    }
}
