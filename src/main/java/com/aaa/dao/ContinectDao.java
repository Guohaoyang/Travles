
package com.aaa.dao;
//攻略
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.aaa.entity.city;
import com.aaa.entity.continect;

@Mapper
public interface ContinectDao {

	//查询所有大洲
	@Select("select * from continect")
	public List<continect> Allzo();
	
	//查城市
	@Select("select * from city")
	public List<city> Allcs();
	
	//查攻略
	@Select("select s.stid id,s.stname bt,s.stcontent nr,s.tstatus zt,s.gpic tp,t.uname rm,c.cname cs "
			+ "from strategy s left join tusers t on s.uid=t.uid left join city c on s.cid=c.cid where s.stid in(1,2,4,5,6,7,8,9,12)")
	public List<Map<String,Object>> gl();
	
	//城市查攻略
	@Select("select s.stid id,s.stname bt,s.stcontent nr,s.tstatus zt,s.gpic tp,t.uname rm,c.cname cs"
			+" from strategy s left join tusers t on s.uid=t.uid left join city c on s.cid=c.cid"
			+" where c.cname=#{param1}")
	public List<Map<String,Object>> glBayCtity(String cName);
	
	//行程详情页面
	@Select("select s.stid id,s.stname bt,s.stcontent nr,s.tstatus zt,s.gpic tp,s.start cf, s.end dd,t.uname rm,c.cname cs "
         +" from strategy s left join tusers t on s.uid=t.uid left join city c on s.cid=c.cid " 
        +" where s.stid=#{param1}")
	public List<Map<String,Object>> strategyS(Integer in);
	
	@Select("select * from city limit #{param1},#{param2}")
	//分页查询目的地创建行程
	public List<city> page(Integer offset, Integer pageSize);
	//查总条数
	@Select("select count(cid) num from city")
	public Integer num();
}
