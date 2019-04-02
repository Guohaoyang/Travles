package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.aaa.entity.city;
import com.aaa.entity.scenicspots;

@Mapper
public interface ChinaDao {


	@Select("select s.ssid,s.ssname,s.localurl,s.phone,"
			+ "s.details,s.themeid,s.monthsid,s.scstatus,"
			+ "s.scenicspotspic,c.cname from scenicspots s"
			+ " left join city c on s.cid = c.cid where c.cname = '北京'")
	public List<Map<String,Object>> queryBeijing();
	
	@Select("select s.ssid,s.ssname,s.localurl,s.phone,"
			+ "s.details,s.themeid,s.monthsid,s.scstatus,"
			+ "s.scenicspotspic,c.cname from scenicspots s"
			+ " left join city c on s.cid = c.cid where c.cname = '大理'")
	public List<Map<String,Object>> queryDali();
	
	@Select("select s.ssid,s.ssname,s.localurl,s.phone,"
			+ "s.details,s.themeid,s.monthsid,s.scstatus,"
			+ "s.scenicspotspic,c.cname from scenicspots s"
			+ " left join city c on s.cid = c.cid where c.cname = '西安'")
	public List<Map<String,Object>> queryXiAn();
	
	@Select("select * from city")
	public List<city> queryCities();
	
	@Select("select * from scenicspots where themeid = 1 order by ssid  desc  limit 6")
	public List<scenicspots> queryByRain();//根据雨天查询
	
	@Select("select * from scenicspots where themeid = 2 order by ssid  desc  limit 6")
	public List<scenicspots> queryByRomantic();//根据浪漫查询
	
	@Select("select * from scenicspots where themeid =3 order by ssid  desc  limit 6")
	public List<scenicspots> queryByExplore();//根据探险查询
	
	@Select("select * from scenicspots where themeid = 4 order by ssid  desc  limit 6")
	public List<scenicspots> queryByTravel();//根据游历查询
	
	@Select("select * from scenicspots where monthsid = 1 limit 5")
	public List<scenicspots> queryOne();
	@Select("select * from scenicspots where monthsid = 2 limit 5")
	public List<scenicspots> queryTwo();
	@Select("select * from scenicspots where monthsid = 3 limit 5")
	public List<scenicspots> queryThree();
	@Select("select * from scenicspots where monthsid = 4 limit 5")
	public List<scenicspots> queryFour();
	@Select("select * from scenicspots where monthsid = 5 limit 5")
	public List<scenicspots> queryFive();
	@Select("select * from scenicspots where monthsid = 6 limit 5")
	public List<scenicspots> querySix();
	@Select("select * from scenicspots where monthsid = 7 limit 5")
	public List<scenicspots> querySeven();
	@Select("select * from scenicspots where monthsid = 8 limit 5")
	public List<scenicspots> queryEight();
	@Select("select * from scenicspots where monthsid = 9 limit 5")
	public List<scenicspots> queryNine();
	@Select("select * from scenicspots where monthsid = 10 limit 5")
	public List<scenicspots> queryTen();
	@Select("select * from scenicspots where monthsid = 11 limit 5")
	public List<scenicspots> queryEleven();
	@Select("select * from scenicspots where monthsid = 12 limit 5")
	public List<scenicspots> queryTwelve();
	
	
	@Select("select * from scenicspots where ssname = #{ssname}")
	public scenicspots queryBySsname(String ssname);
	
	//根据城市ID查询城市详细信息
	@Select("select * from  city where cid = #{cid}")
	public city queryByCitys(Integer cid);
	
	//根据城市ID查询所有景点信息
	@Select("select s.ssid,s.ssname,s.phone,s.details,s.scenicspotspic"
			+ " from scenicspots s left join city c on c.cid = s.cid "
			+ "where c.cid = #{cid} order by ssid desc limit 6")
	public List<Map<String,Object>> queryScenicspotspic(Integer cid);
	
	@Select("select c.cid,c.cname,c.details,c.citypic,s.ssname,"
			+ "s.ssid from city c right join scenicspots s on c.cid =s.cid "
			+ "where c.cname like concat ('%',#{cname},'%')")
	public List<Map<String,Object>> queryCitysMH(String cname);
	
	//查询城市下面的结伴信息
	@Select("select cm.csid,cm.csname,cm.cscontent,cm.ccid,cm.url,"
			+ "c.cname from comemessage cm left join city c "
			+ "on cm.ccid = c.cid where c.cid = #{cid}")
	public List<Map<String,Object>> queryCompany(Integer cid);
	
	//查询景点下面的游记信息
	@Select("select t.tid,t.tname,t.tcontent,t.ttid,t.ttitle,"
			+ "s.ssid,s.ssname,s.scenicspotspic from  travelnotes t "
			+ "left join scenicspots s on t.ttid = s.ssid where s.ssname =#{ssname}")
	public List<Map<String,Object>> queryTravelnotes(String ssname);

	
	@Select("select d.tid,d.start,d.end,d.starttime,d.tname,"
			+ "c.xid,c.xname,c.days,c.xpic,c.xcon  from acon c inner join "
			+ "addxc d on c.tid=d.tid where c.days=#{param1} and d.tid  = #{param2}")
	public List<Map<String,Object>> queryOned(Integer days,Integer tid );
	
	@Select("select days from addxc ")
	public int querydays();
	
}
