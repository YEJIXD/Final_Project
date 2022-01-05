package com.project.eatda.biz;

import java.util.List;

import com.project.eatda.dto.BlogReplyDto;

public interface BlogReplyBiz {
	public List<BlogReplyDto> list(int blog_no);		// 댓글 목록
	public int insert(BlogReplyDto dto);				// 댓글 입력
	public int update(BlogReplyDto dto);			// 댓글 수정
	public int delete(int reply_no);				// 댓글 삭제
	
	public BlogReplyDto selectOne(int reply_no);

}
