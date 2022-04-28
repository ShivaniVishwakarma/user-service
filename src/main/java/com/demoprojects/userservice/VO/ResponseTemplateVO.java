package com.demoprojects.userservice.VO;

import com.demoprojects.userservice.entity.Department;
import com.demoprojects.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {

    private User user;
    private Department department;
}
