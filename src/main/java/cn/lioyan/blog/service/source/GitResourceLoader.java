package cn.lioyan.blog.service.source;

import cn.lioyan.blog.bean.dto.source.GitSourceDTO;
import cn.lioyan.blog.bean.dto.source.SourceDTO;
import cn.lioyan.blog.exception.ParameterTypeErrorException;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.File;

/**
 * {@link GitResourceLoader}
 *
 * @author com.lioyan
 * @date 2022/5/31  9:54
 */
public class GitResourceLoader implements ResourceLoader {

    @Override
    public void pull(SourceDTO sourceDTO) {
        GitSourceDTO gitSourceDTO = conversionSourceDTOParameter(sourceDTO);
        String path = gitSourceDTO.getFileInfo().getPath();
        if (gitSourceDTO.getGit() == null) {
            try {
                Git git = Git.cloneRepository()
                        .setURI(gitSourceDTO.getGitUrl())
                        .setDirectory(new File(path))
                        .call();
                gitSourceDTO.setGit(git);
            } catch (GitAPIException e) {
                throw ParameterTypeErrorException.newInstance("parameter type error，must be GitSourceDTO");
            }
        } else {
            gitSourceDTO.getGit().pull();
        }

    }


    private GitSourceDTO conversionSourceDTOParameter(SourceDTO sourceDTO) {

        if (sourceDTO instanceof GitSourceDTO) {
            return (GitSourceDTO) sourceDTO;
        }

        throw ParameterTypeErrorException.newInstance("parameter type error，must be GitSourceDTO");
    }
}
