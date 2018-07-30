package com.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/journal")
public class JournalEndpoint {

    @GetMapping(path = "get", produces = "application/json")
    public String getJournal(){
      return null;
    }
}
