package org.config.cache.data;

import org.config.cache.StringArray;
import org.config.cache.core.IConfig;
import org.config.cache.utils.StringUtils;

/**
 * 建筑配置表
 * @author chenjie
 * 2012-12-12
 */
public class BuildingConfig implements IConfig {
	
	private Integer id; //配置项ID
	private Integer type; //类型
	private Integer premiseBuilding; //前提建筑
	private Integer premiseBuildingLevel; //前提建筑等级
	private String name; //名称
	private Integer level; //等级
	private Integer costTime; //升级消耗时间
	private Integer costWood; //消耗的木材
	private Integer costIron; //消耗的铁矿
	private Integer costFood; //消耗的粮食
	private Integer costMoney; //消耗的铜钱
	private Integer outputWood; //产出的木材
	private Integer outputIron; //产出的铁矿
	private Integer outputFood; //产出的粮食
	private Integer outputMoney; //产出的铜钱
	private Integer soldierCapacity; //士兵容量
	private Integer nextID; //下一等级ID
	private String pic; //图标地址
	private String desc; //描述
	private String functionDesc; //功能描述
	
	@Override
	public void fromStringArray(StringArray values) {
		
		this.id = values.getInt();
		this.type = values.getInt();
		this.premiseBuilding = values.getInt();
		this.premiseBuildingLevel = values.getInt();
		this.name = values.getString();
		this.level = values.getInt();
		this.costTime = values.getInt();
		this.costWood = values.getInt();
		this.costIron = values.getInt();
		this.costFood = values.getInt();
		this.costMoney = values.getInt();
		this.outputFood = values.getInt();
		this.outputIron = values.getInt();
		this.outputFood = values.getInt();
		this.outputMoney = values.getInt();
		this.soldierCapacity = values.getInt();
		this.nextID = values.getInt();
		this.pic = values.getString();
		this.desc = values.getString();
		this.functionDesc = values.getString();
		
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

	public final Integer getCostTime() {
		return costTime;
	}

	public final void setCostTime(Integer costTime) {
		this.costTime = costTime;
	}

	public final Integer getCostWood() {
		return costWood;
	}

	public final void setCostWood(Integer costWood) {
		this.costWood = costWood;
	}

	public final Integer getCostIron() {
		return costIron;
	}

	public final void setCostIron(Integer costIron) {
		this.costIron = costIron;
	}

	public final Integer getCostFood() {
		return costFood;
	}

	public final void setCostFood(Integer costFood) {
		this.costFood = costFood;
	}

	public final Integer getCostMoney() {
		return costMoney;
	}

	public final void setCostMoney(Integer costMoney) {
		this.costMoney = costMoney;
	}

	public final Integer getOutputWood() {
		return outputWood;
	}

	public final void setOutputWood(Integer outputWood) {
		this.outputWood = outputWood;
	}

	public final Integer getOutputIron() {
		return outputIron;
	}

	public final void setOutputIron(Integer outputIron) {
		this.outputIron = outputIron;
	}

	public final Integer getOutputFood() {
		return outputFood;
	}

	public final void setOutputFood(Integer outputFood) {
		this.outputFood = outputFood;
	}

	public final Integer getOutputMoney() {
		return outputMoney;
	}

	public final void setOutputMoney(Integer outputMoney) {
		this.outputMoney = outputMoney;
	}

	public final Integer getSoldierCapacity() {
		return soldierCapacity;
	}

	public final void setSoldierCapacity(Integer soldierCapacity) {
		this.soldierCapacity = soldierCapacity;
	}

	public final Integer getNextID() {
		return nextID;
	}

	public final void setNextID(Integer nextID) {
		this.nextID = nextID;
	}

	public final String getPic() {
		return pic;
	}

	public final void setPic(String pic) {
		this.pic = pic;
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

	public final String getFunctionDesc() {
		return functionDesc;
	}

	public final void setFunctionDesc(String functionDesc) {
		this.functionDesc = functionDesc;
	}

	public final Integer getPremiseBuilding() {
		return premiseBuilding;
	}

	public final void setPremiseBuilding(Integer premiseBuilding) {
		this.premiseBuilding = premiseBuilding;
	}

	public final Integer getPremiseBuildingLevel() {
		return premiseBuildingLevel;
	}

	public final void setPremiseBuildingLevel(Integer premiseBuildingLevel) {
		this.premiseBuildingLevel = premiseBuildingLevel;
	}

	public String toString(){
		
		return StringUtils.toString(getClass(), this);
	}
}
