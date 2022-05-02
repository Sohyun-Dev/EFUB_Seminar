package sohyun.seminar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sohyun.seminar.domain.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
