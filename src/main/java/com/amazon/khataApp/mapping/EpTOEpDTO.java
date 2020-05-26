package com.amazon.khataApp.mapping;

import com.amazon.khataApp.model.EventPayload;
import com.amazon.khataApp.model.EventPayloadDTO;
import org.springframework.stereotype.Component;

@Component
public class EpTOEpDTO implements EventPayloadToEventPayloadDTO {
    @Override
    public EventPayload toEventPayload(EventPayloadDTO eventPayloadDTO) {
        return null;
    }

    @Override
    public EventPayloadDTO toEventPayloadDTO(EventPayload eventPayload) {
        return null;
    }
}
