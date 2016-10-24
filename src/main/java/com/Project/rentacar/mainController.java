package com.Project.rentacar;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mainController {
	
	ModelAndView mav = new ModelAndView();
	
	
	@RequestMapping(value="/main.do")
	public ModelAndView main(){
		mav.setViewName("main");
		return mav;
	}
	
}
