package com.SzMIS.sys.user.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EaysUiTreepojo {

	private String id;
	private String text;
	private String parent_id ;
	private String is_leaf ;
 
	private String v_icon_url ;
	private String iconCls ;
	private String i_is_adminmod;
	private String state;
	private Map attributes;
	private List<EaysUiTreepojo> children=new ArrayList<EaysUiTreepojo>(); //存储下级的集合
	
	public Map getAttributes() {
		return attributes;
	}
	public void setAttributes(Map attributes) {
		this.attributes = attributes;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getI_is_adminmod() {
		return i_is_adminmod;
	}
	public void setI_is_adminmod(String i_is_adminmod) {
		this.i_is_adminmod = i_is_adminmod;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public String getIs_leaf() {
		return is_leaf;
	}
	public void setIs_leaf(String is_leaf) {
		this.is_leaf = is_leaf;
	}
	public String getV_icon_url() {
		return v_icon_url;
	}
	public void setV_icon_url(String v_icon_url) {
		this.v_icon_url = v_icon_url;
	}
	public List<EaysUiTreepojo> getChildren() {
		return children;
	}
	public void setChildren(List<EaysUiTreepojo> children) {
		this.children = children;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
 
}
	 
