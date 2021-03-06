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
		// System.out.println(itemService.shopItemList(shopNo).get(0).get("oriPrice").getClass());

		return JSONResult.success(itemService.shopItemList(shopNo));
	}

	// 상품 등록
	@ResponseBody
	@RequestMapping(value = "itemInsert", method = RequestMethod.POST)
	public void itemInsert(
			@RequestParam(value = "name", required = true, defaultValue = "") String name,
			@RequestParam(value = "oriPrice", required = true, defaultValue = "") Long oriPrice,
			@RequestParam(value = "count", required = true, defaultValue = "") Long count,
			@RequestParam(value = "price", required = true, defaultValue = "") Long price,
			@RequestParam(value = "expDate", required = true, defaultValue = "") String exp_date,
			@RequestParam(value = "shopNo", required = true, defaultValue = "") Long shopNo,
			@RequestParam(value = "itemCategoryNo", required = true, defaultValue = "") Long itemCategoryNo,
			@RequestParam(value = "discount", required = true, defaultValue = "") Long discount,
			@RequestParam(value = "picture" , required = true, defaultValue = "") String picture) {

		ItemVo itemVo = new ItemVo();
		itemVo.setName(name);
		itemVo.setOriPrice(oriPrice);
		itemVo.setCount(count);
		itemVo.setPrice(price);
		itemVo.setExpDate(exp_date);
		itemVo.setShopNo(shopNo);
		itemVo.setItemCategoryNo(itemCategoryNo);
		itemVo.setDiscount(discount);
		itemVo.setPicture(picture);
		
		System.out.println(itemVo);
		
		itemService.itemInsert(itemVo);
	}

	 // 상품 수정 - 기존에 입력한 정보 출력
	 @ResponseBody
	 @RequestMapping(value = "/itemModify", method = RequestMethod.POST)
	 public JSONResult itemModify(@RequestParam(value = "no") Long no) {
		 System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!" + no);
		 return JSONResult.success(itemService.itemModify(no));
	 }

	// 상품 수정 - 업데이트(갱신)
	 @ResponseBody
	 @RequestMapping(value = "/itemModifyUpdate"/*, method = RequestMethod.POST*/)
	 public void itemModifyUpdate(
		 @RequestParam(value = "no", required = true, defaultValue = "") Long no,
		 @RequestParam(value = "name", required = true, defaultValue = "") String name,
		 @RequestParam(value = "oriPrice", required = true, defaultValue = "") Long oriPrice,
		 @RequestParam(value = "count", required = true, defaultValue = "") Long count,
		 @RequestParam(value = "price", required = true, defaultValue = "") Long price,
		 @RequestParam(value = "expDate", required = true, defaultValue = "") String exp_date,
		 @RequestParam(value = "discount", required = true, defaultValue = "") Long discount,
		 @RequestParam(value = "itemCategoryNo", required = true, defaultValue = "") Long itemCategoryNo,
		 @RequestParam(value = "picture" , required = true, defaultValue = "") String picture) {
		 
		 Map<String, Object> map = new HashMap<String, Object>();
		 map.put("no", no);
		 map.put("name", name);
		 map.put("oriPrice", oriPrice);
		 map.put("count", count);
		 map.put("price", price);
		 map.put("expDate", exp_date);
		 map.put("discount", discount);
		 map.put("itemCategoryNo", itemCategoryNo);
		 map.put("picture", picture);

		 itemService.itemModifyUpdate(map);
	 }

	// 상품 삭제
	@ResponseBody
	@RequestMapping(value = "/itemDelete", method = RequestMethod.POST)
	public void itemDelete(@RequestParam(value = "no", required = true, defaultValue = "") Long no) {
		itemService.itemDelete(no);
	}

	// 상품 상세 정보
	@ResponseBody
	@RequestMapping(value = "/itemDetail", method = RequestMethod.POST)
	public JSONResult itemDetail(@RequestParam(value = "latitude") String latitude,
			@RequestParam(value = "longitude") String longitude,
			@RequestParam(value = "no", required = true, defaultValue = "") Long no) {
		return JSONResult.success(itemService.itemDetail(latitude, longitude, no));
	}

	// 상품 보이기/숨기기
	@ResponseBody
	@RequestMapping(value = "/itemView", method = RequestMethod.POST)
	public void itemView(@RequestParam(value = "no") Long no, @RequestParam(value = "check") Long check) {
		itemService.itemView(no, check);
	}
}
