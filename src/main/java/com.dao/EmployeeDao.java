package com.dao;

import com.entity.EmployeeEntity;

public interface EmployeeDao {
    EmployeeEntity authenticate(String emailId, String password);
}
