package com.zb.mapper;
import com.zb.pojo.Income;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IncomeMapper {

	public Income getIncomeById(@Param(value = "id") Long id)throws Exception;

	public List<Income>	getIncomeListByMap(Map<String,Object> param)throws Exception;

	public Integer getIncomeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertIncome(Income income)throws Exception;

	public Integer updateIncome(Income income)throws Exception;


}
