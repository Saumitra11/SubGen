package com.saumitra.subgen.backend.dto;

public class SubtitleResponse {
    private String message;
    private String videoUrl;

    public SubtitleResponse(String message, String videoUrl){
        this.message = message;
        this.videoUrl = videoUrl;
    }

    public String getMessage(){
        return message;
    }

    public String getVideoUrl(){
        return videoUrl;
    }
}
