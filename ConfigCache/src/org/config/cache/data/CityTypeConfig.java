package org.config.cache.data;

import org.config.cache.StringArray;
import org.config.cache.core.IConfig;

/**
 * 城池类别配置表
 * @author chenjie
 * 2012-12-11
 */
public class CityTypeConfig implements IConfig {
	
	private Integer id; //类型ID
	private Integer level; //类型等级
	private String name; //类型名称
	private Integer woodRatio; //木材产出加成
	private Integer foodRatio; //粮食产出加成
	private Integer moneyRatio; //铜钱产出加成
	private Integer soliderRatio; //新兵产出加成
	
	@Override
	public void fromStringArray(StringArray values) {
		this.id = values.getInt();
		this.level = values.getInt();
		this.name = values.getString();
		this.woodRatio = values.getInt();
		this.foodRatio = values.getInt();
		this.moneyRatio = values.getInt();
		this.soliderRatio = values.getInt();
		
	}
	@Override
	public String getKey() {

		return this.id+"";
	}
	public final Integer getLevel() {
		return level;
	}
	public final void setLevel(Integer level) {
		this.level = level;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final Integer getWoodRatio() {
		return woodRatio;
	}
	public final void setWoodRatio(Integer woodRatio) {
		this.woodRatio = woodRatio;
	}
	public final Integer getFoodRatio() {
		return foodRatio;
	}
	public final void setFoodRatio(Integer foodRatio) {
		this.foodRatio = foodRatio;
	}
	public final Integer getMoneyRatio() {
		return moneyRatio;
	}
	public final void setMoneyRatio(Integer moneyRatio) {
		this.moneyRatio = moneyRatio;
	}
	public final Integer getSoliderRatio() {
		return soliderRatio;
	}
	public final void setSoliderRatio(Integer soliderRatio) {
		this.soliderRatio = soliderRatio;
	}
	public final void setId(Integer id) {
		this.id = id;
	}
	public final Integer getId() {
		return id;
	}



}
