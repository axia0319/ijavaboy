package org.config.cache.data;

import org.config.cache.StringArray;
import org.config.cache.core.IConfig;

/**
 * �������ñ�
 * @author chenjie
 * 2012-12-5
 */
public class AreaConfig implements IConfig {
	
	private Integer id; //����ID
	private String name; //��������
	private Integer x; //����x����
	private Integer y; //����y����
	private String rewardDesc; //��������
	
	
	@Override
	public void fromStringArray(StringArray values) {
		
		this.id = values.getInt();
		this.name = values.getString();
		this.x = values.getInt();
		this.y = values.getInt();
		this.rewardDesc = values.getString();
	}
	
	public final void setId(Integer id) {
		this.id = id;
	}

	@Override
	public final String getKey() {

		return id+"";
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
	
	


	public final Integer getX() {
		return x;
	}

	public final void setX(Integer x) {
		this.x = x;
	}

	public final Integer getY() {
		return y;
	}

	public final void setY(Integer y) {
		this.y = y;
	}

	public final String getRewardDesc() {
		return rewardDesc;
	}

	public final void setRewardDesc(String rewardDesc) {
		this.rewardDesc = rewardDesc;
	}
	

	public final Integer getId() {
		return id;
	}

	@Override
	public String toString(){
		
		return String.format("id:%s; name:%s;", id, name);
	}


}
