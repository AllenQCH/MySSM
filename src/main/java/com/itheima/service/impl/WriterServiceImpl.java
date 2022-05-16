package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.WriterDao;
import com.itheima.domain.Book;
import com.itheima.domain.Writer;
import com.itheima.service.BookService;
import com.itheima.service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WriterServiceImpl implements WriterService {
    @Autowired
    private WriterDao writerDao;

    public boolean save(Writer writer) {
        writerDao.save(writer);
        return true;
    }

    public boolean update(Writer writer) {
        writerDao.update(writer);
        return true;
    }

    public boolean delete(Integer id) {
        writerDao.delete(id);
        return true;
    }

    public Writer getById(Integer id) {
        return writerDao.getById(id);
    }

    public List<Writer> getAll() {
        return writerDao.getAll();
    }
}
