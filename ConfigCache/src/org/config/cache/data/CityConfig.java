package org.config.cache.data;

import org.config.cache.StringArray;
import org.config.cache.core.IConfig;

/**
 * 城池配置表
 * @author chenjie
 * 2012-12-11
 */
public class CityConfig implements IConfig {
	
	private Integer id; //配置项ID
	private String name; //城池名称
	private Integer x; //城池坐标x
	private Integer y; //城池坐标y
	private Integer typeId; //城池类型
	private Integer areaId; //区域ID
	private Integer maxField; //城池内最大可建封地数
	private Integer countryId; //城池所属国
	private Integer maxMonsterNum; //玩家在该城池的封地内最多允许的怪物数量
	
	@Override
	public void fromStringArray(StringArray values) {
		
		this.id = values.getInt();
		this.name = values.getString();
		this.x = values.getInt();
		this.y = values.getInt();
		this.typeId = values.getInt();
		this.areaId = values.getInt();
		this.maxField = values.getInt();
		this.countryId = values.getInt();
		this.maxMonsterNum = values.getInt();
		
	}
	
	
	@Override
	public String getKey() {

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


	public final Integer getAreaId() {
		return areaId;
	}


	public final void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}


	public final Integer getMaxField() {
		return maxField;
	}


	public final void setMaxField(Integer maxField) {
		this.maxField = maxField;
	}


	public final Integer getCountryId() {
		return countryId;
	}


	public final void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}


	public final Integer getMaxMonsterNum() {
		return maxMonsterNum;
	}


	public final void setMaxMonsterNum(Integer maxMonsterNum) {
		this.maxMonsterNum = maxMonsterNum;
	}


	public final void setId(Integer id) {
		this.id = id;
	}


	public final Integer getTypeId() {
		return typeId;
	}


	public final void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}


	public final Integer getId() {
		return id;
	}



}
