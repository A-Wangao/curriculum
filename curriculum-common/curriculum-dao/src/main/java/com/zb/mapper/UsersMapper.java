package com.zb.mapper;
import com.zb.pojo.Users;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {

	public List<Users> getUsers()throws Exception;

	public Users getUsersById(@Param(value = "id") int id)throws Exception;

	public List<Users>	getUsersListByMap(Map<String,Object> param)throws Exception;

	public Integer getUsersCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertUsers(Users users)throws Exception;

	public Integer updateUsers(Users users)throws Exception;


}
