package com.zb.mapper;
import com.zb.pojo.Userrole;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserroleMapper {

	public List<Userrole> getUserrole()throws Exception;

	public Userrole getUserroleById(@Param(value = "id") int id)throws Exception;

	public List<Userrole>	getUserroleListByMap(Map<String,Object> param)throws Exception;

	public Integer getUserroleCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertUserrole(Userrole userrole)throws Exception;

	public Integer updateUserrole(Userrole userrole)throws Exception;


}
