package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResult {
    @JsonProperty
    private String city;
    @JsonProperty
    private String title;
    @JsonProperty
    private String kind;

    @JsonCreator
    public SearchResult(@JsonProperty("city") String city,
                        @JsonProperty("title") String title,
                        @JsonProperty("kind") String kind) {
        this.city = city;
        this.title = title;
        this.kind = kind;
    }

    public String getCity() {
        return city;
    }

    public String getTitle() {
        return title;
    }

    public String getKind() {
        return kind;
    }
}

