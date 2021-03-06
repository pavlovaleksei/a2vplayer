package com.cotrollers;

import com.repository.MediaRepository;
import org.springframework.core.io.FileSystemResource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.List;

@RestController
public class PlayerController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(Model model) {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/video-mp4", produces = "video/mp4")
    public FileSystemResource playerMP4(@RequestParam("path") String path) {
        System.out.println("Connect new client mp4");
        System.out.println("Path:: " + path);

        File file = new File("");
        System.out.println(file.getAbsolutePath());
        return new FileSystemResource(path);
    }

    @RequestMapping(value = "/video-ogg", produces = "video/ogg")
    public FileSystemResource playerOgg(@RequestParam("path") String path) {
        System.out.println("Connect new client ogg");
        return new FileSystemResource(path);
    }

    @RequestMapping(value = "/video-webm", produces = "video/webm")
    public FileSystemResource playerWebm(@RequestParam("path") String path) {
        System.out.println("Connect new client webm");
        return new FileSystemResource(path);
    }

    @RequestMapping(value = "/media", method = RequestMethod.GET)
    public List<Object> getMedias() {
        MediaRepository repository = new MediaRepository();
        return repository.getMedias(new File("").getAbsolutePath() + "/player/");
    }
}
