package com.ff.modeal.controller.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.modeal.dto.JSONResult;
import com.ff.modeal.service.app.ItemService2;
import com.ff.modeal.vo.ItemVo;

@Controller
@RequestMapping("/list")
public class ItemController2 {

	@Autowired
	ItemService2 itemService;

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public JSONResult list(@ModelAttribute ItemVo itemVo) {

		List<ItemVo> list = itemService.getAllItmes();
		// System.out.println(itemVo);
		return JSONResult.success(list);
	}

	// 해당 매장의 상품 목록
	@ResponseBody
	@RequestMapping(value = "/shopItemList", method = RequestMethod.POST)
	public JSONResult shopItemList(@RequestParam(value = "no") Long shopNo) {
		System.out.println(shopNo);
		// List<Map<String, Object>> map = itemService.shopItemList(shopNo);
		System.out.println(itemService.shopItemList(shopNo).get(0).get("oriPrice").getClass());
		return JSONResult.success(itemService.shopItemList(shopNo));
	}

	// 상품 추가
	@ResponseBody
	@RequestMapping(value="itemInsert", method=RequestMethod.POST)
	public void itemInsert(@RequestParam(value="name", required=true, defaultValue="") String name, 
								@RequestParam(value="oriPrice", required=true, defaultValue="")	Long oriPrice,
								@RequestParam(value="count", required=true, defaultValue="") Long count,
								@RequestParam(value="price", required=true, defaultValue="") Long price,
								@RequestParam(value="expDate", required=true, defaultValue="") String exp_date,
								@RequestParam(value="discount", required=true, defaultValue="") Long discount) {
		
		ItemVo itemVo = new ItemVo();
		itemVo.setName(name);
		itemVo.setOriPrice(oriPrice);
		itemVo.setCount(count);
		itemVo.setPrice(price);
		itemVo.setExpDate(exp_date);
		itemVo.setDiscount(discount);
		
		itemService.itemInsert(itemVo);
	}

	// 상품 상세 정보
	@ResponseBody
	@RequestMapping(value = "/itemDetail", method = RequestMethod.POST)
	public JSONResult itemDetail(@RequestParam(value = "no", required = true, defaultValue = "") Long no) {
		return JSONResult.success(itemService.itemDetail(no));
	}
}
