package org.koreait.repositories;

import org.koreait.entities.PostData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDataRepository extends JpaRepository<PostData, Long> {
}
