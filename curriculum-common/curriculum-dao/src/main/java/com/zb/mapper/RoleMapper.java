package com.zb.mapper;
import com.zb.pojo.Role;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {

	public List<Role> getRole()throws Exception;

	public Role getRoleById(@Param(value = "id") int id)throws Exception;

	public List<Role>	getRoleListByMap(Map<String,Object> param)throws Exception;

	public Integer getRoleCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertRole(Role role)throws Exception;

	public Integer updateRole(Role role)throws Exception;


}
