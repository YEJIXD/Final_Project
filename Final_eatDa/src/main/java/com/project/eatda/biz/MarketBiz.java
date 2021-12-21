package com.project.eatda.biz;

import java.util.List;
import java.util.Map;

import com.project.eatda.dto.CartProductDto;
import com.project.eatda.dto.ProductDto;
import com.project.eatda.dto.ReviewDto;

public interface MarketBiz {
	
	public List<ProductDto> takeProductList(int num);
	public int paging();
	public List<ProductDto> likeProductList(String user_id);
	public List<ProductDto> hashTagSearch(String tagName);
	public List<ProductDto> searchKeyword(String tagName);
	public ProductDto getProduct(String p_id);
	public int putShoppingBag(CartProductDto cpDto);
	public List<ReviewDto> getReview(String p_id);
}
