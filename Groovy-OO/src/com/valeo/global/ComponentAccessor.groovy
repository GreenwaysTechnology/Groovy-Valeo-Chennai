package com.valeo.global



class TextBox {
	
	String getLabel() {
		return "Project ID";
	}
}

 class ComponentAccessor {

	static TextBox  getComponent(String componenClassName) {
		return new TextBox();
		
	}
}
