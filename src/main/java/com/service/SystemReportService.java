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
        String currentSystemName = getCurrentSystemName();
        String spectralClass = lookUpSpectralClass(currentSystemName);
        int spectralId = lookUpSpectralId(spectralClass);
        return new SystemReport(getCurrentSystemName(),
                lookUpSpectralClass(currentSystemName),
                lookUpSpectralId(spectralClass),
                buildStarImageUrl(spectralId));
    }

    private String buildStarImageUrl(int spectralId) {
        return null;
    }

    private int lookUpSpectralId(String spectralClass) {
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
