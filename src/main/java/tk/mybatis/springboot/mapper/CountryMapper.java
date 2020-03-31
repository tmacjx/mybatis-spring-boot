package tk.mybatis.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.springboot.model.Country;

import java.util.List;

@Mapper
public interface CountryMapper {

    List<Country> selectAll();

}
