package com.cohen.scheduletracking.service;

import com.cohen.scheduletracking.entity.Department;

import java.util.List;

/**
 * 有关部门信息的业务类
 * 
 * @author 林金成
 *         2018年4月6日
 */
public interface DepartmentService {

    /**
     * 查询所有的部门信息
     */
    List<Department> getAllDepartment();
}
