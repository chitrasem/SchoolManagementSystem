package com.chitra.schoolmanagementsystem.model;

public class User {
	private long id;
	private String username;
	private String address;
	private String email;
	
	public User(){
		id=0;
	}
	public User(Long id, String username, String address, String email){
		this.id = id;
		this.username = username;
		this.address = address;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj ==null)
			return false;
		if(!(obj instanceof User))
			return false;
		User other = (User) obj;
		if(id !=other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [id= "+id+","
				+ "Username= "+username+","
				+ "Address= "+address+","
				+ "Email= "+email+"]";
	}

}
