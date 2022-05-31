package cn.lioyan.blog.service;

import cn.lioyan.blog.bean.dto.FileDTO;
import cn.lioyan.blog.bean.params.file.FileSearchParam;
import cn.sec.core.model.base.page.PageData;
import com.sec.autoconfigure.file.FileInfo;
import org.springframework.web.multipart.MultipartFile;


public interface FileService
{

    void inputDoc(MultipartFile upload);

    PageData<FileDTO> findAll(FileSearchParam fileSearchParam);

    FileInfo getFile(Long id);

    void delete(Long id);
}
