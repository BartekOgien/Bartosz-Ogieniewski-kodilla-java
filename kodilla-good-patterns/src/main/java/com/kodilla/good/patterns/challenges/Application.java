package com.kodilla.good.patterns.challenges;


public class Application {

    public static void main(String[] args) {

        ShopRequestRetriever shopRequestRetriever = new ShopRequestRetriever();
        ShopRequest shopRequest = shopRequestRetriever.retrieve();

        ShoppingProcessor shoppingProcessor = new ShoppingProcessor(new MailService(), new OrdersRepository(), new ProductOrderService());
        shoppingProcessor.process(shopRequest);
    }
}
