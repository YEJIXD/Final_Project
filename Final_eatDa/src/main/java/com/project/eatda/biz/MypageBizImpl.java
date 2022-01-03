package com.project.eatda.biz;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.eatda.dao.MemberDao;
import com.project.eatda.dao.MypageDao;
import com.project.eatda.dto.BlogDto;
import com.project.eatda.dto.CouponDto;
import com.project.eatda.dto.OrderProductDto;
import com.project.eatda.dto.ProductDto;
import com.project.eatda.dto.ReviewDto;
import com.project.eatda.dto.SubscriptionDto;

@Service
public class MypageBizImpl implements MypageBiz{

	@Inject
	MypageDao mypageDao;

	//구독내역
	@Override
	public SubscriptionDto subscriptionList(SubscriptionDto dto) {
		return mypageDao.subscriptionList(dto);
	}

	//쿠폰함
	@Override
	public List<CouponDto> couponList(CouponDto dto) {
		return mypageDao.couponList(dto);
	}

	//블로그 찜
	@Override
	public List<BlogDto> blogLikeList(String user_id) {
		return mypageDao.blogLikeList(user_id);
	}

	//주문한 상품
	@Override
	public List<OrderProductDto> marketOrderList(String user_id) {
		return mypageDao.marketOrderList(user_id);
	}

	//리뷰작성
	@Override
	public int registReview(ReviewDto dto) {
		return mypageDao.registReview(dto);
	}


}
