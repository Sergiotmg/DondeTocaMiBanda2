package com.example.dondetocamibanda2;

import java.util.List;

public class Definitions {
    private List<EventData> EventData;
    private List<VenueData> VenueData;
    private List<ArtistData> ArtistData;
    private List<OfferData> OfferData;

    public List<com.example.dondetocamibanda2.EventData> getEventData() {
        return EventData;
    }

    public void setEventData(List<com.example.dondetocamibanda2.EventData> eventData) {
        EventData = eventData;
    }

    public List<com.example.dondetocamibanda2.VenueData> getVenueData() {
        return VenueData;
    }

    public void setVenueData(List<com.example.dondetocamibanda2.VenueData> venueData) {
        VenueData = venueData;
    }

    public List<com.example.dondetocamibanda2.ArtistData> getArtistData() {
        return ArtistData;
    }

    public void setArtistData(List<com.example.dondetocamibanda2.ArtistData> artistData) {
        ArtistData = artistData;
    }



}
