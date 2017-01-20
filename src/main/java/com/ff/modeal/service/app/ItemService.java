package com.ff.modeal.service.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ff.modeal.vo.ItemVo;

@Service
public class ItemService {
	
	public List<ItemVo> getAllItmes() {
		
		List<ItemVo> list = new ArrayList<ItemVo>();
		
		// 가짜데이터 
		ItemVo itemvo = new ItemVo();
		itemvo.setName( "밀크초콜릿" );
		itemvo.setCount( 5 );
		itemvo.setOriPrice( 2000 );
		itemvo.setPrice( 1000 );
		itemvo.setDiscount( 50 );
		itemvo.setExpDate("2017-01-20 15:00:00");
		itemvo.setPicture("https://search.naver.com/p/crd/rd?m=1&px=131&py=1124&sx=131&sy=324&p=T4blplpVuFRssuq2XhosssssssN-392143&q=%B9%D0%C5%A9%C3%CA%C4%DD%B8%B4&ssc=tab.nx.all&f=nexearch&w=nexearch&s=mLY5LMV9aDwf/ZUBzLdvUw==&time=1484890290952&t=14&u=http%3A//shopping.naver.com/detail/detail.nhn%3Fcat_id%3D50002000%26frm%3DNVSCPRO%26nv_mid%3D9217034074%26query%3D%25EB%25B0%2580%25ED%2581%25AC%25EC%25B4%2588%25EC%25BD%259C%25EB%25A6%25BF&r=13&i=00000009_00022560c75a&a=shp_gui*1.itemimg&cr=2");
		itemvo.setShopNo( 1 );
		itemvo.setItemCategoryNo( 2 );
		list.add( itemvo );
		
		return list;
	}

}
