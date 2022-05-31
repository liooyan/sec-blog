package cn.lioyan.blog.service.source;

import cn.lioyan.blog.bean.dto.source.GitSourceDTO;
import cn.lioyan.blog.bean.dto.source.SourceDTO;
import com.sec.autoconfigure.file.FileInfo;

/**
 * {@link ResourceLoader}
 *
 * 资源加载器，可以有不同渠道获取文档资源
 * @author com.lioyan
 * @date 2022/5/31  9:35
 */
public interface ResourceLoader {



    void  pull(SourceDTO sourceDTO);

}
