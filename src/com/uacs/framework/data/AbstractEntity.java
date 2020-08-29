package com.uacs.framework.data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
/*
 * @Author = Thu Ya Oo
 * @Date = 31th July 2020
 * @Desc = "Abstract class for all tables
 */
@MappedSuperclass
public abstract class AbstractEntity {
	@Id
	private long sysKey;

	public AbstractEntity() {
		super();
	}

	public long getSysKey() {
		return sysKey;
	}

	public void setSysKey(long sysKey) {
		this.sysKey = sysKey;
	}
	
}
