package com.parking.parkinglot.common;

import java.io.Serializable;
import java.util.Objects;

public class CarPhotoDto implements Serializable {
    private String filename;
    private String fileType;
    private byte[] fileContent;
    private Long id;

    public CarPhotoDto(String filename, String fileType, byte[] fileContent, Long id) {
        this.filename = filename;
        this.fileType = fileType;
        this.fileContent = fileContent;
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public String getFileType() {
        return fileType;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public Long getId() {
        return id;
    }


}