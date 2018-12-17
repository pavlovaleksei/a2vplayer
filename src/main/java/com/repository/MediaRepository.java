package com.repository;

import com.Models.Media_model;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MediaRepository {

    public List<Media_model> getListMedia(String dir) {
        File playerDirectory = new File(dir);

        List<Media_model> fileList = new ArrayList<>();
        List<Media_model> subdirFileList = new ArrayList<>();
        List<Media_model> returnList = new ArrayList<>();

        fileList.add(new Media_model(dir,
                Arrays.asList(Objects.requireNonNull(playerDirectory.listFiles())),
                Arrays.asList(Objects.requireNonNull(playerDirectory.list())))
        );
        fileList.forEach(v -> {
            v.getFiles().forEach(sv -> {
                if (sv.isDirectory()) {
                    System.out.println("sv is directory");
                    subdirFileList.add(new Media_model(sv.getAbsolutePath(),
                            Arrays.asList(Objects.requireNonNull(sv.listFiles())),
                            Arrays.asList(Objects.requireNonNull(sv.list())))
                    );
                }
            });
        });

        returnList.addAll(fileList);
//        returnList.addAll(subdirFileList);

        return returnList;
    }


}
