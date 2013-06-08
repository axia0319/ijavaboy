package org.config.cache;

/**
 * ��������
 * @author chenjie
 * 2012-12-10
 */
public enum ConfigType {
	GLOBAL_CONFIG("Config"),
	DROP("DropTable"),
	MONSTER_GROUP("MonsterGroupTable"),
	MONSTER_REFRESH("MonsterRefreshTable"),
	SHOP("ShopTable"),
	MISSION("QuestTable"),
	ROLE_LEVEL("RoleLevelTable"),
	COUNTRY("CountryTable"),
	BUILDING_POSITION("BuildPositionTable"),
	CITY_ROUTE("CityRouteTable"),
	AREA("AreaTable"),
	CITY("CityTable"),
	CITY_TYPE("CityTypeTable"),
	ITEM("ItemTable"),
	BUILDING("BuildTable"),
	ITEMEXTEND("ItemExtendTable"),
	HERO("HeroTable"),
	;
	
	private String value;
	
	private ConfigType(String value) {
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
