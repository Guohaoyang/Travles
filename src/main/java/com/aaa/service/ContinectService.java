package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ContinectDao;
import com.aaa.entity.acon;
import com.aaa.entity.addxc;
import com.aaa.entity.city;
import com.aaa.entity.continect;
import com.aaa.entity.strategy;


@Service
public class ContinectService {

	@Autowired
	ContinectDao cont;
	
	//所有大洲
	public List<continect> Allzo()
	{
		return cont.Allzo();
	}
	//城市
	public List<city> Allcs()
	{
		return cont.Allcs();
	}
	//攻略
	public List<Map<String,Object>> gl()
	{
		return cont.gl();
	}
	//按城市查
	public List<Map<String,Object>> glBayCtity(String Cname)
	{
		return cont.glBayCtity(Cname);
	}
	public List<Map<String,Object>> glBays(String Cname)
	{
		return cont.glBays(Cname);
	}
	//形成详情
	public List<Map<String,Object>> glS(Integer in)
	{
		return cont.strategyS(in);
	}
	//行程目的地分页
	public List<city> page(Integer pageNum, Integer pageSize)
	{
		if (null == pageSize) {
			pageSize = 5;
		}

		if (null == pageNum) {
			pageNum = 1;
		}
		Integer offset=(pageNum-1) * pageSize;
		return cont.page(offset, pageSize);
	}
	//行程目的地模糊搜素
		public List<city> pageno(String cname)
		{
			
			return cont.pageno(cname);
		}
	//查总数
	public Integer num()
	{
		
		return cont.num();
	}
	
	//添加开始目的地
	public Integer addsec(strategy st)
	{
		return cont.addset(st);
	}
	//根据登录ID查行程ID
	//我的行程  最大的ID 根据登录后的uid查
	public Integer SId(Integer uid)
	{
		return cont.SId(uid);
	}
	//添加行程天数
	public Integer addxct(addxc addt)
	{
		return cont.addxct(addt);
	}
	//查询行程天数信息根据id
	public List<Map<String,Object>> addxcs(Integer id)
	{
		return cont.addxcs(id);
	}
	//添加天数表天数
	public Integer ts(Integer num,Integer uid,Integer tid)
	{
		return cont.ts(num,uid,tid);
	}
	//点击增加一天做修改
	public Integer upt(Integer tid)
	{
		return cont.upt(tid);
	}
	//添加第几天的内容
	public Integer addcon(acon acons)
	{
		return cont.addcon(acons);
	}
	//查看第几天的内容根据第几天和行程id
	public List<acon> Allacon(Integer days,Integer tid)
	{
		return cont.Alacon(days, tid);
	}
	//查看经纬度
	public List<city> location()
	{
		return cont.location();
	}
	//查行程详情
	public List<Map<String,Object>> queryOned(Integer tid,Integer days){
		return cont.queryOned(tid,days);
	}
	//查几天天
	public List<addxc> querydays(Integer tid){
		return cont.querydays(tid);
	}
	//查ID
	public Integer dxid(Integer days,String xname)
	{
		return cont.dxid(days, xname);
	}
	//删除一天的一个行程
		
	public Integer del_x(Integer xid)
	{
		return cont.del_x(xid);
	}
}
