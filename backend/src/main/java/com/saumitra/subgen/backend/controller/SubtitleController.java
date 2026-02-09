package com.saumitra.subgen.backend.controller;


import com.saumitra.subgen.backend.dto.SubtitleRequest;
import com.saumitra.subgen.backend.dto.SubtitleResponse;
import com.saumitra.subgen.backend.service.SubtitleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SubtitleController {
    private final SubtitleService subtitleService;

    public SubtitleController(SubtitleService subtitleService){
        this.subtitleService = subtitleService;
    }

    @PostMapping("subtitle")
    public SubtitleResponse generateSubtitle(@RequestBody SubtitleRequest subtitleRequest){
        String message = subtitleService.startSubtitleService(subtitleRequest.getVideoUrl());
        return new SubtitleResponse(message, subtitleRequest.getVideoUrl());
    }
}
