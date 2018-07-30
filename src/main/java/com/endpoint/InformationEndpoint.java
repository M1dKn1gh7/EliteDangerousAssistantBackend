package com.endpoint;

import com.report.Report;
import com.service.InformationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/information")
public class InformationEndpoint {

    private final InformationService informationService;

    public InformationEndpoint(InformationService informationService) {
        this.informationService = informationService;
    }

    @GetMapping(path = "last_systems_access", produces = "application/json")
    public Report getLastSystemsAccess(){
        return this.informationService.getLastSystemsAccess();
    }
}
