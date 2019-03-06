package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;

@Data
@Builder
public class OfferItem {

    private final Id id;

    private final String name;

    private final String description;

    private final String currency;

    private String time_stamp;

    private String status;

}
