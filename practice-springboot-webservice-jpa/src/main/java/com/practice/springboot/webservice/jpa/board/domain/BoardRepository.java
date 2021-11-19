package com.practice.springboot.webservice.jpa.board.domain;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{

    // JPQL(JPA Query Language
    @Query(value = "select b from Board b where b.title like %?1% and b.id >= ?2 order by b.id")
    List<Board> findByTitleStartingWithAndIdGreaterThanEqualOrderByIdDescQuery(String title, Long id, Pageable paging);

    @Query(value = "select b from Board b where b.title like %:tit% and b.id >= :id order by b.id", nativeQuery = true)
    List<Board> findByTitleStartingWithAndIdGreaterThanEqualOrderByIdDescNativeQuery(@Param("tit") String title, @Param("id") Long id, Pageable paging);

    // paging
    List<Board> findByTitleStartingWithAndIdGreaterThanEqualOrderByIdDesc(String title, Long id, Pageable paging);
}
