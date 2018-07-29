package com.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/journal")
public class JournalEndpoint {

    @GetMapping(path = "get")
    public String getJournal(){
        return "you have got a journal!";
    }

    @PostMapping(path = "post")
    public void postJournal(){
        System.out.println("posting journal");
    }
}
