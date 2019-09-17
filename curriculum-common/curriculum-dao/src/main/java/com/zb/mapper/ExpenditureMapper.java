package com.zb.mapper;
import com.zb.pojo.Expenditure;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExpenditureMapper {

	public List<Expenditure> getExpenditure()throws Exception;

	public Expenditure getExpenditureById(@Param(value = "id") int id)throws Exception;

	public List<Expenditure>	getExpenditureListByMap(Map<String,Object> param)throws Exception;

	public Integer getExpenditureCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertExpenditure(Expenditure expenditure)throws Exception;

	public Integer updateExpenditure(Expenditure expenditure)throws Exception;


}
