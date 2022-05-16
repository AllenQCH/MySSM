package com.itheima.dao;

import com.itheima.domain.Book;
import com.itheima.domain.Writer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface WriterDao {

    @Insert("insert into tbl_writer (name,birth,gender,country) values(#{name},#{birth},#{gender},#{country})")
    public void save(Writer writer);

    @Update("update tbl_writer set name = #{name}, birth = #{birth}, gender = #{gender}, country = #{country} where id = #{id}")
    public void update(Writer writer);

    @Delete("delete from tbl_writer where id = #{id}")
    public void delete(Integer id);

    @Select("select * from tbl_writer where id = #{id}")
    public Writer getById(Integer id);

    @Select("select * from tbl_writer")
    public List<Writer> getAll();
}
