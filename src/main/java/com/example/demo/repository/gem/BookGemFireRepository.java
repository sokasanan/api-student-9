package com.example.demo.repository.gem;

import com.example.demo.Entity.BookGemfire;
import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.data.gemfire.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookGemFireRepository extends GemfireRepository<BookGemfire, String> {

    @Query("SELECT * FROM /book b WHERE b.id = $1")
    BookGemfire findBookById(String id);

}