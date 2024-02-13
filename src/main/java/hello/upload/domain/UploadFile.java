package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    //업로드 된 파일 이름
    private String uploadFileName;
    //시스템에 저장할 파일 이름(같은 이름의 파일명으로 저장된다면 파일이 덮어진다.)
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
