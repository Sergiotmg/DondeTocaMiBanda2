package com.example.dondetocamibanda2;

public class ArtistData {
    	private String facebook_page_url;
        private String         	image_url;
        private String         	mbid;
        private String         	name;
        private String         	thumb_url;
        private int         	tracker_count;
        private int         	upcoming_event_count;
        private String         	url;

    public String getFacebook_page_url() {
        return facebook_page_url;
    }

    public void setFacebook_page_url(String facebook_page_url) {
        this.facebook_page_url = facebook_page_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getMbid() {
        return mbid;
    }

    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public void setThumb_url(String thumb_url) {
        this.thumb_url = thumb_url;
    }

    public int getTracker_count() {
        return tracker_count;
    }

    public void setTracker_count(int tracker_count) {
        this.tracker_count = tracker_count;
    }

    public int getUpcoming_event_count() {
        return upcoming_event_count;
    }

    public void setUpcoming_event_count(int upcoming_event_count) {
        this.upcoming_event_count = upcoming_event_count;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
