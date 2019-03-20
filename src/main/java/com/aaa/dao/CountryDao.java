package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.aaa.entity.city;
import com.aaa.entity.country;
import com.aaa.entity.scenicspots;

@Mapper
public interface CountryDao {

	public List<country> queryAsia();//亚洲
	
	public List<country> queryAmerica();//美洲
	
	public List<country> queryEurope();//欧洲
	
	public List<country> queryOceania();//大洋洲
	
	public List<scenicspots> queryByRain();//根据雨天查询
	
	public List<scenicspots> queryByRomantic();//根据浪漫查询
	
	public List<scenicspots> queryByExplore();//根据探险查询
	
	public List<scenicspots> queryByTravel();//根据游历查询
	
	public List<scenicspots> queryOne();
	
	public List<scenicspots> queryTwo();
	
	public List<scenicspots> queryThree();
	
	public List<scenicspots> queryFour();
	
	public List<scenicspots> queryFive();
	
	public List<scenicspots> querySix();
	
	public List<scenicspots> querySeven();
	
	public List<scenicspots> queryEight();
	
	public List<scenicspots> queryNine();
	
	public List<scenicspots> queryTen();
	
	public List<scenicspots> queryEleven();
	
	public List<scenicspots> queryTwelve();
	
	
	@Select("select * from city where cid = #{cid}")
	public city queryByCid(Integer cid);

	@Select("select * from scenicspots where cid = #{cid}  limit 6")
	public List<scenicspots> queryByCountryId(Integer cid);
	
	@Select("select * from city where contryid = #{contryid}")
	public List<city> queryByCity(Integer contryid);
	
	/**
	 * 模糊查询  根据国家名字查询国家的所有城市信息
	 * @param cname
	 * @return
	 */
	public country queryMoHu(String cname);
	
	@Select("select cname from country")
	public List<String> queryCname();
	
	@Select("select c.cid,c.cname cityname,c.contryid,c.citypic,c.details,"
			+ "ct.cid,ct.cname,ct.details,ct.countrypic from city c inner join"
			+ " country ct on c.contryid = ct.cid where ct.cname = #{param1}")
	public List<Map<String,Object>> queryCity(String cname);
	
	@Select("select c.cid,c.cname cityname,c.contryid,c.citypic,c.details,"
			+ "ct.cid,ct.cname,ct.details,ct.countrypic from city c inner join "
			+ "country ct on c.contryid = ct.cid where ct.cid = #{cid} limit 6")
	public List<Map<String,Object>> queryCitys(Integer cid);
	
	/**
	 * 根据国家景点查询国家详细信息
	 * @param cid
	 * @return
	 */
	@Select("select * from country where cid = #{cid}")
	public country queryCountry(Integer cid);
	
}
