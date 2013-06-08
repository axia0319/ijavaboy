package org.config.cache.data;

import org.config.cache.StringArray;
import org.config.cache.core.IConfig;
import org.config.cache.utils.StringUtils;

/**
 * 商城配置表
 * @author chenjie
 * 2012-12-12
 */
public class ShopItemConfig implements IConfig {

	private Integer id; //物品ID
	private String name; //名称
	private Integer price; //价格
	private Integer effect; //商品效果
	
	@Override
	public void fromStringArray(StringArray values) {
		
		this.id = values.getInt();
		this.name = values.getString();
		this.price = values.getInt();
		this.effect = values.getInt();
	}

	@Override
	public String getKey() {

		return this.id+"";
	}

	public final Integer getId() {
		return id;
	}

	public final void setId(Integer id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final Integer getPrice() {
		return price;
	}

	public final void setPrice(Integer price) {
		this.price = price;
	}

	public final Integer getEffect() {
		return effect;
	}

	public final void setEffect(Integer effect) {
		this.effect = effect;
	}


	public String toString(){
		
		return StringUtils.toString(getClass(), this);
	}
}
