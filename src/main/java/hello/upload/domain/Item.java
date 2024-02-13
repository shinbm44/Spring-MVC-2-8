package hello.upload.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String itemName;
    private uploadFile attachFile;
    private List<uploadFile> imageFiles;

}
