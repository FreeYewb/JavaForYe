package com.bo.wen.ye.beifeng.io;

/**
 * 
 * @ClassName: User类 JavaBean
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author yewenbo
 * @date 2018年10月15日 下午2:50:17
 *
 */
public class User {
    private int id;
    private String username;
    private String address;
    private String password;

    public User() {
    }
    public User(int id, String username, String address, String password) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", address=" + address + ", password=" + password + "]";
    }
}
