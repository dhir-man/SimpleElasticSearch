package com.bhn.elasticsearchdemo.repositories;

import com.bhn.elasticsearchdemo.models.SimpleGiftCard;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface SimpleGiftCardRepository extends ElasticsearchRepository<SimpleGiftCard, String>
{
    List<SimpleGiftCard> findByDist(String dist);

    List<SimpleGiftCard> findByMessageContaining(String message);
}
