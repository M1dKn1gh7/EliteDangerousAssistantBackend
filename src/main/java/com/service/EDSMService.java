package com.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EDSMService {

    /**
     * Service designed to call the https://www.edsm.net/en_GB/api-v1 service
     * **/

    final static String EDSM_URL = "https://www.edsm.net/en_GB/api-v1/system?systemName=";
    final static String showId  = "&showId=1";
    final static String showCoordinates = "&showCoordinates=1";
    final static String showPermit = "&showPermit=1";
    final static String showInformation = "&showInformation=1";
    final static String showPrimaryStar = "&showPrimaryStar=1";
    final static String includeHidden = "includeHidden=1";

    private final RestTemplate restTemplate;

    public EDSMService(){
        this.restTemplate = new RestTemplate();
    }

    public Object getSystemInformation(String systemName){
        return this.restTemplate.getForObject(EDSM_URL
                + systemName
                + showId
                + showCoordinates
                + showPermit
                + showInformation
                + showPrimaryStar
                + includeHidden,Object.class);
    }
}
