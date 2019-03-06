package com.example.demo.controllers;

import com.example.demo.controllers.models.CreateOfferRequest;
import com.example.demo.controllers.models.OfferResponse;
import com.example.demo.domain.OfferItem;
import com.example.demo.service.OffersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

import static com.example.demo.domain.OfferItem.*;

@RestController
public class OffersController {

    @RequestMapping(value = {"/offers" , "/offers/all"}, method = RequestMethod.GET)
    public List<OfferResponse> getAllOffers() {
    return OffersService.getAllOffers();
    }

    @RequestMapping(value = {"/offers" , "/create"}, method = RequestMethod.POST)
    public OfferResponse createOfferItem(@RequestBody @NotNull final CreateOfferRequest request) {

    final OfferItem offerItem = OfferItem.builder()
            .name(request.getname())
            .description(request.getdescription())
    return OffersService.createOffer(offerItem);
    }


    @RequestMapping(value = {"/offers/{id}"},method = RequestMethod.GET)
    public ResponseEntity<Object> offers(
            @PathVariable("id") final Optional<String> id

    }
}
