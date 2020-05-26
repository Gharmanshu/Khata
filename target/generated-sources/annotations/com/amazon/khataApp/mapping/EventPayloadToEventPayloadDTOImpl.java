package com.amazon.khataApp.mapping;

import com.amazon.khataApp.model.EventPayload;
import com.amazon.khataApp.model.EventPayloadDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-26T15:19:32+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@Component
public class EventPayloadToEventPayloadDTOImpl implements EventPayloadToEventPayloadDTO {

    @Override
    public EventPayload toEventPayload(EventPayloadDTO eventPayloadDTO) {
        if ( eventPayloadDTO == null ) {
            return null;
        }

        EventPayload eventPayload = new EventPayload();

        eventPayload.setIdempotenceId( eventPayloadDTO.getIdempotenceId() );
        eventPayload.setIdempotenceVersion( eventPayloadDTO.getIdempotenceVersion() );
        eventPayload.setBusinessEvent( eventPayloadDTO.getBusinessEvent() );
        eventPayload.setAmount( eventPayloadDTO.getAmount() );
        eventPayload.setMarketplaceId( (long) eventPayloadDTO.getMarketplaceId() );
        eventPayload.setAccountingEvent( eventPayloadDTO.getAccountingEvent() );
        eventPayload.setFolioId( eventPayloadDTO.getFolioId() );
        eventPayload.setFailureMessage( eventPayloadDTO.getFailureMessage() );
        eventPayload.setFailureStatus( eventPayloadDTO.getFailureStatus() );
        eventPayload.setProcessAfterTime( eventPayloadDTO.getProcessAfterTime() );
        eventPayload.setRetryCount( eventPayloadDTO.getRetryCount() );
        eventPayload.setInProcessStatus( eventPayloadDTO.getInProcessStatus() );
        eventPayload.setCreationTime( eventPayloadDTO.getCreationTime() );
        eventPayload.setExpirationTime( eventPayloadDTO.getExpirationTime() );
        eventPayload.setRecordVersion( eventPayloadDTO.getRecordVersion() );

        return eventPayload;
    }

    @Override
    public EventPayloadDTO toEventPayloadDTO(EventPayload eventPayload) {
        if ( eventPayload == null ) {
            return null;
        }

        EventPayloadDTO eventPayloadDTO = new EventPayloadDTO();

        eventPayloadDTO.setIdempotenceId( eventPayload.getIdempotenceId() );
        eventPayloadDTO.setIdempotenceVersion( eventPayload.getIdempotenceVersion() );
        if ( eventPayload.getMarketplaceId() != null ) {
            eventPayloadDTO.setMarketplaceId( eventPayload.getMarketplaceId().intValue() );
        }
        eventPayloadDTO.setAmount( eventPayload.getAmount() );
        eventPayloadDTO.setBusinessEvent( eventPayload.getBusinessEvent() );
        eventPayloadDTO.setAccountingEvent( eventPayload.getAccountingEvent() );
        eventPayloadDTO.setFolioId( eventPayload.getFolioId() );
        eventPayloadDTO.setFailureMessage( eventPayload.getFailureMessage() );
        eventPayloadDTO.setFailureStatus( eventPayload.getFailureStatus() );
        eventPayloadDTO.setProcessAfterTime( eventPayload.getProcessAfterTime() );
        eventPayloadDTO.setRetryCount( eventPayload.getRetryCount() );
        eventPayloadDTO.setInProcessStatus( eventPayload.getInProcessStatus() );
        eventPayloadDTO.setCreationTime( eventPayload.getCreationTime() );
        eventPayloadDTO.setExpirationTime( eventPayload.getExpirationTime() );
        eventPayloadDTO.setRecordVersion( eventPayload.getRecordVersion() );

        return eventPayloadDTO;
    }
}
