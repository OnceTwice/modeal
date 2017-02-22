package com.ff.modeal.repository.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.modeal.vo.ItemVo;

@Repository
public class ItemDao2 {

	@Autowired
	private SqlSession sqlSession;

	// 해당 매장의 상품 목록
	public List<Map<String, Object>> shopItemList(Long shopNo) {
		return sqlSession.selectList("item2.shopItemList", shopNo);
	}

	// 상품 등록
	public void itemInsert(ItemVo itemVo) {
		sqlSession.insert("item2.itemInsert", itemVo);
	}

	 // 상품 수정 - 기존에 입력한 정보 출력
	 public ItemVo itemModify(Long no) {
	 return sqlSession.selectOne("item2.itemModify", no);
	 }

	 // 상품 수정 - 업데이트(갱신)
	 public void itemModifyUpdate(Map<String, Object> map) {
//		map = new HashMap<String, Object>();
//		map.put("no", no);
//		map.put("name", name);
//		map.put("count", count);
//		map.put("oriPrice", oriPrice);
//		map.put("price", price);
//		map.put("discount", discount);
//		map.put("expDate", expDate);
//		map.put("itemCategoryNo", itemCategoryNo);
		 System.out.println(map);
		 
//			Map<String, Object> map = new HashMap<String, Object>();
//			map.put("no", no);
//			map.put("name", name);
//			map.put("count", count);
//			map.put("oriPrice", oriPrice);
//			map.put("price", price);
//			map.put("discount", discount);
//			map.put("expDate", expDate);
		sqlSession.update("item2.itemModifyUpdate", map);
	 }

	// 상품 삭제
	public void itemDelete(Long no) {
		sqlSession.delete("item2.itemDelete", no);
	}

	// 상품 상세 정보
	public Map<String, Object> itemDetail(String latitude, String longitude, Long no) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("latitude", latitude);
		map.put("longitude", longitude);
		map.put("no", no);
		return sqlSession.selectOne("item2.itemDetail", map);
	}

	// 상품 보이기/숨기기
	public void itemView(Long no, Long check) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("no", no);
		map.put("check", check);
		sqlSession.update("item2.itemInvisible", map);
	}
}
