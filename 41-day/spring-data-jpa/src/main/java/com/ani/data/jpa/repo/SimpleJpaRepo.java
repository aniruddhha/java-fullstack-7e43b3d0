package com.ani.data.jpa.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ani.data.jpa.domain.Mobile;

public interface SimpleJpaRepo extends JpaRepository<Mobile, Long> {
    
    List<Mobile> findByNumberContaining(String num);

    Long countByNumber(String num);

    @Query("SELECT m FROM Mobile m") // jpql
    List<Mobile> findAllJPQL(); // method name is not that imporatant 

    @Query(value = "select * from mobile", nativeQuery = true ) // sql
    List<Mobile> findAllSQL();

    @Query(value = "select * from mobile where mob_num = :mobile", nativeQuery = true ) // sql
    Optional<Mobile> findOneWithMobile1(@Param("mobile") String mobile);

    @Query(value = "select * from mobile where mob_num = ?1", nativeQuery = true ) // sql
    Optional<Mobile> findOneWithMobile2(String mobile);

    @Query(value = "select m from Mobile m where m.number = ?1" ) // sql
    Optional<Mobile> findOneWithMobile3(String mobile);
}
