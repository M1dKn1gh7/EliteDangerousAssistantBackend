package com.service;

import com.report.SystemReport;
import me.apemanzilla.edjournal.events.FSDJump;
import org.springframework.stereotype.Component;

@Component
public class SystemReportService {

    private final EDJournalService edJournalService;
    private final EDSMService edsmService;

    public SystemReportService(EDJournalService edJournalService, EDSMService edsmService) {
        this.edJournalService = edJournalService;
        this.edsmService = edsmService;
    }

    public SystemReport getCurrentSystem(){
        String currentSystemName = "Maia";

        return new SystemReport.SystemReportBuilder(currentSystemName)
                .withSpectralClass(lookUpSpectralClass(currentSystemName))
                .withSpectralId(lookUpSpectralId(lookUpSpectralClass(currentSystemName)))
                .withStarImageUrl(buildStarImageUrl(lookUpSpectralId(lookUpSpectralClass(currentSystemName)))).build();
    }

    private String buildStarImageUrl(int spectralId) {
        return null;
    }

    private Integer lookUpSpectralId(String spectralClass) {
        return 0;
    }

    private String lookUpSpectralClass(String currentSystemName) {
        return null;
    }

    private String getCurrentSystemName() {
       return this.edJournalService.getJournalInstance().lastEventOfType(FSDJump.class)
                .map(FSDJump::getStarSystem)
                .orElse("Unknown location");
    }
}
