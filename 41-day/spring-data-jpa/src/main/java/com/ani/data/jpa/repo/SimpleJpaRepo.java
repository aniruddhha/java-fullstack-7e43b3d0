package com.ani.data.jpa.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ani.data.jpa.domain.Mobile;

@Transactional
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

    Optional<Mobile> findByNumberAndLat(String mobile, Float lat);

    @Transactional
    @Modifying
    @Query(value = "insert into mobile (id, mob_num, lat, lng) values (?1, ?2, ?3, ?4)", nativeQuery = true)
    void custSave(Long id, String mobile, Float lat, Float lng);
}
