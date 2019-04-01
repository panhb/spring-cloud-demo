package com.panhb.cloud.api.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hongbo.pan
 */
@Data
public class UserDTO implements Serializable {

	private Long id;
	private String userName;
	private String passWord;
	private Date createDate;

}
