package com.report;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import me.apemanzilla.edjournal.events.JournalEvent;
import java.time.Instant;

@JsonSerialize
public class Report {

    private final Instant date;
    private final String reportType;

    public Report(@JsonProperty("date") Instant date,
                  @JsonProperty("reportType") String reportType) {
        this.date = date;
        this.reportType = reportType;
    }

    public static Report from(JournalEvent mostRecent) {
        return new Report(mostRecent.getTimestamp(),mostRecent.getEvent());
    }

    public Instant getDate() {
        return date;
    }

    public String getReportType() {
        return reportType;
    }
}
