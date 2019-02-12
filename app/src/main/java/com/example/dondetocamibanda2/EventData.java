package com.example.dondetocamibanda2;

import java.lang.reflect.Array;
import java.util.List;

class EventData {
    private String id;
    private String artist_id;
    private String datetime;
    private String lineup;
    private String on_sale_datetime;
    private String url;
    private List<VenueData> venueData;
    private Array offers;

    public Array getOffers() {
        return offers;
    }

    public void setOffers(Array offers) {
        this.offers = offers;
    }



    public List<VenueData> getVenueData() {
        return venueData;
    }

    public void setVenueData(List<VenueData> venueData) {
        this.venueData = venueData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(String artist_id) {
        this.artist_id = artist_id;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getLineup() {
        return lineup;
    }

    public void setLineup(String lineup) {
        this.lineup = lineup;
    }



    public String getOn_sale_datetime() {
        return on_sale_datetime;
    }

    public void setOn_sale_datetime(String on_sale_datetime) {
        this.on_sale_datetime = on_sale_datetime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



}



