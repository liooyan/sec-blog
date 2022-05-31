package cn.lioyan.blog.service;

import cn.sec.core.model.base.page.PageData;
import cn.lioyan.blog.bean.dto.DemoDTO;
import cn.lioyan.blog.bean.params.demo.DemoAddParam;
import cn.lioyan.blog.bean.params.demo.DemoSearchParam;
import cn.lioyan.blog.bean.params.demo.DemoUpdateParam;

import java.util.List;

public interface DemoService
{
    void delete(Long id);

    DemoDTO update(DemoUpdateParam policyUpdateParam);

    List<DemoDTO> installBatch(List<DemoAddParam> datas);

    DemoDTO install(DemoAddParam policyAddParam);

    DemoDTO getOne(Long id);

    PageData<DemoDTO> findAll(DemoSearchParam policySearchParam);
}
