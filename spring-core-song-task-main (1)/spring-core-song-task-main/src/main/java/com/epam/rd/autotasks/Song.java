package com.epam.rd.autotasks;

public class Song {
    private String title;
    private String artist;
    private String year;

    public Song() { }

    public Song(String title, String artist, String year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Song{" +
               "title='" + title + '\'' +
               ", artist='" + artist + '\'' +
               ", year=" + year +
               '}';
    }
}
