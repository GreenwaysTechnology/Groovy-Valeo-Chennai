package com.valeo.ds


def emptyMap = [:];
emptyMap.put('id', 'test')

def empDetails = [
	id:1,
	name:'Subramanian',
	salary:1000.89
];

empDetails.each { key, value ->
	println "$key - $value"
}
