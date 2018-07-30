package com.report;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

@JsonSerialize
public class Report {

    private final Date date;
    private final String reportType;

    public Report(@JsonProperty("date") Date date,
                  @JsonProperty("reportType") String reportType) {
        this.date = date;
        this.reportType = reportType;
    }

    public Date getDate() {
        return date;
    }

    public String getReportType() {
        return reportType;
    }
}
