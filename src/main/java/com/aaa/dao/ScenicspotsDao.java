package com.aaa.dao;


import org.apache.ibatis.annotations.Mapper;

import com.aaa.entity.scenicspots;

@Mapper
public interface ScenicspotsDao {

	
	
	/**
	 * 根据编号查询
	 * @param ssid
	 * @return
	 */
	//	@Select("select ssid,ssname,scenicspotspic from scenicspots where ssid = #{ssid}")
	public scenicspots queryBySsid(Integer ssid);
	
	
}
