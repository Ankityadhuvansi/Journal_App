package com.ankit.journalapp.Controller;

import com.ankit.journalapp.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/_Journal")
public class JournalEntryController {

    private Map<Long,JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping
    public boolean create(@RequestBody JournalEntry journalEntry){
//        journalEntries.put(journalEntry.getId(), journalEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getById(@PathVariable Long myId){
        return journalEntries.get(myId);
    }

    @PutMapping("id/{myId}")
    public boolean updateById(@PathVariable Long myId, JournalEntry journalEntry){
        journalEntries.put(myId,journalEntry);
        return true;
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteById(@PathVariable Long myId){
        journalEntries.remove(myId);
        return true;
    }


}
