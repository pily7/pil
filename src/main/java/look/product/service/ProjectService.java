package look.product.service;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import look.product.entity.Project;

public interface ProjectService {
	void insertArticle(Project project);
	
	Project findObjectById(String id);
	
	void updateObject(Project project);
	
	void save(Project project);
	
	Project findByUname(String uname,String password);
	
	Map<String,Object> findPageObjects(@Param("keyword")String keyword,@Param("pageCurrent")Integer pageCurrent);
	
}
