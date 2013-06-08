package org.config.cache.data;

import org.config.cache.StringArray;
import org.config.cache.core.IConfig;

/**
 * 物品配置表
 * @author chenjie
 * 2012-12-12
 */
public class ItemConfig implements IConfig {
	
	private Integer id; //物品ID
	private Integer type; //类型
	private String name; //名称
	private Integer level; //等级
	private Integer sex; //性别
	private Integer money; //花费的铜钱
	private Boolean multiple; //是否可以叠加
	private Integer equipIndex; //装备位置
	private Integer extentionID; //扩展表项ID
	private String iconAddr; //图标地址
	private Integer eventID; //事件ID
	private String desc; //描述
	
	@Override
	public void fromStringArray(StringArray values) {
		
		this.id = values.getInt();
		this.type = values.getInt();
		this.name = values.getString();
		this.level = values.getInt();
		this.sex = values.getInt();
		this.money = values.getInt();
		this.multiple = values.getBool();
		this.equipIndex = values.getInt();
		this.extentionID = values.getInt();
		this.iconAddr = values.getString();
		this.eventID = values.getInt();
		this.desc = values.getString();
	}

	@Override
	public String getKey() {

		return this.id+"";
	}

	public final Integer getType() {
		return type;
	}

	public final void setType(Integer type) {
		this.type = type;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final Integer getLevel() {
		return level;
	}

	public final void setLevel(Integer level) {
		this.level = level;
	}

	public final Integer getSex() {
		return sex;
	}

	public final void setSex(Integer sex) {
		this.sex = sex;
	}

	public final Integer getMoney() {
		return money;
	}

	public final void setMoney(Integer money) {
		this.money = money;
	}

	

	public final Boolean getMultiple() {
		return multiple;
	}

	public final void setMultiple(Boolean multiple) {
		this.multiple = multiple;
	}

	public final Integer getEquipIndex() {
		return equipIndex;
	}

	public final void setEquipIndex(Integer equipIndex) {
		this.equipIndex = equipIndex;
	}

	public final Integer getExtentionID() {
		return extentionID;
	}

	public final void setExtentionID(Integer extentionID) {
		this.extentionID = extentionID;
	}

	public final String getIconAddr() {
		return iconAddr;
	}

	public final void setIconAddr(String iconAddr) {
		this.iconAddr = iconAddr;
	}

	public final Integer getEventID() {
		return eventID;
	}

	public final void setEventID(Integer eventID) {
		this.eventID = eventID;
	}

	public final String getDesc() {
		return desc;
	}

	public final void setDesc(String desc) {
		this.desc = desc;
	}

	public final void setId(Integer id) {
		this.id = id;
	}
	
	
	
	public final Integer getId() {
		return id;
	}

	@Override
	public String toString(){
		
		return this.id+"";
	}

}
