package com.kodilla.good.patterns.challenges.challenge2.orders;

import com.kodilla.good.patterns.challenges.challenge2.DTO.ShoppingDTO;
import com.kodilla.good.patterns.challenges.challenge2.informations.InformationService;

public class ShoppingProcessor {

    private InformationService informationService;
    private ShoppingRepository shoppingRepository;
    private ShoppingService shoppingService;

    public ShoppingProcessor(InformationService informationService, ShoppingRepository shoppingRepository, ShoppingService shoppingService) {
        this.informationService = informationService;
        this.shoppingRepository = shoppingRepository;
        this.shoppingService = shoppingService;
    }

    public ShoppingDTO process(ShopRequest shopRequest) {
        boolean isBought = shoppingService.buy(shopRequest.getUser(), shopRequest.getProduct(), shopRequest.getDateOfOrder());
        if(isBought) {
            informationService.inform(shopRequest.getUser());
            shoppingRepository.saveShoppingOrder(shopRequest.getUser(), shopRequest.getProduct(), shopRequest.getDateOfOrder());
            return new ShoppingDTO(shopRequest.getUser(), true);
        }
        else {
            return new ShoppingDTO(shopRequest.getUser(), false);
        }
    }
}
