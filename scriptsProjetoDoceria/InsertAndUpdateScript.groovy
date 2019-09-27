def insertProduct = { String nome, String description, Double unitaryValue ->
    String result = "insert INTO product (name, description, unitaryValue) values ('${nome}', '${description}','${unitaryValue}');"
    return result
}
def updateProduct = { String name, String description, Double unitaryValue, int id ->1
    String result = "Update product SET name = '${name}', description = '${description}', unitaryValue = ${unitaryValue} where id = ${id};"
    return result
}

// println insertProduct("Torta holandesa", "Torta da holanda feita no Brasil", 3.50)
// println updateProduct("Torta gourmet holandesa", "Torta gourmet da holanda feita no Brasil", 5.50 , 3)

/* ---------------------------------------------------------------------------------------------- */

def insertAddress = { String street, String houseNumber, String complement, String neighborhood, String zipCode, String city, String state  ->
    String result = "INSERT INTO address (street, houseNumber, complement, neighborhood, zipCode, city, state) values ('${street}', '${houseNumber}', '${complement}', '${neighborhood}', '${zipCode}', '${city}', '${state}');"
    return result
}

def updateAddress = { String street, String houseNumber, String complement, String neighborhood, String zipCode, String city, String state, int id ->
    String result = "UPDATE address SET street = '${street}', houseNumber = '${houseNumber}', complement = '${complement}', neighborhood = '${neighborhood}',zipCode = '${zipCode}', city = '${city}', state = '${state}' where id = ${id};"
    return result
}

// println insertAddress("Rua Epaminondas", "41", "Complemento x", "Villa Aurora", "12323112", "indaiatuba", "Santa Catarina")
// println updateAddress("Rua Evandro moraees", "45", "Complemento x", "Villa Aurora", "12323112", "indaiatuba", "Santa Catarina", 5)

/* ---------------------------------------------------------------------------------------------- */

def insertCustomer = { String name, String cpf, String telephone, String email, int address_id ->
    String result = "INSERT INTO customer (name, cpf, telephone, email, address_id) values ( '${name}', '${cpf}', '${telephone}', '${email}', ${address_id});"
    return result
}

def updateCustomer = { String name, String cpf, String telephone, String email, int address_id, int id ->
    String result = "UPDATE customer SET name = '${name}', cpf = '${cpf}', telephone = '${telephone}', email = '${email}', address_id = ${address_id} where id = ${id};"
    return result
}

// println insertCustomer('João', '133331330', '3312-0898', 'email@teste.com', 1)
// println updateCustomer('João Vitor', '133331330', '3312-0898', 'email@teste.com', 1, 3)

/* ---------------------------------------------------------------------------------------------- */

def insertOrderedItem = { int amount, double totalValue, int product_id, int purchaseOrder_id ->
    String result = "insert INTO orderedItem (amount, totalValue, product_id, purchaseOrder_id) VALUES ( ${amount}, '${totalValue}', '${product_id}', '${purchaseOrder_id}');"
    return result
}

def updateOrderedItem = { int amount, double totalValue, int product_id, int purchaseOrder_id, int id->
    String result = "update orderedItem SET amount = ${amount}, totalValue = '${totalValue}', product_id = '${product_id}', purchaseOrder_id = '${purchaseOrder_id}' where id = ${id}";
    return result
}

// println insertOrderedItem(3, 4.50, 1, 1)
// println updateOrderedItem(3, 4.50, 1, 1, 3)

/* ---------------------------------------------------------------------------------------------- */

def insertUser = { String name, String email, String telephone, String userName, String password ->
    String result = "INSERT INTO user ( name, email, telephone, userName, password) VALUES ('${name}', '${email}', '${telephone}', '${userName}', '${password}');"
}

def updateUser = { String name, String email, String telephone, String userName, String password, int id ->
    String result = "UPDATE user SET name = '${name}', email = '${email}', telephone = '${telephone}', userName = '${userName}', password = '${password}' where id = ${id};"
    return result
}
// println insertUser('jbTeste', 'jb@teste', '1231321', 'jbarcella', '12312321')
// println updateUser('jbTeste123', 'jb@teste', '1231321', 'jbarcella', '12312321', 1)

/* ---------------------------------------------------------------------------------------------- */

def insertPurchaseOrder = { String createDate, String deliveryDate, boolean delivery, double orderValue, String formOfPayment, String status, String obs, int createdBy_id, int preparedBy_id, int customer_id ->
    String result = "insert INTO purchaseOrder (createDate, deliveryDate, delivery, orderValue, formOfPayment, status, obs, createBy_id, preparedBy_id, customer_id) VALUES ('${createDate}', '${deliveryDate}', ${delivery}, ${orderValue}, '${formOfPayment}', '${status}', '${obs}', '${createdBy_id}', '${preparedBy_id}', '${customer_id}');"
    return result
}

def updatePurchaseOrder = { String createDate, String deliveryDate, boolean delivery, double orderValue, String formOfPayment, String status, String obs, int createdBy_id, int preparedBy_id, int customer_id, int id ->
    String result = "update purchaseOrder SET createDate = '${createDate}', deliveryDate = '${deliveryDate}', delivery = ${delivery}, orderValue = ${orderValue}, formOfPayment = '${formOfPayment}', status = '${status}', obs = '${obs}', createBy_id = '${createdBy_id}', preparedBy_id = '${preparedBy_id}', customer_id = ${customer_id} where id = ${id};"
    return result
}

println insertPurchaseOrder('26-09-2019', '10-10-2020', true, 10.5, 'Cartao', 'Nova', 'Observaçao', 1, 2, 3)
println updatePurchaseOrder('28-10-2019', '29-10-2019', true, 10.5, 'Cartao', 'Nova', 'Observaçao', 1, 2, 3, 3)