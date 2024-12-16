package com.parking.parkinglot.ejb;

import com.parking.parkinglot.common.UserDto;
import com.parking.parkinglot.entities.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class UserBean {

        @PersistenceContext
        private EntityManager em;

        public List<UserDto> getUsers() {
            return em.createQuery("SELECT u FROM User u", UserDto.class).getResultList();
        }
}
