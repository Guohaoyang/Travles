package com.aaa.entity;

public class Pages {
	private int count;//总条数
	private int pageIndex;//当前页数
	private int pageSize;//每页条数
	private int totalPage;//共几页
	//得到共有多少页
	public int getTotalPage(int count, int pageSize){
		if(count % pageSize == 0){
			this.totalPage = count / pageSize;
		}else {
			this.totalPage = count / pageSize + 1;
		}
		return this.totalPage;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	//设置每页显示的条数
	public void setPageSize(int pageSize){
		this.pageSize = pageSize;
	}
	public Pages(int count, int pageIndex, int pageSize, int totalPage) {
		super();
		this.count = count;
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.totalPage = totalPage;
	}
	public Pages() {
		super();
	}
	@Override
	public String toString() {
		return "Pages [count=" + count + ", pageIndex=" + pageIndex
				+ ", pageSize=" + pageSize + ", totalPage=" + totalPage + "]";
	}
}
