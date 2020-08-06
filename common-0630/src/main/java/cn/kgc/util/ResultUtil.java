package cn.kgc.util;

public class ResultUtil {
    private String msg;
    private Object obj;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "ResultUtil{" +
                "msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }
}
