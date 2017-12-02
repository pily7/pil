package look.product.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import look.common.exception.ServiceException;
import look.common.web.PageObject;
import look.product.dao.ProjectDao;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	@Qualifier("projectDao")
	private ProjectDao projectDao;

	@Override
	public Map<String, Object> findPageObjects(String keyword, Integer pageCurrent) {
		if (keyword == null && !"".equals(keyword)) {
			throw new ServiceException("参数值无，pageCurrent=" + pageCurrent);
		}
		
		List<Map<String, Object>> list = projectDao.findPageObjects(keyword, pageCurrent);
		int rowCount = projectDao.getRowCount(keyword);
		
		PageObject pageObject = new PageObject();
		pageObject.setRowCount(rowCount);
		pageObject.setPageCurrent(pageCurrent);
		
		Map<String, Object> map = new HashMap<>();
		map.put("list", list);
		map.put("pageObject", pageObject);
		
		return map;
	}

}
