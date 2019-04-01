package com.panhb.cloud.provider.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author hongbo.pan
 */
@Data
@Entity
@Table(name = "t_user")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userName;
	@JsonIgnore
	private String passWord;
	private Date createDate;

}
