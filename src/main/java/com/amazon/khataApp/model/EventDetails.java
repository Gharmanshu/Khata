package com.amazon.khataApp.model;

import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
public class EventDetails {
    @NonNull
    private String eventId;

    @NonNull
    private String parentId;

    @NonNull
    private LocalDateTime activityDate;

    @NonNull
    private String eventType;

    @NonNull
    private Long marketplaceId;
}
