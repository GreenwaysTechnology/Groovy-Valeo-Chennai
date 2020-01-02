package com.valeo.json

import groovy.json.JsonSlurper;

//json represenation
def inputText = '{"name" : "Groovy", "year": 2005}'

def slurper=new JsonSlurper();
def obj=slurper.parseText(inputText);
println obj
println "${obj.name} ${obj.year}"