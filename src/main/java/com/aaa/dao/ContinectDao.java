
package com.aaa.dao;
//攻略
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.aaa.entity.acon;
import com.aaa.entity.addxc;
import com.aaa.entity.city;
import com.aaa.entity.continect;
import com.aaa.entity.strategy;

@Mapper
public interface ContinectDao {

	//查询所有大洲
	@Select("select * from continect")
	public List<continect> Allzo();
	
	//查城市
	@Select("select * from city")
	public List<city> Allcs();
	
	//查攻略
/*	@Select("select s.stid id,s.stname bt,s.stcontent nr,s.tstatus zt,s.gpic tp,t.uname rm,c.cname cs "
			+ "from strategy s left join tusers t on s.uid=t.uid left join city c on s.cid=c.cid where s.stid in(1,2,4,5,6,7,8,9,12)")*/
	@Select("select * from addxc")
	public List<Map<String,Object>> gl();
	
	//城市查攻略
	/*@Select("select s.stid id,s.stname bt,s.stcontent nr,s.tstatus zt,s.gpic tp,t.uname rm,c.cname cs"
			+" from strategy s left join tusers t on s.uid=t.uid left join city c on s.cid=c.cid"
			+" where c.cname=#{param1}")*/
	@Select("select * from addxc where end=#{param1}")
	public List<Map<String,Object>> glBayCtity(String cName);
	@Select("select * from addxc where start=#{param1}")
	public List<Map<String,Object>> glBays(String cName);
	//行程详情页面
	@Select("select s.stid id,s.stname bt,s.stcontent nr,s.tstatus zt,s.gpic tp,s.start cf, s.end dd,t.uname rm,c.cname cs "
         +" from strategy s left join tusers t on s.uid=t.uid left join city c on s.cid=c.cid " 
        +" where s.stid=#{param1}")
	public List<Map<String,Object>> strategyS(Integer in);
	
	@Select("select * from city limit #{param1},#{param2}")
	//分页查询目的地创建行程
	public List<city> page(Integer offset, Integer pageSize);
	
	@Select("select * from city where cname=#{param1}")
	//查询目的地创建行程根据城市模糊搜索
	public List<city> pageno(String cname);
	
	//查总条数
	@Select("select count(cid) num from city")
	public Integer num();
	
	//添加行程景点
	/*@Insert();
	public void xcj();*/
	//查景区 json
	public List<Map<String,Object>>  jq();
	
	@Insert("INSERT into strategy(createtime,uid,start,end) VALUES(#{createtime},#{uid},#{start},#{end})")
	//添加行程
	public Integer addset(strategy st);
	
	//我的行程  最大的ID 根据登录后的uid查
	@Select("select max(tid) tid from addxc where uid=#{param1}")
	public Integer SId(Integer uid);
	
	//添加行程几天
	@Insert("INSERT into addxc(start,end,days,startTime,uid,tname,picd,picf) VALUES(#{start},#{end},#{days},#{startTime},#{uid},#{tname},#{picd},#{picf})")	
	public Integer addxct(addxc addt );
	//查询行程天数信息根据id
	@Select("select a.tid ,a.start,a.end,a.days,a.startTime,a.tname,t.uname from addxc a left join tusers t "
				+" on a.uid=t.uid where tid=#{param1}")
	public List<Map<String,Object>> addxcs(Integer id);
	
	//添加天数表天数
	@Insert("INSERT into adays(Ddays,uid,tid) VALUES(#{param1},#{param2},#{param3})")
	public Integer ts(Integer num,Integer uid,Integer tid);
	
	
	//点击添加天数修改数据库
	@Update("update addxc set days=days+1 where tid=#{param1}")
	public Integer upt(Integer tid);

	//添加几天的内容
	@Insert("INSERT into acon(xname,xpic,xcon,days,tid) VALUES(#{xname},#{xpic},#{xcon},#{days},#{tid})")
	public Integer addcon(acon acons);
	//查看第几天的内容根据第几天和行程id
	@Select("select * from acon where days=#{param1} and tid=#{param2}")
	public List<acon>  Alacon(Integer days,Integer tid);
	
	//查看城市经纬度
	@Select("select cname,locationj,locationw from city ")
	public List<city> location();
	//查看行程详情
	@Select("select d.tid,d.start,d.end,d.starttime,d.tname,"
			+ "c.xid,c.xname,c.days,c.xpic,c.xcon  from acon c inner join "
			+ "addxc d on c.tid=d.tid where c.tid=#{param1} and c.days=#{param2}")
	public List<Map<String,Object>> queryOned(Integer tid,Integer days);
	//查几天
	@Select("select * from addxc where tid=#{param1}")
	public List<addxc> querydays(Integer tid);
}
