package com.amazon.khataApp.model;

import com.amazon.khataApp.mapping.BeTOEpMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class TestClass {
    public static void main(String[] args) throws JsonProcessingException {
        BeTOEpMapper mapIt = new BeTOEpMapper();
        SourceDetails sourceDetails = new SourceDetails("ADEPT");
        EventDetails eventDetails = new EventDetails("1","PARENT1", LocalDateTime.now(),"CLICKS", (long) 1);
        AmountDetails amountDetails = new AmountDetails("USD",BigDecimal.valueOf(1),"INR",BigDecimal.valueOf(70));
        BillingEntityDetails billingEntityDetails = new BillingEntityDetails("Billing");
        Map<String, String> myMap = new HashMap<String,String>();
        myMap.put("programId","102");
        myMap.put("channel","MFN");
        BusinessEvent businessEvent = new BusinessEvent(sourceDetails,eventDetails,amountDetails,billingEntityDetails,myMap);
        EventPayload eventPayload=mapIt.toEventPayload(businessEvent);
        System.out.println(eventPayload);
        ObjectMapper mapper  = new ObjectMapper();
        String jkson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(eventDetails);
        System.out.println(jkson);
    }
}
