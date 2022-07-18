package yas.join.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yas.join.Entity.JoinEntity;

import java.util.List;

public interface JoinRepository extends JpaRepository<JoinEntity, Long> {
    //Optional<JoinEntity> findByUserAndTeam(UserEntity userEntity, TeamEntity team);

    List<JoinEntity> findByTeamId(Long teamId);
}
