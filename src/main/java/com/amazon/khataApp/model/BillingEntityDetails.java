package com.amazon.khataApp.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class BillingEntityDetails {

    @NonNull
    private String billingEntityId;
}
