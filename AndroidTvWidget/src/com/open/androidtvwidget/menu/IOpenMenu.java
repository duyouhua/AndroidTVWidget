package com.open.androidtvwidget.menu;

import java.util.ArrayList;

public interface IOpenMenu {
	static final int NONE = 0;

	public IOpenMenuItem add(CharSequence title); // 添加菜单项.
	public OpenSubMenu addSubMenu(int pos, OpenSubMenu openSubMenu); // 添加子菜单到某个位置的菜单上.
	public OpenMenu setTextSize(int size); // 全局设置菜单字体.
	public ArrayList<IOpenMenuItem> getMenuDatas(); // 获取菜单数据.
}
