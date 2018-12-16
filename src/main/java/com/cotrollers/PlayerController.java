package com.cotrollers;

import org.springframework.core.io.FileSystemResource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

@RestController
public class PlayerController {

    private final static File video = new File("6.mkv");

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(Model model) {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test2() {
        System.out.println("test");
        return "test from back";
    }


    @RequestMapping(value = "/video-mp4", produces = "video/mp4")
    public FileSystemResource playerMP4() {
        System.out.println("Connect new client mp4");
        return new FileSystemResource(video);
    }

    @RequestMapping(value = "/video-ogg", produces = "video/ogg")
    public FileSystemResource playerOgg() {
        System.out.println("Connect new client ogg");
        return new FileSystemResource(video);
    }

    @RequestMapping(value = "/video-webm", produces = "video/webm")
    public FileSystemResource playerWebm() {
        System.out.println("Connect new client webm");
        return new FileSystemResource(video);
    }

}
