package com.zbogdan.app.appchik.services

import com.zbogdan.app.appchik.repos.ProductCassandraRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class ProductCassandraService {

    @Autowired
    private lateinit var comp: ProductCassandraRepo

    @PostConstruct
    fun init() {
        println("Trying to retrieve from Cassandra...")
        println("All Products: ${comp.findAll()}")
    }
}