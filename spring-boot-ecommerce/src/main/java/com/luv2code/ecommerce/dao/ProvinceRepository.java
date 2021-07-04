package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "provinces",path = "provinces")
public interface ProvinceRepository extends JpaRepository<Province,Integer> {
}
