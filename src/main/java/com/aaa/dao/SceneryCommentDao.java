package com.aaa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aaa.entity.SceneryComment;

@Mapper
public interface SceneryCommentDao {
	
	/**
	 * 根据景点编号查询景点信息
	 * @param ssid
	 * @return
	 */
	public List<SceneryComment> queryComment(Integer ssid);
}
