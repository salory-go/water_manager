package com.example.netprogarmexample_start.result;

public class CommonResult {
    //编码:0成功，1失败
    private Integer code;
    //提示消息
    private String msg;
    //记录数
    private Integer count;
    //记录数据
    private Object data;

    public CommonResult() {
    }

    public CommonResult(Integer code, String msg, Integer count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    //返回查询结果的成功信息:
    public static CommonResult success(Integer count,Object data){
        return new CommonResult(0,"success",count,data);
    }

    //返回增删改的成功信息
    public static CommonResult success(){
        return new CommonResult(0,"success",null,null);
    }

    //返回失败信息
    public static CommonResult fail(){
        return new CommonResult(1,"fail",null,null);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
