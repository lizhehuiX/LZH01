package com.bw.utils;

import org.springframework.ui.Model;

import com.github.pagehelper.PageInfo;

public class PageUtils {
	
	public static void fenye(Model model,PageInfo info ,String url){
		//判断当前页大于邓等于最后一页//当前页就是最后一页
		if(info.getPageNum()>=info.getPages()){
			//下一页时就是最后一页
			info.setNextPage(info.getPages());
		}
		//当前页小于等于1时就是第一页
		if(info.getPageNum()<=1){
			info.setPrePage(1);
		}		
		String fenye="当前页："+info.getPageNum()+"/"+info.getPages()
				+"页--共" + info.getTotal()
				+ "条数据&nbsp;&nbsp;"
				+ "<a href='list?pageNum=1"+url+"'>首页</a>"
				+ "<a href='list?pageNum="+info.getPrePage()+url+"'>上一页</a>"
				+ "<a href='list?pageNum="+info.getNextPage()+url+"'>下一页</a>"
				+ "<a href='list?pageNum="+info.getPages()+url+"'>尾页</a>"
				+ "<input style='width: 35px;' type='text' class='skip' value=''>" + 
				"<input type='button' value='跳轉' onclick='skip()'> ";	
		model.addAttribute("fenye",fenye);
	}
}
