package org.config.cache.data;

import org.config.cache.StringArray;
import org.config.cache.core.IConfig;

/**
 * 建筑位配置表
 * @author chenjie
 * 2012-12-12
 */
public class BuildingPositionConfig implements IConfig {

	private Integer id; //配置行ID
	private Integer x; //x坐标
	private Integer y; //y坐标
	private Integer type; //建筑类型
	private Integer premise; //前提建筑ID
	
	@Override
	public void fromStringArray(StringArray values) {
		this.id = values.getInt();
		this.x = values.getInt();
		this.y = values.getInt();
		this.type = values.getInt();
		this.premise = values.getInt();
	}

	@Override
	public String getKey() {

		return this.id+"";
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

	public final Integer getPremise() {
		return premise;
	}

	public final void setPremise(Integer premise) {
		this.premise = premise;
	}

	public final void setId(Integer id) {
		this.id = id;
	}

	public final Integer getId() {
		return id;
	}

	public final Integer getType() {
		return type;
	}

	public final void setType(Integer type) {
		this.type = type;
	}
	
	

}
