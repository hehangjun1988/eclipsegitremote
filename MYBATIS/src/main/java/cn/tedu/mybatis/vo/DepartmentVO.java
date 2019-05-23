package cn.tedu.mybatis.vo;

import java.io.Serializable;
import java.util.List;

import cn.tedu.mybatis.entity.User;

public class DepartmentVO implements Serializable {

	private static final long serialVersionUID = 325380626716955403L;

	private Integer depId;
	private String depName;
	private List<User> users;

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "DepartmentVO [depId=" + depId + ", depName=" + depName + ", users=" + users + "]";
	}

}