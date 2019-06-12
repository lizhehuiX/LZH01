package com.bw.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bw.entity.Goods;
import com.bw.service.BrandService;
import com.bw.service.GKService;
import com.bw.service.GoodsService;
import com.bw.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author Lizhehui
 *  15点54分
 * */
@Controller
public class MyController {
	@Resource
	private GoodsService gservice;
	@Resource
	private BrandService bservice;
	@Resource
	private GKService gkservice;

	/**
	 * Description:TODO 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月10日
	 */
	@RequestMapping("list")
	public String getlist(Model model,
			@RequestParam(defaultValue = "1") int pageNum) {
		PageHelper.startPage(pageNum, 4);
		List list = gservice.getGoodsList();
		PageInfo info = new PageInfo<>(list);

		PageUtils.fenye(model, info, "");
		model.addAttribute("list", list);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("info", info);
		return "list";

	}

	// 跳转添加页面
	@RequestMapping("toAdd")
	public String toAdd() {
		return "add";
	}

	/**
	 * Description:TODO 品牌下拉列表方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月10日
	 * @return
	 */
	@RequestMapping("getBrandList")
	@ResponseBody
	public List getBrandList() {
		List list = bservice.getBrandList();
		return list;

	}

	/**
	 * Description:TODO 分类下拉列表方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月10日
	 * 
	 * @return
	 */
	@RequestMapping("getGKList")
	@ResponseBody
	public List getGKList() {
		List list = gkservice.getGKList();
		System.out.println(list);
		return list;

	}

	// 添加
	@ResponseBody
	@RequestMapping("add")
	public boolean toAdd(@RequestParam("file") MultipartFile file, Goods goods)
			throws IllegalStateException, IOException {
		String path = "E:\\tu_pian\\images\\gif";
		if (!file.isEmpty()) {
			String fileName = file.getOriginalFilename();
			String newFileName = UUID.randomUUID() + fileName.substring(fileName.lastIndexOf("."));

			File file2 = new File(path + newFileName);
			// 把文件写入硬盘
			file.transferTo(file2);
			goods.setImg(newFileName);
		}
		return gservice.insertSelective(goods) > 0;

	}

}
