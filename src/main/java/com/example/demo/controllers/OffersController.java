package com.example.demo.controllers;

import com.example.demo.Offers;
import com.example.demo.controllers.models.OfferResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OffersController {

    @RequestMapping(value = {"/offers" , "/offers/all"}, method = RequestMethod.GET)
    public List<OfferResponse> getAllOffers() {
    return OffersService.getAllOffers();
    }

    @RequestMapping(value = {"/offers/{id}"},method = RequestMethod.GET)
    public ResponseEntity<Object> offers(
            @PathVariable("id") final Optional<String> id

    }
}
