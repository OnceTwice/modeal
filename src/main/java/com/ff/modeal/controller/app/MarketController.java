package com.ff.modeal.controller.app;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.ff.modeal.dto.*;
import com.ff.modeal.service.app.*;

@Controller
@RequestMapping("/market")
public class MarketController {
	@Autowired
	MarketService marketService;

	@ResponseBody
	@RequestMapping(value="/detail", method=RequestMethod.POST)
	public JSONResult marketDetail(@RequestParam(value="no", required=true, defaultValue="") Long no) {					// 매장 상세 정보
		return JSONResult.success(marketService.marketDetail(no));
	}
}
