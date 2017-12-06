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
import look.product.entity.Project;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	@Qualifier("projectDao")
	private ProjectDao projectDao;
	
	@Override
	public void insertArticle(Project project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Project findObjectById(String id) {	
		//1.验证id的有效性
				if(id==null ){
					throw new ServiceException("id的值无效");
				}
				Project p =projectDao.findObjectById(id);
				//3.验证结果是否正确
				if(p==null){
					throw new ServiceException("此记录已经不存在");
				}
		return p ;
	}

	@Override
	public void updateObject(Project project) {
		if(project==null){
			throw new ServiceException("更新数据不能为空");
		}
		int rows = projectDao.updateObject(project);
		if(rows<=0){
			throw new ServiceException("更新失败");
		}		
	}
	
	@Override
	public void save(Project project) {
		if(project == null){
			throw new ServiceException("用户不存在");
		}
		int rows = projectDao.save(project);
		if(rows==-1){
			throw new ServiceException("保存失败");
		}
	}

	@Override
	public Project findByUname(String uname,String password) {
		Project p =projectDao.findByUname(uname);
		if(uname==null){
			throw new ServiceException("请输入用户名");
		}
		if(uname==""){
			throw new ServiceException("请输入用户名");
		}
		if(!p.getPassword().equals(password)){
			throw new ServiceException("密码错误");
		}
		return p ;
	}
	
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
