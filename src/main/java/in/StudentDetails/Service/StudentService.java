package in.StudentDetails.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.StudentDetails.Dao.StudentDao;

@Controller 
public class StudentService {
	
	@Autowired
	public StudentDao dao;
	@RequestMapping("/")
	public String  home(){
		return "home.jsp";
	}
	@RequestMapping("/addstudent")
	public String addstudent(Student stu) {
		
		dao.save(stu);
		return "home.jsp";
	}
	
	
	@RequestMapping("/id")
	public String  id(){
		return "id.jsp";
	}
	@RequestMapping("/getdata")
	public ModelAndView getdata(@RequestParam int id) 
	{
		
		ModelAndView mv= new ModelAndView("show.jsp");
		
		Student stu =dao.findById(id).orElse (new Student()) ;
		mv.addObject(stu);
		return mv;
	}

}
