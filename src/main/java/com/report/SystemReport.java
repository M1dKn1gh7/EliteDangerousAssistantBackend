package com.report;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class SystemReport {

    private final String systemName;
    private final String spectralClass;
    private final int spectralId;
    private final String starImageUrl;

    public SystemReport(@JsonProperty("systemName") String systemName,
                  @JsonProperty("spectralClass") String spectralClass,
                  @JsonProperty("spectralId") int spectralId,
                  @JsonProperty("starImagUrl") String starImageUrl) {

        this.systemName = systemName;
        this.spectralClass = spectralClass;
        this.spectralId  = spectralId;
        this.starImageUrl = starImageUrl;
    }

    public String getSpectralClass() {
        return spectralClass;
    }

    public int getSpectralId() {
        return spectralId;
    }

    public String getStarImageUrl() {
        return starImageUrl;
    }

    public String getSystemName() {
        return systemName;
    }
}
