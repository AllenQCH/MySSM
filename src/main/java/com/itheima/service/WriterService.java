package com.itheima.service;

import com.itheima.domain.Book;
import com.itheima.domain.Writer;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface WriterService {

    /**
     * 保存
     * @param writer
     * @return
     */
    public boolean save(Writer writer);

    /**
     * 修改
     * @param writer
     * @return
     */
    public boolean update(Writer writer);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Writer getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Writer> getAll();
}
