package com.example.demo.controllers.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Builder
@Getter@Setter
public class CreateOfferRequest {

    private final Id id;

    @NotNull @NotEmpty
    private final String name;

    @NotNull @NotEmpty
    private String description;

    @NotNull @NotEmpty
    private String currency;

    private String time_stamp;

    private String status;









    public CreateOfferRequest(Id id) {
        this.id = id;
    }


}
