package com.amazon.khataApp.mapping;

import com.amazon.khataApp.model.EventPayload;
import com.amazon.khataApp.model.EventPayloadDTO;
import lombok.NonNull;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventPayloadToEventPayloadDTO {

    /**
     * Converting EventPayloadDTO to EventPayload
     */
    EventPayload toEventPayload(@NonNull EventPayloadDTO eventPayloadDTO);

    /**
     * Converting EventPayload to EventPayloadDTO
     */
    EventPayloadDTO toEventPayloadDTO(@NonNull EventPayload eventPayload);
}
