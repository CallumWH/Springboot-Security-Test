package com.qa.persistant;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Account
{
	
	@Id
	private ObjectId id;
	private String username;
	private String password;

	
	
	public String getHexId()
	{
		return id.toHexString();
	}
	
	public ObjectId getObjectId()
	{
		return id;
	}

	public void setId(ObjectId id)
	{
		this.id = id;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

}
