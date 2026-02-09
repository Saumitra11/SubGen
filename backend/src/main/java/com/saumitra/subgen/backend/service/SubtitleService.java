package com.saumitra.subgen.backend.service;


import org.springframework.stereotype.Service;

@Service
public class SubtitleService {
    public String startSubtitleService(String videoUrl){
        return "Subtitle Generation Started";
    }
}
