package org.example.service;

import cn.sec.core.model.base.page.PageData;
import org.example.bean.dto.DemoDTO;
import org.example.bean.params.demo.DemoAddParam;
import org.example.bean.params.demo.DemoSearchParam;
import org.example.bean.params.demo.DemoUpdateParam;

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
