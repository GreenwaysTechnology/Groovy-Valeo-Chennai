package com.valeo.ts.scripts


def customerService=new CustomerService();
println customerService.findAll()
println customerService.findById(10);
println customerService.save();
println customerService.update();
println customerService.remove()