package cn.lioyan.blog.bean.dto.source;

import com.sec.autoconfigure.file.FileInfo;
import org.eclipse.jgit.api.Git;

import java.net.URL;

/**
 * {@link GitSourceDTO}
 *
 * @author com.lioyan
 * @date 2022/5/31  9:53
 */
public class GitSourceDTO extends SourceDTO {


    /**
     * git连接地址
     */
    private String gitUrl;

    private Git git;

    public Git getGit() {
        return git;
    }

    public void setGit(Git git) {
        this.git = git;
    }


    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }
}
