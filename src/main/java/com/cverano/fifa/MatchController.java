package com.cverano.fifa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {
    @Autowired

    private MatchService mservice;

    @GetMapping("/display")
    public List<Matches> getAllMatches() {
        return mservice.getAllMatches();
    }

    @GetMapping("/all")
    public String getAllM() {
        return mservice.getAllMatches().toString();
    }
}
