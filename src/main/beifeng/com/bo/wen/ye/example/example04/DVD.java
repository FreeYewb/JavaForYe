package com.bo.wen.ye.example.example04;

public class DVD {
    private String name;// DVD名称
    private String status;// 状态
    private String borrowDate;// 借出时间
    private int count;// 借出次数

    public DVD() {
    }
    public DVD(String name, String status, String borrowDate, int count) {
        this.name = name;
        this.status = status;
        this.borrowDate = borrowDate;
        this.count = count;
    }

    public DVD(String name, String status) {
        this.name = name;
        this.status = status;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
