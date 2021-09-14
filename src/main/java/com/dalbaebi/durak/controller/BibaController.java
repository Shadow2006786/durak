package com.dalbaebi.durak.controller;

import com.dalbaebi.durak.domain.Card;
import com.dalbaebi.durak.mapper.CardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BibaController {

    private final CardMapper cardMapper;

    @GetMapping
    public String get() {
        Card card = cardMapper.intToCard(18);
        return String.valueOf(cardMapper.CardToInt(card));
    }
}
