package com.ankit.journalapp.Entry;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "journal_entries")
//@Getter
//@Setter
@Data
public class JournalEntry {

    @Id
    private ObjectId id;

    private String title;

    private String content;

    @Field("date")
    private LocalDateTime date;

}