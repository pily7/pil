package look.product.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface ProjectDao {

	List<Map<String,Object>> findPageObjects(@Param("keyword")String keyword,
			@Param("pageCurrent")Integer pageCurrent);
	int getRowCount(@Param("keyword")String keyword);
}
