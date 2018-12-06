package edu.dlnu;

import java.sql.Timestamp;

public class tushuleibie {
    private int 序号;
    private String 图书类别;
    private Timestamp 录入时间;
    private String 删除;

    @Override
    public String toString() {
        return "tushuleibie{" +
                "序号=" + 序号 +
                ", 图书类别='" + 图书类别 + '\'' +
                ", 录入时间=" + 录入时间 +
                ", 删除='" + 删除 + '\'' +
                '}';
    }

    public int get序号() {
        return 序号;
    }

    public void set序号(int 序号) {
        this.序号 = 序号;
    }

    public String get图书类别() {
        return 图书类别;
    }

    public void set图书类别(String 图书类别) {
        this.图书类别 = 图书类别;
    }

    public Timestamp get录入时间() {
        return 录入时间;
    }

    public void set录入时间(Timestamp 录入时间) {
        this.录入时间 = 录入时间;
    }

    public String get删除() {
        return 删除;
    }

    public void set删除(String 删除) {
        this.删除 = 删除;
    }
}
