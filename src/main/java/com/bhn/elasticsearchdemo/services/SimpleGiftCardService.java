package com.bhn.elasticsearchdemo.services;

import com.bhn.elasticsearchdemo.models.SimpleGiftCard;
import com.bhn.elasticsearchdemo.repositories.SimpleGiftCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimpleGiftCardService
{
    @Autowired
    private SimpleGiftCard giftCardRepository;

    public List<SimpleGiftCard> getAllLogDataForDist(String dist) {
    }

    public SimpleGiftCard createLogDataIndex(final SimpleGiftCard data)
    {
        return giftCardRepository.save(data);
    }

    public Iterable<SimpleGiftCard> createLogDataIndices(final List<SimpleGiftCard> dataList)
    {
        return giftCardRepository.saveAll(dataList);
    }

    public List<SimpleGiftCard> getAllLogDataForHost (String dist)
    {
        return giftCardRepository.findByDist(dist);
    }

    public SimpleGiftCard findById (String id)
    {
        return giftCardRepository.findById(id).get();
    }

    public static List<SimpleGiftCard> findBySearchTerm(String term)
    {
        return giftCardRepository.findByMessageContaining(term);
    }
}
