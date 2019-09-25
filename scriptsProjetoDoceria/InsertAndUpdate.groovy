
/*
     Adress,
     Customer,
     orderedItem,
     Product,
     PurchaseOrder,
     User
*/


def insertProduct = { String nome, String description, Double unitaryValue ->
    String result = "insert into product values (DEFAULT, '${nome}', '${description}','${unitaryValue}');"
    return result
}

def updateProduct = { String name, String description, Double unitaryValue, int id ->
    String result = "Update product SET name = '${name}', description = '${description}', unitaryValue = ${unitaryValue} where id = ${id};"
    return result
}

def insertAddress = { String street, int houseNumber, String complement, String neighborhood, int zipCode, String city, String state  ->
    String result = "insert into address values (DEFAULT,'${street}', ${houseNumber}, '${complement}', '${neighborhood}', ${zipCode}, '${city}', '${state}');"
    return result
}

def updateAdress = { String street, int houseNumber, String complement, String neighborhood, String zipCode, String city ->
    String result = "update address SET street = '${street}', houseNumber = ${houseNumber}, complement = '${complement}', neighborhood = '${neighborhood}',zipCode = ${zipCode}, city = '${city}', state = '${state}' where id = ${id};"
    return result
}

println insertProduct("Abobora", "Desc", 1.5)
// println updateProduct("Abobora mascavel", "Desc 2", 4.5, 1)