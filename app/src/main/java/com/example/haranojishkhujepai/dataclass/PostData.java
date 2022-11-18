package com.example.haranojishkhujepai.dataclass;

public class PostData {

    private String id;
    private long timestamp;

    private String title;
    private String description;
    private String location;
    private String phoneNumber;
    private String imageUrl;

    public PostData() {
    }


    public PostData(String id, long timestamp, String title, String description, String location, String phoneNumber, String imageUrl) {
        this.id = id;

        this.timestamp = timestamp;
        this.title = title;
        this.description = description;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }





    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "PostData{" +
                "id='" + id + '\'' +
                ", timestamp=" + timestamp +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
