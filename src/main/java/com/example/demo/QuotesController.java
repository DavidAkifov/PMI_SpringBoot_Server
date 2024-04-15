package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping(path = "quote")
public class QuotesController {

    private final String[] motivationalQuotes = {
            "Life is like a fight. You need to be tough and determined to win.",
            "Success comes to those who refuse to give up, no matter how many times they fall.",
            "Don't wait for opportunities, create them.",
            "The only limits that exist are the ones you place on yourself.",
            "Every setback is a setup for a comeback.",
            "You're not a failure until you quit trying.",
            "Your destiny is determined by your decisions.",
            "Success is not an accident; it's a result of relentless effort and dedication.",
            "Champions are made when no one is watching.",
            "The harder you work, the luckier you get.",
            "Your dreams are valid, but they won't become a reality without hard work.",
            "Failure is not fatal unless you let it defeat you.",
            "Success is the sum of small efforts repeated day in and day out.",
            "The difference between winners and losers is that winners keep moving forward.",
            "Excuses will always be there for you, but opportunities won't.",
            "Don't fear failure; fear being in the same place next year as you are today.",
            "Believe in yourself even when no one else does.",
            "Success is not about luck; it's about making the right choices and taking action.",
            "If you want to be great, you have to be willing to be misunderstood.",
            "The only way to predict the future is to create it."
    };

    // Function to get a random quote
    private int getRandomNumber() {
        // Create a Random object
        Random random = new Random();

        // Return the quote at the random index
        return random.nextInt(motivationalQuotes.length);
    }

    @GetMapping
    public String getQuote() {
        System.out.println("[LOG] Requested!");
        return motivationalQuotes[getRandomNumber()];
    }
}
