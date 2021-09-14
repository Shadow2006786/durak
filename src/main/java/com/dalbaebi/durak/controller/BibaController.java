package com.dalbaebi.durak.controller;

import com.dalbaebi.durak.domain.Card;
import com.dalbaebi.durak.domain.CardType;
import com.dalbaebi.durak.domain.Suit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BibaController {

    @GetMapping
    public String get() {
        Card.fromInt(38);
        return "sadmlkoasmjdoipadmo";
    }
}
