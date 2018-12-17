package com.Models;

import java.io.File;
import java.util.List;
import java.util.Objects;

public class Media_model {

    private String directory;
    private List<File> files;
    private List<String> names;


    public Media_model() {
    }

    public Media_model(String directory, List<File> files, List<String> names) {
        this.directory = directory;
        this.files = files;
        this.names = names;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Media_model{" +
                "directory='" + directory + '\'' +
                ", files=" + files +
                ", names=" + names +
                '}';
    }
}
