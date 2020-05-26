package com.amazon.khataApp.mapping;

import com.amazon.khataApp.model.BusinessEvent;
import com.amazon.khataApp.model.EventPayload;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class BeTOEpMapper implements BusinessEventToEventPayload {


    @Override
    public EventPayload toEventPayload(@NonNull BusinessEvent businessEvent) {
        EventPayload eventPayload = new EventPayload();

        eventPayload.setIdempotenceId(businessEvent.getEventDetails().getEventType()+"|"+
                                      businessEvent.getEventDetails().getParentId()+"|"+
                                      businessEvent.getEventDetails().getEventId()+"|"+
                                      businessEvent.getEventDetails().getMarketplaceId());

        eventPayload.setIdempotenceVersion(1L);

        eventPayload.setBusinessEvent(businessEvent);

        eventPayload.setAmount(businessEvent.getAmountDetails().getLocalValue());

        eventPayload.setMarketplaceId(businessEvent.getEventDetails().getMarketplaceId());

        eventPayload.setAccountingEvent("");

        eventPayload.setFolioId("");

        eventPayload.setFailureMessage("");

        eventPayload.setFailureStatus("");

        eventPayload.setProcessAfterTime(LocalDateTime.now());

        eventPayload.setRetryCount(-1);

        eventPayload.setInProcessStatus("YES");

        eventPayload.setExpirationTime(LocalDateTime.MAX);

        eventPayload.setRecordVersion(1L);

        return eventPayload;
    }


}
