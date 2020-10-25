package com.example.javaspringbootcovid.Models;

import lombok.Data;

@Data
public class LocationStats {
    private String state;
    private String country;
    private int latestTotalcase;
    private int diffFromPrevday;
    private String diffFromPrevdayString;

}
