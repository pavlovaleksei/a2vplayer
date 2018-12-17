package com.repository;

import com.Models.Media;

import java.io.File;
import java.util.*;

public class MediaRepository {

    public List<Object> getMedias(String dir) {
        List<Object> result = new ArrayList<>();
        List<File> files = Arrays.asList(Objects.requireNonNull(new File(dir).listFiles()));
        files.forEach(v -> result.add(new Media(v.getName(), v.getPath())));
        return result;
    }
}
