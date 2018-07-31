package com.service;

import com.report.Report;
import me.apemanzilla.edjournal.events.JournalEvent;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.NoSuchElementException;

@Component
public class InformationService {

    private final EDJournalService edJournalService;

    public InformationService(EDJournalService edJournalService) {
        this.edJournalService = edJournalService;
    }

    public Report getLastSystemsAccess() {
       JournalEvent mostRecent = this.edJournalService.getJournalInstance()
                .events()
                .max(Comparator.comparing(JournalEvent::getTimestamp))
                .orElseThrow(NoSuchElementException::new);
       return Report.from(mostRecent);
    }
}
