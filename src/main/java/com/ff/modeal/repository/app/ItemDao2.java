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

//	// 상품 수정 - 수정페이지 출력
//	public ItemVo itemModify(Long shopNo) {
//		return sqlSession.update("item2.itemModify", shopNo);
//	}

	// // 상품 수정 - 업데이트
	// public Itemvo itemModify(Long shopNo) {
	// sqlSession.selectOne("item2.itemModify", shopNo);
	// }

	// 상품 삭제
	public void itemDelete(Long no) {
		sqlSession.delete("item2.itemDelete", no);
	}
	
	// 상품 상세 정보
	public Map<String, Object> itemDetail(Long no) {
		return sqlSession.selectOne("item2.itemDetail", no);
	}

	// 상품 보이기 / 숨기기
	public void itemView(Long no, Long check) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("no", no);
		map.put("check", check);
		sqlSession.update("item2.itemInvisible", map);
	}
}
