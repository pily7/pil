package look.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import look.product.entity.Project;

public interface ProjectDao {
	//发表文章
	int insertArticle(Project project);
	
	Project findObjectById(String id);
	//用户修改资料
	int updateObject(Project project);
	//注册用户
	 int save(Project project);
	 //通过用户名查找
	 Project findByUname(String uname);
     //实体内容
	List<Map<String,Object>> findPageObjects(@Param("keyword")String keyword,
			@Param("pageCurrent")Integer pageCurrent);
	int getRowCount(@Param("keyword")String keyword);
}
