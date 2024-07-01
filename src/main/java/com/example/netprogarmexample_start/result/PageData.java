package com.example.netprogarmexample_start.result;

public class PageData {
    //当前页码
    private Integer pageNo;
    //每页记录数
    private Integer pageSize;
    //总记录数
    private Integer totalCount;
    //总页数
    private Integer totalPage;
    //当前页记录
    private Object data;

    public PageData(Integer pageNo, Integer pageSize, Integer totalCount, Integer totalPage, Object data) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = totalPage;
        this.data = data;
    }

    public PageData() {
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PageData{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", data=" + data +
                '}';
    }
}
