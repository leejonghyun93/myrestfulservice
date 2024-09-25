package kr.co.jongconsulting.myrestfulservice.repository;

import kr.co.jongconsulting.myrestfulservice.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
