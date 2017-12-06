package look.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import look.common.web.JsonResult;
import look.product.entity.Project;
import look.product.service.ProjectService;
@RequestMapping("/project/")
@Controller
public class ProjectController {

	@Autowired
	@Qualifier("projectService")
	private ProjectService projectService;
	
	@RequestMapping("index")
	public String listUI(){
		return "index";
	}
	
	@RequestMapping("doLogin")
	public String doLogin(){
		return "signup";
	}
	
	@RequestMapping("doSignup")
	public String doSignup(){
		return "signup";
	}
	
	@RequestMapping("doSave")
	@ResponseBody
	 public  JsonResult updateObject(Project project){
		projectService.save(project);
		return new JsonResult();
		
	}
	
	@RequestMapping("doFindByUname")
	@ResponseBody
	 public  JsonResult findByUname(String uname,String password){
		return new JsonResult(projectService.findByUname(uname, password));
		
	}
	
	@RequestMapping("doFindPageObjects")
	@ResponseBody
	 public  JsonResult findPageObjects(String keyword,Integer pageCurrent){
		return new JsonResult(projectService.findPageObjects(keyword, pageCurrent));
		
	}
}
