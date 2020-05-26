package com.amazon.khataApp.model;

import lombok.Data;
import lombok.NonNull;

import java.util.Map;

@Data
public class BusinessEvent {
    @NonNull
    private SourceDetails sourceDetails;

    @NonNull
    private EventDetails eventDetails;

    @NonNull
    private AmountDetails amountDetails;

    @NonNull
    private BillingEntityDetails billingEntityDetails;

    @NonNull
    private Map<String, String> additionalDetails;
}
