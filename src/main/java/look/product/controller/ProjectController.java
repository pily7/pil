package look.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import look.common.web.JsonResult;
import look.product.service.ProjectService;

@Controller
public class ProjectController {

	@Autowired
	@Qualifier("projectService")
	private ProjectService projectService;
	
	@RequestMapping("findPageObjects")
	@ResponseBody
	 public  JsonResult findPageObjects(String keyword,Integer pageCurrent){
		return new JsonResult(projectService.findPageObjects(keyword, pageCurrent));
		
	}
}
