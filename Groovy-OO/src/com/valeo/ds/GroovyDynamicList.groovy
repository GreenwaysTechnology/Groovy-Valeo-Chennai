package com.valeo.ds


class MyIssue{
	 int id;
	 String desc;
}

//arrayList by default
def nameList = ["Subramanian", "Ram" , "A", 'B'];

//Groovy offers an api to iterate
//nameList.each({name ->println "$name"})
//nameList.each {name ->println "$name" }

nameList.each {
	println it.equals("Ram") ? "You are Ram" : "You are not Ram"
};

def issueList = [
	new MyIssue(id:1, desc:"Id not available"),
	new MyIssue(id:2,desc:"Select control not WOrking"),
	new MyIssue(id:3,desc:"Checkbox control not WOrking"),
	new MyIssue(id:4, desc:"Radio button control not WOrking")
];

issueList.add(new MyIssue(id:5, desc:"Textbox button control not WOrking") )

issueList.each {
	println "${it.id} ${it.desc}"
}




