package com.student.config;

import org.springframework.cloud.openfeign.FeignClient;

import com.school.controller.ISchoolController;

//@FeignClient(name="schoolserviceclient", url="http://localhost:8800")
@FeignClient(name="schoolserviceclient", url="schoolservice.student.svc.cluster.local")
public interface SchoolFeignClient extends ISchoolController {

}
