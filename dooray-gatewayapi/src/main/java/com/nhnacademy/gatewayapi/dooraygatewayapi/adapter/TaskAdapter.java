package com.nhnacademy.gatewayapi.dooraygatewayapi.adapter;

import com.nhnacademy.gatewayapi.dooraygatewayapi.domain.TaskDto;
import com.nhnacademy.gatewayapi.dooraygatewayapi.domain.TaskRegisterRequest;
import java.util.List;

public interface TaskAdapter {

    List<TaskDto> getTaskDtosByProjectNo(Integer projectNo);

    void registerTask(TaskRegisterRequest request);
}
