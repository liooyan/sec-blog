package org.example.service;

import org.example.bean.dto.FileDTO;
import org.example.bean.params.file.FileSearchParam;
import cn.sec.core.model.base.page.PageData;
import com.sec.autoconfigure.file.FileInfo;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.io.InputStream;

public interface FileService
{

    void inputDoc(MultipartFile upload);

    PageData<FileDTO> findAll(FileSearchParam fileSearchParam);

    FileInfo getFile(Long id);

    void delete(Long id);
}
