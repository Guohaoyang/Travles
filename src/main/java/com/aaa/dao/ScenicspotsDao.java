package com.aaa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aaa.entity.scenicspots;

@Mapper
public interface ScenicspotsDao {

	/**
	 * 查询全部
	 * @return
	 */
	/*@Select("select ssid,ssname,scenicspotspic from scenicspots")*/
	public List<scenicspots> queryScenicspots();
	
	/**
	 * 根据编号查询
	 * @param ssid
	 * @return
	 */
	//	@Select("select ssid,ssname,scenicspotspic from scenicspots where ssid = #{ssid}")
	public scenicspots queryBySsid(Integer ssid);
	
	/***
	 * 根据景点名子去查询景点的信息
	 * @param s
	 * @return
	 */
	public List<scenicspots> queryBySname(scenicspots s);
	
	/**
	 * 按主题推荐的景点  
	 * @param thmeid
	 * @return
	 */
	/*@Select("SELECT * FROM   scenicspots where themeid =#{themeid}")*/
	public List<scenicspots> queryByThemeid(Integer themeid);
	
	/**
	 * 按月份推荐的景点  月份
	 * @param monthsid
	 * @return
	 */
	public List<scenicspots> queryByMonthsid(Integer monthsid);
}
