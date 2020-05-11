package com.sanskar.conferenceapp.repositories;

import com.sanskar.conferenceapp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository  extends JpaRepository<Session,Long> {

}
