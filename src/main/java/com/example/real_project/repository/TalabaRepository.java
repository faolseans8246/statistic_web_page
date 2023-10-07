package com.example.real_project.repository;

import com.example.real_project.tables.Talaba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TalabaRepository extends JpaRepository<Talaba, Long>, CrudRepository<Talaba, Long> {
}
