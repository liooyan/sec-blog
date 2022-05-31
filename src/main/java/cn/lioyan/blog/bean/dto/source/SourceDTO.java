package cn.lioyan.blog.bean.dto.source;

import com.sec.autoconfigure.file.FileInfo;

/**
 * {@link SourceDTO}
 *
 * @author com.lioyan
 * @date 2022/5/31  9:53
 */
public class SourceDTO {


    /**
     * 本地资源
     *
     */
    private FileInfo fileInfo;


    public FileInfo getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }
}
