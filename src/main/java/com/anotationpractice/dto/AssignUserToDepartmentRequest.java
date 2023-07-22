package com.anotationpractice.dto;

public class AssignUserToDepartmentRequest {

    private Long userId;
    private Long deptId;

    public AssignUserToDepartmentRequest() {
    }

    public AssignUserToDepartmentRequest(Long userId, Long deptId) {
        this.userId = userId;
        this.deptId = deptId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
}
