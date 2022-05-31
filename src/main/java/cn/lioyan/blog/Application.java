package cn.lioyan.blog;

import cn.lioyan.blog.bean.dto.source.GitSourceDTO;
import cn.lioyan.blog.bean.dto.source.SourceDTO;
import cn.lioyan.blog.service.source.GitResourceLoader;
import com.sec.autoconfigure.file.FileInfo;
import com.sec.autoconfigure.file.GeneralFileSystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;


@SpringBootApplication
public class Application {
    public static void main(String[] args) throws IOException {

        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        GeneralFileSystem bean = run.getBean(GeneralFileSystem.class);
        GitResourceLoader gitResourceLoader = new GitResourceLoader();
        bean.mkdirs("git");
        FileInfo fileInfo = bean.getFiles("git");

        GitSourceDTO sourceDTO = new GitSourceDTO();
        sourceDTO.setGitUrl("https://gitee.com/lioyantop/sec-boot.git");
        sourceDTO.setFileInfo(fileInfo);

        gitResourceLoader.pull(sourceDTO);
        gitResourceLoader.pull(sourceDTO);
        gitResourceLoader.pull(sourceDTO);
        gitResourceLoader.pull(sourceDTO);
        gitResourceLoader.pull(sourceDTO);

    }
}
