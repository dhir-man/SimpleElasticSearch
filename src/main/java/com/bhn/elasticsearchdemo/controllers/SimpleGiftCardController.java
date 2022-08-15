package com.bhn.elasticsearchdemo.controllers;

import com.bhn.elasticsearchdemo.models.SimpleGiftCard;
import com.bhn.elasticsearchdemo.services.SimpleGiftCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/betterjavacode/logdata")
public class SimpleGiftCardController
{
    @Autowired
    private SimpleGiftCardService logDataService;

    @GetMapping
    public List<SimpleGiftCard> searchLogDataByDist(@RequestParam("dist") String dist)
    {
        List<SimpleGiftCard> dataList = SimpleGiftCardService.getAllLogDataForDist(dist);

        return dataList;
    }

    @GetMapping("/search")
    public List<SimpleGiftCard> searchLogDataByTerm(@RequestParam("term") String term)
    {
        return SimpleGiftCardService.findBySearchTerm(term);
    }

    @PostMapping
    public SimpleGiftCard addSimpleGiftCard(@RequestBody SimpleGiftCard data)
    {

        return SimpleGiftCardService.createLogDataIndex(data);
    }

    @PostMapping("/createInBulk")
    public  List<SimpleGiftCard> addLogDataInBulk(@RequestBody List<SimpleGiftCard> dataList)
    {
        return (List<SimpleGiftCard>) SimpleGiftCardService.createLogDataIndices(dataList);
    }
}