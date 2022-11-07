package com.seckill.web.service.impl;


import com.seckill.support.rpc.dto.SeckillActivityDTO;
import com.seckill.support.rpc.dto.base.Result;
import com.seckill.support.rpc.service.ActivityExportService;
import com.seckill.web.service.SeckillActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeckillActivityServiceImpl implements SeckillActivityService {
    @Autowired
    ActivityExportService activityExportService;

    @Override
    public Result<Integer> createActivity(SeckillActivityDTO activityDTO) {
        return activityExportService.createActivity(activityDTO);
    }
}
