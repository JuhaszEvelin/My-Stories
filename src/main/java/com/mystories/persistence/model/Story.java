package com.mystories.persistence.model;

import org.springframework.data.annotation.Id;

public class Story {

    //MongoDB
    @Id
    public String id;

    public String title;
    public String story;

    public Story() {
    }

    public Story(String title, String story) {
        this.title = title;
        this.story = story;
    }



}
