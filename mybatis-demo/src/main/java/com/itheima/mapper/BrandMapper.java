package com.itheima.mapper;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    /*
    * 查询所有
    * */
    List<Brand> selectAll();
    /*
    查看详情
    * */
    Brand selectById(int id);
    /*
    * 条件查询
    * 使用 `@Param("参数名称")` 标记每一个参数，在映射配置文件中就需要使用 `#{参数名称}` 进行占位
    * 将多个参数封装成一个 实体对象 ，将该实体对象作为接口的方法参数。该方式要求在映射配置文件的SQL中使用 `#{内容}` 时，里面的内容必须和实体类属性名保持一致。
    * 将多个参数封装到map集合中，将map集合作为接口的方法参数。该方式要求在映射配置文件的SQL中使用 `#{内容}` 时，里面的内容必须和map集合中键的名称一致。
    *
    * */
    // List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);
    //List<Brand> selectByCondition(Brand brand);

    List<Brand> selectByCondition(Map map);

    /*
    * 单条件动态查询
    * */
    List<Brand> selectByConditionSingle(Brand brand);

    void add(Brand brand);

    int update(Brand brand);

    /*
    根据id删除
    * */
    void deleteById(int id);

    /*
    * 批量删除
    *
    * */
    void deleteByIds(@Param("ids") int[] ids);
}
