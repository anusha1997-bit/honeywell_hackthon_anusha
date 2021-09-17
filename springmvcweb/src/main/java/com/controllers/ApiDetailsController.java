package com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.domain.ApiDetails;
import com.domain.Category;

@Controller
public class ApiDetailsController {
	
	
	@GetMapping("/home")
	public ModelAndView getApiDetails(){
		List<Category> categoryList = new ArrayList<Category>();
		for(int i=0;i<2;i++){
			Category cat=new Category();
			cat.setName("Category"+i+1);
			ArrayList<ApiDetails> apiDetails = new ArrayList<ApiDetails>();
			for(int j=0; j<3;j++){
				ApiDetails api = new ApiDetails();
				api.setPrice(100+j);
				api.setName("api"+j+1);
				api.setDetails("api Detailsss"+j+1);
				apiDetails.add(api);
			}
			cat.setApiDetails(apiDetails);
			categoryList.add(cat);
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("categoryList", categoryList);
		return mv;
	}
	
	@GetMapping("/apiDesc")
	public ModelAndView getApiDesc(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("apiDocument");
		return mv;
	}
	
	@GetMapping("/subscribe")
	public ModelAndView subScribe(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("subscribe");
		return mv;
	}
	
	@GetMapping("/request")
	public ModelAndView requestApi(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("requestApi");
		return mv;
	}
	
	@PostMapping("/apiRequest")
	public ModelAndView saveRequestApi(ApiDetails apiDetails){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("requestApi");
		return mv;
	}
		
}
