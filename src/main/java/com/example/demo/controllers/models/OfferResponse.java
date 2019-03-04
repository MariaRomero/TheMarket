package com.example.demo.controllers.models;

import lombok.Builder;

@Builder
public class OfferResponse {

    private String description;

    private String currency;

    private String time_stamp;

    private String status;

}
